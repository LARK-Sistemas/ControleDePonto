package br.com.senai.fatesg.controleponto.controle;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.event.ActionEvent;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import br.com.ambientinformatica.ambientjsf.util.UtilFaces;
import br.com.senai.fatesg.controleponto.entidade.JustificativaAbono;
import br.com.senai.fatesg.controleponto.persistencia.JustificativaAbonoDao;

@Named("JustificativaAbonoControl")
@Scope("conversation")
public class JustificativaAbonoControl {

	private JustificativaAbono justificativaAbono = new JustificativaAbono();
	
	@Autowired
	private JustificativaAbonoDao justificativaAbonoDao;
	
	private List<JustificativaAbono> justificativaAbonos = new ArrayList<JustificativaAbono>();
	
	@PostConstruct
	   public void init(){
	      listar(null);
	   }
	
	public void incluir(ActionEvent evt){
		try {
			justificativaAbonoDao.alterar(justificativaAbono);
         listar(evt);
         justificativaAbono = new JustificativaAbono();
		} catch (Exception e) {
		   UtilFaces.addMensagemFaces(e);
		}
	}
	
	public void listar(ActionEvent evt){
		try {
			justificativaAbonos = justificativaAbonoDao.listar();
		} catch (Exception e) {
		   UtilFaces.addMensagemFaces(e);
		}
	}
	
	
	public JustificativaAbono getJustificativaAbono() {
		return justificativaAbono;
	}

	public void setJustificativaAbono(JustificativaAbono justificativaAbono) {
		this.justificativaAbono = justificativaAbono;
	}
	
	public List<JustificativaAbono> getJustificativaAbonos() {
		return justificativaAbonos;
	}
}
