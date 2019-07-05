package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import com.sun.istack.internal.NotNull;

/**
 * 
 * Classe que representa a marca do Produto.
 * 
 * @author Vinícius Araújo
 * @Entity -> Informa ao JSF que é uma ENTIDADE (e criar uma tabela no banco de
 *         dados).
 * 
 */
@Entity
public class Marca {

	@Id
	@SequenceGenerator(name = "CONTADOR_MARCAS", sequenceName = "NUM_SEQ_MARCA", allocationSize = 0)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CONTADOR_MARCAS")
	private Integer id;
	
	@NotNull
	private String nome;
	
	@NotNull
	private String descricao;
	
	public Marca() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
