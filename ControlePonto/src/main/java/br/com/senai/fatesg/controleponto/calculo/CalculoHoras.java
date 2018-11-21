package br.com.senai.fatesg.controleponto.calculo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.senai.fatesg.controleponto.entidade.JornadaTrabalho;

public class CalculoHoras {
	
	public double apontamentoHoras(Integer codigoJornadaTrabalho, String primeiraEntrada, String primeiraSaida, String segundaEntrada, String SegundaSaida) throws ParseException{
		
		JornadaTrabalho jornada = new JornadaTrabalho(codigoJornadaTrabalho);
		
		
		jornada.getId();
		System.out.println("jornada: "+jornada.getId());
		
		
		
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");						
		//double horasDiaria = jornada.getHorasSemanais()/jornada.getDiasDaSemana().length;
		double horasSemanais = jornada.getHorasSemanais();
		
		
		
		
		System.out.println("horasSemanais: " +horasSemanais);
		double diaSemana = jornada.getDiasDaSemana().length;
		System.out.println("DiasSemanas: "+diaSemana);
		double horasDiaria = jornada.getHorasSemanais()/jornada.getDiasDaSemana().length;
		
		Date date1 = format.parse(primeiraEntrada);		
		Date date2 = format.parse(primeiraSaida);		
		Date date3 = format.parse(segundaEntrada);		
		Date date4 = format.parse(SegundaSaida);
		
		System.out.println("primeiraEntrada: "+date1);
		System.out.println("primeiraSaida: "+date2);
		System.out.println("segundaEntrada: "+date3);
		System.out.println("segundaSaida: "+date4);
		
		//double saldo1 = date1.getTime() + date2.getTime();
		
		double saldo = (date1.getTime() + date2.getTime()) + (date3.getTime() + date4.getTime());
		System.out.println("saldo: "+saldo);
		double resultado = horasDiaria-saldo;
		
		
		System.out.println("horasDiaria: "+horasDiaria);
		
		System.out.println("resultado: "+resultado);
		
		return resultado;
		
	}
}
