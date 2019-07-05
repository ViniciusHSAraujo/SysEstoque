package services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Marca;

/**
 * Classe de serviços para a {@link Marca}.
 * 
 * @author Vinícius Henrique Santos Araújo
 *
 */
@Stateless
public class ServiceMarca {

	@PersistenceContext
	private EntityManager em;

	/**
	 * Método que cadastra uma nova marca no banco de dados.
	 * 
	 * @param marca: marcas a ser cadastrado
	 */
	public void cadastrarMarca(Marca marca) {
		this.em.persist(marca);
	}
	
	/**
	 * Método que lista os clientes cadastrados no banco de dados.
	 * 
	 * @return uma lista com todos os pacientes.
	 */
	public List<Marca> listarMarca() {
		return this.em.createQuery("SELECT m FROM Marca m", Marca.class).getResultList();
	}

	/**
	 * Método que exclui uma marca do banco de dados
	 * @param marca
	 */
	public void excluirMarca(Marca marca) {
		this.em.remove(this.em.merge(marca));
	}

}
