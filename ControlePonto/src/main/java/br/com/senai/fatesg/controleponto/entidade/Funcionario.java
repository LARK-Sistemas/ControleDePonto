package br.com.senai.fatesg.controleponto.entidade;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Funcionario {
	@Id
	@GeneratedValue(generator = "funcionario_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "funcionario_seq", sequenceName = "funcionario_seq", allocationSize = 1, initialValue = 1)
	private Integer id;

	private String nome;

	private String logradouro;

	private String numero;

	private String complemento;

	private String bairro;

	private String cidade;

	private String estado;

	private String cep;

	private String telefone;

	private String celular;

	private String cpf;

	private String bancoHoras;

	private Integer jornadaTrabalho;

	private String rfid;

	private String papel;

	private String status;
	
	//private int horasDiarias;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "funcionario")
	private List<JornadaTrabalho> jornadasDeTrabalho;
	
	
	private String[] jornada;
	
	private String mostraJornada = "";
	
	@ManyToMany(cascade = { 
	        CascadeType.PERSIST, 
	        CascadeType.MERGE
	    },
		//mappedBy = "funcionarios",
	        targetEntity = JustificativaAbono.class
	)
	    @JoinTable(name = "RegistroJustificativa",
	        joinColumns = @JoinColumn(name = "idFuncionario"),
	        inverseJoinColumns = @JoinColumn(name = "idJustificativaAbono")
	    )
	private List<JustificativaAbono> justificativasAbonos;

	
	
	
	public String getMostraJornada() {
		return mostraJornada;
	}
	
	public void mostraJornada()
	{
		for (int i = 0; i < jornada.length; i++) {
			System.out.println(jornada[i]);
			mostraJornada+=jornada[i];
		}
		
	}
	
	public void setMostraJornada(String mostraJornada) {
		this.mostraJornada = mostraJornada;
	}

	public String[] getJornada() {
		return jornada;
	}

	public void setJornada(String[] jornada) {
		this.jornada = jornada;
	}

	public List<JornadaTrabalho> getJornadasDeTrabalho() {
		return jornadasDeTrabalho;
	}

	public void setJornadasDeTrabalho(List<JornadaTrabalho> jornadasDeTrabalho) {
		this.jornadasDeTrabalho = jornadasDeTrabalho;
	}

	public List<JustificativaAbono> getJustificativasAbonos() {
		return justificativasAbonos;
	}

	public void setJustificativasAbonos(List<JustificativaAbono> justificativasAbonos) {
		this.justificativasAbonos = justificativasAbonos;
	}

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

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getBancoHoras() {
		return bancoHoras;
	}

	public void setBancoHoras(String bancoHoras) {
		this.bancoHoras = bancoHoras;
	}

	public Integer getJornadaTrabalho() {
		return jornadaTrabalho;
	}

	public void setJornadaTrabalho(Integer jornadaTrabalho) {
		this.jornadaTrabalho = jornadaTrabalho;
	}

	public String getRfid() {
		return rfid;
	}

	public void setRfid(String rfid) {
		this.rfid = rfid;
	}

	public String getPapel() {
		return papel;
	}

	public void setPapel(String papel) {
		this.papel = papel;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	/*public int getHorasDiarias() {
		return horasDiarias;
	}

	public void setHorasDiarias(int horasDiarias) {
		this.horasDiarias = horasDiarias;
	}*/

}
