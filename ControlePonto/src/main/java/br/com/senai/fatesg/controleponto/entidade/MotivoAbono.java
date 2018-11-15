package br.com.senai.fatesg.controleponto.entidade;


import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class MotivoAbono {
	
	@Id
	@GeneratedValue(generator = "motivoAbono_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "motivoAbono_seq", sequenceName = "motivoAbono_seq", allocationSize = 1, initialValue = 1)
	private Integer id;
	
	private String descricao;
	
	private String dataInicio;
	
	private String dataTermino;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getDataTermino() {
		return dataTermino;
	}
	public void setDataTermino(String dataTermino) {
		this.dataTermino = dataTermino;
	}
	
	
}
