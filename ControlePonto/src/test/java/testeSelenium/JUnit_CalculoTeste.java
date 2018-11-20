package testeSelenium;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.senai.fatesg.controleponto.controle.calculo.Calculo;

public class JUnit_CalculoTeste {

	@Test
	public void AdicionalNoturnotest() {
		Calculo junit = new Calculo();
		int resultado = junit.adicionalNoturno(22, 5);		
		assertEquals(7, resultado);
		
	}
	//jornada de trabalho: 08:00 - 12:00 / 14:00 - 18:00
	@Test
	public void HoraExtraTest() {
		Calculo junit = new Calculo();
		int resultado = junit.horaNoturna(7, 12, 13, 19);
		assertEquals(3, resultado);
	}
	//jornada de trabalho: 08:00 - 12:00 / 14:00 - 18:00
	@Test
	public void Atraso() {
		Calculo junit = new Calculo();
		int resultado = junit.atraso(9, 12, 15, 18);
		assertEquals(-2, resultado);
	}
	
	
}
