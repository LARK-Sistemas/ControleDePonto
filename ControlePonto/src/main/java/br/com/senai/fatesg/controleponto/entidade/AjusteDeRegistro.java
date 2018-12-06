package br.com.senai.fatesg.controleponto.entidade;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AjusteDeRegistro {
	
	@Id
	private Long id;	
	private String data;
	private String nomeFuncionario;
	private int codigoJornadaTrabalho;
	private String codigoRfid;
	private String primeiraEntrada;
	private String primeiraSaida;
	private String segundaEntrada;
	private String segundaSaida;
	private Long saldo;
	
	public AjusteDeRegistro() {
	}
		
	
	
	public AjusteDeRegistro(Long id, String data, String nomeFuncionario, int codigoJornadaTrabalho, String codigoRfid,
			String primeiraEntrada, String primeiraSaida, String segundaEntrada, String segundaSaida, Long saldo) {
		super();
		this.id = id;
		this.data = data;
		this.nomeFuncionario = nomeFuncionario;
		this.codigoJornadaTrabalho = codigoJornadaTrabalho;
		this.codigoRfid = codigoRfid;
		this.primeiraEntrada = primeiraEntrada;
		this.primeiraSaida = primeiraSaida;
		this.segundaEntrada = segundaEntrada;
		this.segundaSaida = segundaSaida;
		this.saldo = saldo;
	}



	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public int getCodigoJornadaTrabalho() {
		return codigoJornadaTrabalho;
	}
	public void setCodigoJornadaTrabalho(int codigoJornadaTrabalho) {
		this.codigoJornadaTrabalho = codigoJornadaTrabalho;
	}
	public String getCodigoRfid() {
		return codigoRfid;
	}
	public void setCodigoRfid(String codigoRfid) {
		this.codigoRfid = codigoRfid;
	}
	public String getPrimeiraEntrada() {
		return primeiraEntrada;
	}
	public void setPrimeiraEntrada(String primeiraEntrada) {
		this.primeiraEntrada = primeiraEntrada;
	}
	public String getPrimeiraSaida() {
		return primeiraSaida;
	}
	public void setPrimeiraSaida(String primeiraSaida) {
		this.primeiraSaida = primeiraSaida;
	}
	public String getSegundaEntrada() {
		return segundaEntrada;
	}
	public void setSegundaEntrada(String segundaEntrada) {
		this.segundaEntrada = segundaEntrada;
	}
	public String getSegundaSaida() {
		return segundaSaida;
	}
	public void setSegundaSaida(String segundaSaida) {
		this.segundaSaida = segundaSaida;
	}
	public Long getSaldo() {
		return saldo;
	}
	public void setSaldo(Long saldo) {
		this.saldo = saldo;
	}
	
	
}
