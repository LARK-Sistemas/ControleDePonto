package br.com.senai.fatesg.controleponto.entidade;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
//import br.com.senai.fatesg.controleponto.view.CheckboxDiasDaSemana;

@Entity
public class JornadaTrabalho {

	@Id
	@GeneratedValue(generator = "jornadaTrabalho_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "jornadaTrabalho_seq", sequenceName = "jornadaTrabalho_seq", allocationSize = 1, initialValue = 1)
	private Integer id;

	private String descricao;
	
	private String[] diasDaSemana ;

	private double inicioHorasDiaria;

	private double terminoHorasDiaria;

	private double inicioHorasIntervalo;

	private double terminoHorasIntervalo;

	private double horasSemanais;

	private double horasMensais;
	
	private String mostraDias = "";

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
		System.out.println("aqui " + diasDaSemana);
		this.diasDaSemana = diasDaSemana;

	}
	
	public double getInicioHorasDiaria() {
		return inicioHorasDiaria;
	}

	public void setInicioHorasDiaria(double inicioHorasDiaria) {
		this.inicioHorasDiaria = inicioHorasDiaria;
	}

	public double getTerminoHorasDiaria() {
		return terminoHorasDiaria;
	}

	public void setTerminoHorasDiaria(double terminoHorasDiaria) {
		this.terminoHorasDiaria = terminoHorasDiaria;
	}

	public double getInicioHorasIntervalo() {
		return inicioHorasIntervalo;
	}

	public void setInicioHorasIntervalo(double inicioHorasIntervalo) {
		this.inicioHorasIntervalo = inicioHorasIntervalo;
	}

	public double getTerminoHorasIntervalo() {
		return terminoHorasIntervalo;
	}

	public void setTerminoHorasIntervalo(double terminoHorasIntervalo) {
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