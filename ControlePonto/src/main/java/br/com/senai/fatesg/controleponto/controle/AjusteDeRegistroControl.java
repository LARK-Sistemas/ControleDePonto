package br.com.senai.fatesg.controleponto.controle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Named;

import org.primefaces.event.CellEditEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import br.com.ambientinformatica.ambientjsf.util.UtilFaces;
import br.com.senai.fatesg.controleponto.entidade.AjusteDeRegistro;
import br.com.senai.fatesg.controleponto.persistencia.AjusteDeRegistroDao;

@Named("AjusteDeRegistroControl")
@Scope("conversation")
public class AjusteDeRegistroControl {
	
	private AjusteDeRegistro ajusteDeRegistro = new AjusteDeRegistro();
	
	@Autowired
	private AjusteDeRegistroDao ajusteDeRegistroDao;
	
	private List<AjusteDeRegistro> ajusteDeRegistros = new ArrayList<AjusteDeRegistro>();
	 private static final Map<Long, AjusteDeRegistro> registroMap = new HashMap<Long, AjusteDeRegistro>();
	@PostConstruct
	public void init() {
		
		listar(null);
	}
	
		
	public void confirmar(ActionEvent evt) {
		try {
			ajusteDeRegistroDao.alterar(ajusteDeRegistro);
			listar(evt);
			ajusteDeRegistro = new AjusteDeRegistro();
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e);
		}
	}
	
	public void atualizar() {
		try {
			ajusteDeRegistroDao.getEntityManager().createNamedQuery("");
			ajusteDeRegistro = new AjusteDeRegistro();
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e);
		}
	}
	
	public void listar(ActionEvent evt) {
		try {
			ajusteDeRegistros = ajusteDeRegistroDao.listar();
			
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e);
		}
	}	
	
	public void listarPorId(int id) {
		try {
			setAjusteDeRegistros(ajusteDeRegistroDao.listar(id));
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e);
		}
	}
	
	public void onCellEdit(CellEditEvent event) {
        Object oldValue = event.getOldValue();
        Object newValue = event.getNewValue();
         
        if(newValue != null && !newValue.equals(oldValue)) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cell Changed", "Old: " + oldValue + ", New:" + newValue);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
	}

	public List<AjusteDeRegistro> getAjusteDeRegistros() {
		return ajusteDeRegistros;
	}

	public void setAjusteDeRegistros(List<AjusteDeRegistro> ajusteDeRegistros) {
		this.ajusteDeRegistros = ajusteDeRegistros;
	}

	public AjusteDeRegistro getAjusteDeRegistro() {
		return ajusteDeRegistro;
	}

	public void setAjusteDeRegistro(AjusteDeRegistro ajusteDeRegistro) {
		this.ajusteDeRegistro = ajusteDeRegistro;
	}

	public AjusteDeRegistroDao getAjusteDeRegistroDao() {
		return ajusteDeRegistroDao;
	}

	public void setAjusteDeRegistroDao(AjusteDeRegistroDao ajusteDeRegistroDao) {
		this.ajusteDeRegistroDao = ajusteDeRegistroDao;
	}

	public static Map<Long, AjusteDeRegistro> getRegistromap() {
		return registroMap;
	}
	
	
}
