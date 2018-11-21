package br.com.senai.fatesg.controleponto.controle.teste;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;

import org.junit.Test;

import br.com.senai.fatesg.controleponto.calculo.CalculoHoras;

public class TesteApontamentoHoras {
	
	@Test
	public void TesteApontamentoHoras() throws ParseException {
		CalculoHoras calc = new CalculoHoras();
		//double resultado = calc.apontamentoHoras(1, 08:30:10, 12:00:05, 13:12:03, 18:20:15);
		double resultado = calc.apontamentoHoras(1, "08:05:02", "12:00:05", "13:12:03", "18:10:00");
		assertEquals(0.0510, resultado, 0.0001);
	}

}
