package web;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import entities.Produto;
import services.ServiceProduto;
import util.JSFUtils;

@RequestScoped
@Named
public class ProdutoBean {

	private Produto produto;
	
	@EJB
	private ServiceProduto serviceProduto;
	
	public ProdutoBean() {
		this.produto = new Produto();
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public void cadastrarProduto() {
		try {
			this.serviceProduto.cadastrarProduto(produto);
			JSFUtils.enviarMensagemDeTexto("Produto cadastrado com sucesso!");
			this.produto = new Produto();
		} catch (Exception e) {
			JSFUtils.enviarMensagemDeAtencao(e.getMessage());
		}
	}

	public void excluirProduto(Produto produto) {
			this.serviceProduto.excluirProduto(produto);
			JSFUtils.enviarMensagemDeTexto("Produto excluído com sucesso.");
	}
	
	public List<Produto> listarProduto(){
		return this.serviceProduto.listarProduto();
	}
	
}
