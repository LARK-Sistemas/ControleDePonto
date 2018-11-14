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
	private String endereco;
	private String inscricaoEstadual;
	private String email;
	private String telefone;
	private String siteLink;
	private String redeSocial;
	private Double porcentagemHorasExtras;

	
	public Empresa(long id, long cnpj, String razaoSocial, String nomeFantasia, String endereco,
			String inscricaoEstadual, String email, String telefone, String siteLink, String redeSocial,
			Double porcentagemHorasExtras) {
		super();
		this.id = id;
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.endereco = endereco;
		this.inscricaoEstadual = inscricaoEstadual;
		this.email = email;
		this.telefone = telefone;
		this.siteLink = siteLink;
		this.redeSocial = redeSocial;
		this.porcentagemHorasExtras = porcentagemHorasExtras;
	}

	public Empresa() {}


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


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
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


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getSiteLink() {
		return siteLink;
	}


	public void setSiteLink(String siteLink) {
		this.siteLink = siteLink;
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
