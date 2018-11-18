package br.com.senai.fatesg.controleponto.controle;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.event.ActionEvent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import br.com.ambientinformatica.ambientjsf.util.UtilFaces;
import br.com.senai.fatesg.controleponto.entidade.JornadaTrabalho;
import br.com.senai.fatesg.controleponto.persistencia.JornadaTrabalhoDao;


@Named("JornadaTrabalhoControl")
@Scope("conversation")
public class JornadaTrabalhoControl {
	

	private JornadaTrabalho jornadaTrabalho = new JornadaTrabalho();
	
	@Autowired
	private JornadaTrabalhoDao jornadaTrabalhoDao;

	private List<JornadaTrabalho> jornadasTrabalhos = new ArrayList<JornadaTrabalho>();

	private List<String> diasSemana = new ArrayList<String>();

	@PostConstruct
	public void init() {

		preencherDiasDaSemana();
		listar(null);
	}

	private void preencherDiasDaSemana() {
		// TODO Auto-generated method stub
		
		diasSemana.add("Segunda");
		diasSemana.add("Terça");
		diasSemana.add("Quarta");
		diasSemana.add("Quinta");
		diasSemana.add("Sexta");
		diasSemana.add("Sabádo");
		diasSemana.add("Domingo");
	}

	public void confirmar(ActionEvent evt) {
		try {
			jornadaTrabalho.mostraDias();
			jornadaTrabalhoDao.alterar(jornadaTrabalho);
			listar(evt);
			jornadaTrabalho = new JornadaTrabalho();
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e);
		}
	}
	
	public void confirmarTeste(JornadaTrabalho jornada) {
		try {
			jornadaTrabalho.mostraDias();
			jornadaTrabalhoDao.alterar(jornada);
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e);
		}
	}
	
	public void incluirJornada(JornadaTrabalho jornada) {
		try {
			System.out.println("Jornada é: "+ jornada.getDescricao());
			jornadaTrabalhoDao.incluir(jornada);
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e.getLocalizedMessage());
		}
	}
	
	public void alterar(JornadaTrabalho jornada) {
		try {
			System.out.println("Jornada é: "+ jornada.getDescricao());
			jornadaTrabalhoDao.alterar(jornada);
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e.getLocalizedMessage());
		}
	}
	
	public JornadaTrabalho consultar(JornadaTrabalho jornada) {
		try {
			return jornadaTrabalho = jornadaTrabalhoDao.consultar(jornada);
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e);
		}
		return jornadaTrabalho;
	}
	
	public void excluir(ActionEvent evt) {
		try {
			jornadaTrabalhoDao.excluirPorId(jornadaTrabalho.getId());
			listar(evt);
			jornadaTrabalho = new JornadaTrabalho();
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e);
		}
	}
	
	public void excluir(JornadaTrabalho jornada) {
		try {
			jornadaTrabalhoDao.excluirPorId(jornada.getId());
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e);
		}
	}
	
	public void listar(ActionEvent evt) {
		try {
			jornadasTrabalhos = jornadaTrabalhoDao.listar();
			
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e);
		}
	}

	public JornadaTrabalho getJornadaTrabalho() {
		return jornadaTrabalho;
	}

	public void setJornadaTrabalho(JornadaTrabalho jornadaTrabalho) {
		this.jornadaTrabalho = jornadaTrabalho;
	}

	public List<JornadaTrabalho> getJornadaTrabalhos() {
		return jornadasTrabalhos;
	}
	// tst

	public List<String> getDiasSemana() {
		return diasSemana;
	}

	public void setDiasSemana(List<String> diasSemana) {
		this.diasSemana = diasSemana;
	}

	public List<JornadaTrabalho> getJornadasTrabalhos() {
		return jornadasTrabalhos;
	}

	public void setJornadasTrabalhos(List<JornadaTrabalho> jornadasTrabalhos) {
		this.jornadasTrabalhos = jornadasTrabalhos;
	}

	
	
}
