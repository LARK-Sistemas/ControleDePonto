package br.com.senai.fatesg.controleponto.entidade;

/*import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;*/
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

//import org.primefaces.model.UploadedFile;

@Entity
public class JustificativaAbono {

	@Id
	@GeneratedValue(generator="justificativaAbono_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="justificativaAbono_seq", sequenceName="justificativaAbono_seq", allocationSize=1, initialValue=1)
	private Integer id;
	
	private String titulo;
	private String descricao;
	private String anexoDocumentos;
	//private UploadedFile anexoDocumento;
	private String horasDiariaInicio;
	private String horasDiariaTermino;
	private String dataInicio;
	private String dataTermino;
	private String status;
	
	//GETTERS
	public Integer getId() {return id;}									//ID
	public String getTitulo() {return titulo;}							//TITULO
	public String getDescricao() {return descricao;}					//DESCRICAO
	public String getAnexoDocumentos(){return anexoDocumentos;}
	//public UploadedFile getAnexoDocumento() {return anexoDocumento;}	//ANEXO DOCUMENTOS
	public String getHorasDiariaInicio() {return horasDiariaInicio;}	//HORAS DIARIAS INICIO
	public String getHorasDiariaTermino() {return horasDiariaTermino;}	//HORAS DIARIAS TERMINO
	public String getDataInicio() {return dataInicio;}					//DATA INICIO
	public String getDataTermino() {return dataTermino;}				//DATA TERMINO
	public String getStatus() {return status;}							//STATUS
	
	//SETTERS
	public void setId(Integer id) {this.id = id;}																	//ID
	public void setTitulo(String titulo) {this.titulo = titulo;}													//TITULO
	public void setDescricao(String descricao) {this.descricao = descricao;}										//DESCRICAO
	public void setAnexoDocumentos(String anexoDocumentos) {this.anexoDocumentos = anexoDocumentos;}
	//public void setAnexoDocumento(UploadedFile anexoDocumento) {this.anexoDocumento = anexoDocumento;}			    //ANEXO DOCUMENTOS
	public void setHorasDiariaInicio(String horasDiariaInicio) {this.horasDiariaInicio = horasDiariaInicio;}		//HORAS DIARIAS INICIO
	public void setHorasDiariaTermino(String horasDiariaTermino) {this.horasDiariaTermino = horasDiariaTermino;}	//HORAS DIARIAS TERMINO
	public void setDataInicio(String dataInicio) {this.dataInicio = dataInicio;}									//DATA INICIO
	public void setDataTermino(String dataTermino) {this.dataTermino = dataTermino;}								//DATA TERMINO
	public void setStatus(String status) {this.status = status;}													//STATUS
	
	/*public void upload() {
        if(anexoDocumento != null) {
            FacesMessage message = new FacesMessage("Sucesso", anexoDocumento.getFileName() + " foi enviado.");
            FacesContext.getCurrentInstance().addMessage(null, message);
        }
    }*/
}
