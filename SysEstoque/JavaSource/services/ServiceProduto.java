package services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Produto;

/**
 * Classe de serviços para o {@link Produto}.
 * 
 * @author Vinícius Henrique Santos Araújo
 *
 */
@Stateless
public class ServiceProduto {

	@PersistenceContext
	private EntityManager em;

	/**
	 * Método que cadastra uma nova marca no banco de dados.
	 * 
	 * @param marca: marcas a ser cadastrado
	 */
	public void cadastrarProduto(Produto produto) {
		this.em.persist(produto);
	}
	
	/**
	 * Método que lista os clientes cadastrados no banco de dados.
	 * 
	 * @return uma lista com todos os pacientes.
	 */
	public List<Produto> listarProduto() {
		return this.em.createQuery("SELECT p FROM Produto p", Produto.class).getResultList();
	}

	/**
	 * Método que exclui uma marca do banco de dados
	 * @param marca
	 */
	public void excluirProduto(Produto produto) {
		this.em.remove(this.em.merge(produto));
	}
	
	/**
	 * Método que busca um produto pela descrição.
	 * @param produto
	 * @return
	 */
	public List<Produto> listarPacientesPorCPF(Produto produto) {
		return this.em.createQuery("SELECT p FROM Produto p where p.nome=:p1", Produto.class)
				.setParameter("p1", produto.getNome()).getResultList();
	}

}
