package br.com.senai.fatesg.controleponto.entidade;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Empresa {
	
	@Id
	private long id;
	
	private long cnpj;
	private String razaoSocial;
	private String nomeFantasia;
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	private String inscricaoEstadual;
	private String email;
	private String fone;
	private String site;
	private String redeSocial;
	private Double porcentagemHorasExtras;
	
	
	
	public Empresa() {
		super();
	}

	public Empresa(long id, long cnpj, String razaoSocial, String nomeFantasia, String logradouro, String numero,
			String complemento, String bairro, String cidade, String estado, String cep, String inscricaoEstadual,
			String email, String fone, String site, String redeSocial, Double porcentagemHorasExtras) {
		super();
		this.id = id;
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.inscricaoEstadual = inscricaoEstadual;
		this.email = email;
		this.fone = fone;
		this.site = site;
		this.redeSocial = redeSocial;
		this.porcentagemHorasExtras = porcentagemHorasExtras;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getCnpj() {
		return cnpj;
	}
	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
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
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getRedeSocial() {
		return redeSocial;
	}
	public void setRedeSocial(String redeSocial) {
		this.redeSocial = redeSocial;
	}
	public Double getPorcentagemHorasExtras() {
		return porcentagemHorasExtras;
	}
	public void setPorcentagemHorasExtras(Double porcentagemHorasExtras) {
		this.porcentagemHorasExtras = porcentagemHorasExtras;
	}

	
	
}
