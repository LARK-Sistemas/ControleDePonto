package br.com.senai.fatesg.controleponto.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Funcionario {
	@Id
	@GeneratedValue(generator="funcionario_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="funcionario_seq", sequenceName="funcionario_seq", allocationSize=1, initialValue=1)
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
	
}
