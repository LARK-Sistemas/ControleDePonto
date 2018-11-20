package br.com.senai.fatesg.controleponto.controle.calculo;

public class Calculo {
	public int adicionalNoturno(int horaInicio, int horaFim) {
		int totalAdicionalNoturno;	
		
		if(horaInicio>5 && horaInicio<22 && horaFim>5 && horaFim<22) {
			totalAdicionalNoturno = 0;
			System.out.println("Adicional Noturno: " + totalAdicionalNoturno);
			return totalAdicionalNoturno;
		}
		//inicio sem adicional noturno / fim com adicional noturno
		else if(horaInicio>5 && horaInicio<22 && (horaFim>=0 && horaFim<=5) || horaFim>=22 && horaFim<=23) {			
			if(horaFim>=0 && horaFim<=5) {
				totalAdicionalNoturno = 2+horaFim;
				//System.out.println("Adicional Noturno: " + totalAdicionalNoturno);
				return totalAdicionalNoturno;
			}
			else {
				totalAdicionalNoturno = horaFim-22;
				//System.out.println("Adicional Noturno: " + totalAdicionalNoturno);
				return totalAdicionalNoturno;
			}
						
		}
		//Adicional noturno no inicio da jornada, exemplo entra ás 4:00 e possui somente 1h noturna
		else if((horaInicio>=0 && horaInicio<=5 || horaInicio>=22 && horaInicio<=23) && horaFim>5 && horaFim<22) {
			if(horaInicio>=0 && horaInicio<=5) {
				totalAdicionalNoturno = 5-horaInicio;
				//System.out.println("Adicional Noturno: " + totalAdicionalNoturno);
				return totalAdicionalNoturno;
			}
			else {
				totalAdicionalNoturno = 24-horaInicio+5;
				//System.out.println("Adicional Noturno: " + totalAdicionalNoturno);
				return totalAdicionalNoturno;
			}
		}
		//Toda a jornada noturna
		else if((horaInicio>=0 && horaInicio<=5 || horaInicio>=22 && horaInicio<=23) && (horaFim>=0 && horaFim<=5 || horaFim>=22 && horaFim<=23)) {
			if(horaFim>=0 && horaFim<=5 && horaInicio>=0 && horaInicio<=5) {
				totalAdicionalNoturno = horaFim-horaInicio;
				//System.out.println("Adicional Noturno: " + totalAdicionalNoturno);
				return totalAdicionalNoturno;
			}
			else {
				totalAdicionalNoturno = horaFim+2;
				System.out.println("Adicional Noturno: " + totalAdicionalNoturno);
				return totalAdicionalNoturno;
			}
		}
		
		System.out.println("Errado");
		return 0;
	}
	
	//trocar horas por jornada travalhada
	//jornada de trabalho: 08:00 - 12:00 / 14:00 - 18:00
	// 2 horas de intervalo
	public int horaNoturna(int horaInicio, int intervaloInicio, int initervaloFim, int horaFim) {
		int totalHoraExtra =0;
		
		int entrada = 8-horaInicio;
		int intervalo = 2 - (initervaloFim-intervaloInicio);
		int saida = horaFim-18;
				
		if(entrada > 0.05) {
			totalHoraExtra = totalHoraExtra+entrada;			
		}
		if (intervalo > 0) {
			totalHoraExtra = totalHoraExtra+intervalo;			
		}
		if(saida > 0.05) {
			totalHoraExtra = totalHoraExtra+saida;			
		}
		System.out.println("Hora Extra: " + totalHoraExtra);
		return totalHoraExtra;		
	}
	public int atraso(int horaInicio, int intervaloInicio, int initervaloFim, int horaFim) {
		int atraso =0;
		
		int entrada = 8-horaInicio;
		int intervalo =2 - (initervaloFim-intervaloInicio);
		int saida = horaFim-18;
		
		if(entrada < -0.05) {
			atraso = atraso+entrada;			
		}
		if (intervalo < 0) {
			atraso = atraso+intervalo;			
		}
		if(saida < -0.05) {
			atraso = atraso+saida;			
		}
		System.out.println("Atraso: " +atraso);
		return atraso;		
	}
}
