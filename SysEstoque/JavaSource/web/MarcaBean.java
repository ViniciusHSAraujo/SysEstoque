package web;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import entities.Marca;
import services.ServiceMarca;
import util.JSFUtils;

@RequestScoped
@Named
public class MarcaBean {

	private Marca marca;
	
	@EJB
	private ServiceMarca serviceMarca;
	
	private List<Marca> marcas;
	
	public MarcaBean() {
		this.marca = new Marca();
	}

	public Marca getMarca() {
		return marca;
	}

	public List<Marca> getMarcas() {
		if (this.marcas == null) {
			this.marcas = this.serviceMarca.listarMarca();
		}
		
		return marcas;
	}

	public void setMarcas(List<Marca> marcas) {
		this.marcas = marcas;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	public void cadastrarMarca() {
		try {
			this.serviceMarca.cadastrarMarca(marca);
			JSFUtils.enviarMensagemDeTexto("Marca cadastrada com sucesso!");
			this.marca = new Marca();
		} catch (Exception e) {
			JSFUtils.enviarMensagemDeAtencao(e.getMessage());
		}
	}

	public void excluirMarcas(Marca marca) {
			this.serviceMarca.excluirMarca(marca);
			JSFUtils.enviarMensagemDeTexto("Marca excluída com sucesso.");
	}
	
	public List<Marca> listarMarcas(){
		return this.serviceMarca.listarMarca();
	}
}
