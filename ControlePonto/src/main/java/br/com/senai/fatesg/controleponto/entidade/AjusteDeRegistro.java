package br.com.senai.fatesg.controleponto.entidade;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AjusteDeRegistro {
	
	@Id
	private Long id;
	
	private String nome;
	private String cpf;
	private Date data;
	private int codigoJornadaTrabalho;
	private long codigoRfid;
	private Date primeiraEntrada;
	private Date primeiraSaida;
	private Date segundaEntrada;
	private Date segundaSaida;
	private Long saldo;
	public AjusteDeRegistro() {
		super();
	}
	public AjusteDeRegistro(Long id, String nome, String cpf, Date data, int codigoJornadaTrabalho, long codigoRfid,
			Date primeiraEntrada, Date primeiraSaida, Date segundaEntrada, Date segundaSaida, Long saldo) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.data = data;
		this.codigoJornadaTrabalho = codigoJornadaTrabalho;
		this.codigoRfid = codigoRfid;
		this.primeiraEntrada = primeiraEntrada;
		this.primeiraSaida = primeiraSaida;
		this.segundaEntrada = segundaEntrada;
		this.segundaSaida = segundaSaida;
		this.saldo = saldo;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public int getCodigoJornadaTrabalho() {
		return codigoJornadaTrabalho;
	}
	public void setCodigoJornadaTrabalho(int codigoJornadaTrabalho) {
		this.codigoJornadaTrabalho = codigoJornadaTrabalho;
	}
	public long getCodigoRfid() {
		return codigoRfid;
	}
	public void setCodigoRfid(long codigoRfid) {
		this.codigoRfid = codigoRfid;
	}
	public Date getPrimeiraEntrada() {
		return primeiraEntrada;
	}
	public void setPrimeiraEntrada(Date primeiraEntrada) {
		this.primeiraEntrada = primeiraEntrada;
	}
	public Date getPrimeiraSaida() {
		return primeiraSaida;
	}
	public void setPrimeiraSaida(Date primeiraSaida) {
		this.primeiraSaida = primeiraSaida;
	}
	public Date getSegundaEntrada() {
		return segundaEntrada;
	}
	public void setSegundaEntrada(Date segundaEntrada) {
		this.segundaEntrada = segundaEntrada;
	}
	public Date getSegundaSaida() {
		return segundaSaida;
	}
	public void setSegundaSaida(Date segundaSaida) {
		this.segundaSaida = segundaSaida;
	}
	public Long getSaldo() {
		return saldo;
	}
	public void setSaldo(Long saldo) {
		this.saldo = saldo;
	}
	
	
}
