package br.com.senai.fatesg.controleponto.entidade;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class JornadaTrabalho {

	@Id
	@GeneratedValue(generator = "jornadaTrabalho_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "jornadaTrabalho_seq", sequenceName = "jornadaTrabalho_seq", allocationSize = 1, initialValue = 1)
	private Integer id;

	private String descricao;
	
	private String[] diasDaSemana ;

	private Date inicioHorasDiaria;

	private Date terminoHorasDiaria;

	private Date inicioHorasIntervalo;

	private Date terminoHorasIntervalo;

	private double horasSemanais;

	private double horasMensais;
	
	private String mostraDias = "";
	
	

	public JornadaTrabalho() {
		super();
		
	}
	public JornadaTrabalho(Integer id) {
		super();
		this.id = id;		
	}
	
	
	
	public JornadaTrabalho(Integer id, String descricao, String[] diasDaSemana, Date inicioHorasDiaria,
			Date terminoHorasDiaria, Date inicioHorasIntervalo, Date terminoHorasIntervalo, double horasSemanais,
			double horasMensais, String mostraDias) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.diasDaSemana = diasDaSemana;
		this.inicioHorasDiaria = inicioHorasDiaria;
		this.terminoHorasDiaria = terminoHorasDiaria;
		this.inicioHorasIntervalo = inicioHorasIntervalo;
		this.terminoHorasIntervalo = terminoHorasIntervalo;
		this.horasSemanais = horasSemanais;
		this.horasMensais = horasMensais;
		this.mostraDias = mostraDias;
	}



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

	public String[] getDiasDaSemana() {
		return diasDaSemana;
	}
	
	public void mostraDias()
	{
		for (int i = 0; i < diasDaSemana.length; i++) {
			mostraDias+=diasDaSemana[i] + ", ";
		}
		
	}
	

	public String getMostraDias() {
		return mostraDias;
	}

	public void setMostraDias(String mostraDias) {
		this.mostraDias = mostraDias;
	}

	public void setDiasDaSemana(String[] diasDaSemana) {
		this.diasDaSemana = diasDaSemana;

	}
	
	public Date getInicioHorasDiaria() {
		return inicioHorasDiaria;
	}

	public void setInicioHorasDiaria(Date inicioHorasDiaria) {
		this.inicioHorasDiaria = inicioHorasDiaria;
	}

	public Date getTerminoHorasDiaria() {
		return terminoHorasDiaria;
	}

	public void setTerminoHorasDiaria(Date terminoHorasDiaria) {
		this.terminoHorasDiaria = terminoHorasDiaria;
	}

	public Date getInicioHorasIntervalo() {
		return inicioHorasIntervalo;
	}

	public void setInicioHorasIntervalo(Date inicioHorasIntervalo) {
		this.inicioHorasIntervalo = inicioHorasIntervalo;
	}

	public Date getTerminoHorasIntervalo() {
		return terminoHorasIntervalo;
	}

	public void setTerminoHorasIntervalo(Date terminoHorasIntervalo) {
		this.terminoHorasIntervalo = terminoHorasIntervalo;
	}

	public double getHorasSemanais() {
		return horasSemanais;
	}

	public void setHorasSemanais(double horasSemanais) {
		this.horasSemanais = horasSemanais;
	}

	public double getHorasMensais() {
		return horasMensais;
	}

	public void setHorasMensais(double horasMensais) {
		this.horasMensais = horasMensais;
	}
	
}
