package br.com.senai.fatesg.controleponto.controle.teste;

import static org.junit.Assert.*;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import br.com.senai.fatesg.controleponto.controle.JornadaTrabalhoControl;
import br.com.senai.fatesg.controleponto.entidade.JornadaTrabalho;

@Transactional
public class JornadaTrabalhoControlTest {

	@Autowired
	JornadaTrabalhoControl jornadaControl = new JornadaTrabalhoControl();
	// JornadaTrabalhoDaoJpa jornadaDao;

	@Test
	public void testIncluirJornada() {

		String[] dias = { "Segunda", "Terça" };
		JornadaTrabalho jornada = new JornadaTrabalho();
		// jornada.setId(7);
		jornada.setDescricao("Jornada de Teste");
		jornada.setDiasDaSemana(dias);
		jornada.setInicioHorasDiaria(08.00);
		jornada.setTerminoHorasDiaria(18.00);
		jornada.setInicioHorasIntervalo(12.00);
		jornada.setTerminoHorasIntervalo(14.00);
		jornada.setHorasSemanais(44.00);
		jornada.setHorasMensais(220.00);
		jornada.setMostraDias("");

		assertNotNull(jornada);
		System.out.println("Incluindo uma Jornada: " + jornada.getDescricao());
		jornadaControl.incluirJornada(jornada);

		JornadaTrabalho jornada2 = new JornadaTrabalho();

		jornada2 = jornadaControl.consultar(jornada);
		System.out.println("Consulta Jornada: " + jornada2.getDescricao());
		assertEquals(jornada, jornada2);

	}

	@Test
	public void testAlterarJornada() {
		String[] dias = { "Segunda", "Terça" };
		JornadaTrabalho jornada = new JornadaTrabalho();
		jornada.setId(7);
		jornada.setDescricao("Jornada de Teste 2");
		jornada.setDiasDaSemana(dias);
		jornada.setInicioHorasDiaria(08.00);
		jornada.setTerminoHorasDiaria(18.00);
		jornada.setInicioHorasIntervalo(12.00);
		jornada.setTerminoHorasIntervalo(14.00);
		jornada.setHorasSemanais(44.00);
		jornada.setHorasMensais(220.00);
		jornada.setMostraDias("");

		assertNotNull(jornada.getDescricao());
		System.out.println("Incluindo uma Jornada: " + jornada.getDescricao());
		jornadaControl.alterar(jornada);

		JornadaTrabalho jornada2 = new JornadaTrabalho();
		jornada2 = jornadaControl.consultar(jornada);
		System.out.println("Consulta Jornada: " + jornada2.getDescricao());
		assertEquals(jornada, jornada2);
	}

	@Test
	public void testExcluirJornada() {
		String[] dias = { "Segunda", "Terça" };
		JornadaTrabalho jornada = new JornadaTrabalho();
		// jornada.setId(7);
		jornada.setDescricao("Jornada de Teste 2");
		jornada.setDiasDaSemana(dias);
		jornada.setInicioHorasDiaria(08.00);
		jornada.setTerminoHorasDiaria(18.00);
		jornada.setInicioHorasIntervalo(12.00);
		jornada.setTerminoHorasIntervalo(14.00);
		jornada.setHorasSemanais(44.00);
		jornada.setHorasMensais(220.00);
		jornada.setMostraDias("");

		assertNotNull(jornada.getDescricao());
		System.out.println("Incluindo uma Jornada: " + jornada.getDescricao());
		jornadaControl.alterar(jornada);

		jornadaControl.excluir(jornada);

		assertNull(jornadaControl.consultar(jornada));
	}

}
