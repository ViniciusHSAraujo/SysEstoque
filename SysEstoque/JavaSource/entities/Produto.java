package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Min;

import com.sun.istack.internal.NotNull;

/**
 * 
 * Classe que representa a um Produto.
 * 
 * @author Vinícius Araújo
 * @Entity -> Informa ao JSF que é uma ENTIDADE (e criar uma tabela no banco de
 *         dados).
 * 
 */
@Entity
public class Produto {

	@Id
	@SequenceGenerator(name = "CONTADOR_PRODUTOS", sequenceName = "NUM_SEQ_PRODUTO", allocationSize = 0)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CONTADOR_PRODUTOS")
	private Integer id;
	
	@JoinColumn(name = "fk_marca")
	@ManyToOne
	@NotNull
	private Marca marca;
	
	@NotNull
	private String nome;
	
	@Min (value = 0, message = "Valor inválido! O valor deve ser acima de R$0,00")
	@NotNull
	private Double valor;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
}
