package br.com.senai.fatesg.controleponto.entidade;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class JornadaTrabalho {

	@Id
	@GeneratedValue(generator = "jornadaTrabalho_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "jornadaTrabalho_seq", sequenceName = "jornadaTrabalho_seq", allocationSize = 1, initialValue = 1)
	private Integer id;

	private String descricao;
	
	private String[] diasDaSemana;

	private String inicioHorasDiaria;

	private String terminoHorasDiaria;

	private String inicioHorasIntervalo;

	private String terminoHorasIntervalo;

	private double horasSemanais;

	private double horasMensais;
	
	private String mostraDias = "";
	
	
	@ManyToOne
	@JoinColumn(name = "idFuncionario")
	private Funcionario funcionario;
		
	public JornadaTrabalho(Integer id, String descricao, String[] diasDaSemana, String inicioHorasDiaria,
			String terminoHorasDiaria, String inicioHorasIntervalo, String terminoHorasIntervalo, double horasSemanais,
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
	public JornadaTrabalho() {
		super();
		
	}
	
	
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public JornadaTrabalho(Integer id) {
		super();
		this.id = id;		
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
	public String getInicioHorasDiaria() {
		return inicioHorasDiaria;
	}
	public void setInicioHorasDiaria(String inicioHorasDiaria) {
		this.inicioHorasDiaria = inicioHorasDiaria;
	}
	public String getTerminoHorasDiaria() {
		return terminoHorasDiaria;
	}
	public void setTerminoHorasDiaria(String terminoHorasDiaria) {
		this.terminoHorasDiaria = terminoHorasDiaria;
	}
	public String getInicioHorasIntervalo() {
		return inicioHorasIntervalo;
	}
	public void setInicioHorasIntervalo(String inicioHorasIntervalo) {
		this.inicioHorasIntervalo = inicioHorasIntervalo;
	}
	public String getTerminoHorasIntervalo() {
		return terminoHorasIntervalo;
	}
	public void setTerminoHorasIntervalo(String terminoHorasIntervalo) {
		this.terminoHorasIntervalo = terminoHorasIntervalo;
	}
	
	
}
