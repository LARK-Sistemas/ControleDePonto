package br.com.senai.fatesg.controleponto.entidade;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class JustificativaAbono {

	@Id
	@GeneratedValue(generator="justificativaAbono_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="justificativaAbono_seq", sequenceName="justificativaAbono_seq", allocationSize=1, initialValue=1)
	private Integer id;
	
	private String titulo;
	private String descricao;
	//@Lob
	//private byte[] anexoDocumento;
	private String anexoDocumento;
	private String horasDiariaInicio;
	private String horasDiariaTermino;
	private String dataInicio;
	private String dataTermino;
	private String status;
	@Temporal(TemporalType.DATE)
	private Date data;
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "justificativasAbonos")
	private List<Funcionario> funcionarios;
	
	@ManyToOne
	private Usuario usuarioLogado = new Usuario();
	
	public Date getData() {return data;	}
	public void setData(Date data) {this.data = data;}
	public List<Funcionario> getFuncionarios() {return funcionarios;}
	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	//GETTERS
	public Integer getId() {return id;}									//ID
	public String getTitulo() {return titulo;}							//TITULO
	public String getDescricao() {return descricao;}					//DESCRICAO
	public String getanexoDocumento() {return anexoDocumento;}
	//public byte[] getAnexoDocumento(){return anexoDocumento;}			//ANEXO DOCUMENTOS
	public String getHorasDiariaInicio() {return horasDiariaInicio;}	//HORAS DIARIAS INICIO
	public String getHorasDiariaTermino() {return horasDiariaTermino;}	//HORAS DIARIAS TERMINO
	public String getDataInicio() {return dataInicio;}					//DATA INICIO
	public String getDataTermino() {return dataTermino;}				//DATA TERMINO
	public String getStatus() {return status;}							//STATUS
	
	//SETTERS
	public void setId(Integer id) {this.id = id;}																	//ID
	public void setTitulo(String titulo) {this.titulo = titulo;}													//TITULO
	public void setDescricao(String descricao) {this.descricao = descricao;}										//DESCRICAO
	public void setAnexoDocumento(String anexoDocumento) {this.anexoDocumento = anexoDocumento;}
	//public void setAnexoDocumento(byte[] anexoDocumento) {this.anexoDocumento = anexoDocumento;}		   			//ANEXO DOCUMENTOS
	public void setHorasDiariaInicio(String horasDiariaInicio) {this.horasDiariaInicio = horasDiariaInicio;}		//HORAS DIARIAS INICIO
	public void setHorasDiariaTermino(String horasDiariaTermino) {this.horasDiariaTermino = horasDiariaTermino;}	//HORAS DIARIAS TERMINO
	public void setDataInicio(String dataInicio) {this.dataInicio = dataInicio;}									//DATA INICIO
	public void setDataTermino(String dataTermino) {this.dataTermino = dataTermino;}								//DATA TERMINO
	public void setStatus(String status) {this.status = status;}													//STATUS
	public Usuario getUsuarioLogado() {
		return usuarioLogado;
	}
	public void setUsuarioLogado(Usuario usuarioLogado) {
		this.usuarioLogado = usuarioLogado;
	}
	
	
}
