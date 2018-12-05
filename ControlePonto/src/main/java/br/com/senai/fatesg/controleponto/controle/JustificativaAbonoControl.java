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
import br.com.senai.fatesg.controleponto.entidade.Usuario;
import br.com.senai.fatesg.controleponto.persistencia.JustificativaAbonoDao;

@Named("JustificativaAbonoControl")
@Scope("conversation")
public class JustificativaAbonoControl {

	private JustificativaAbono justificativaAbono = new JustificativaAbono();
	
	@Autowired
	private JustificativaAbonoDao justificativaAbonoDao;
	 
	private List<JustificativaAbono> justificativaAbonos = new ArrayList<JustificativaAbono>();
	private Integer id;
	  
	@PostConstruct
	   public void init(){
	      listar(null);
	   }
	
	public void buscarJustificativa(ActionEvent evt) {
		System.out.println(id);
		justificativaAbonos = justificativaAbonoDao.listar();
		for (int i = 0; i < justificativaAbonos.size(); i++) {
			if(justificativaAbonos.get(i).getId() == id) {
				justificativaAbono.setId(justificativaAbonos.get(i).getId());
				justificativaAbono.setTitulo(justificativaAbonos.get(i).getTitulo());
				justificativaAbono.setDescricao(justificativaAbonos.get(i).getDescricao());
				justificativaAbono.setHorasDiariaInicio(justificativaAbonos.get(i).getHorasDiariaInicio());
				justificativaAbono.setHorasDiariaTermino(justificativaAbonos.get(i).getHorasDiariaTermino());
				justificativaAbono.setDataInicio(justificativaAbonos.get(i).getDataInicio());
				justificativaAbono.setDataTermino(justificativaAbonos.get(i).getDataTermino());
				justificativaAbono.setStatus(justificativaAbonos.get(i).getStatus());
				justificativaAbono.setData(justificativaAbonos.get(i).getData());
				justificativaAbono.setUsuarioLogado(justificativaAbonos.get(i).getUsuarioLogado());
			}
		}
		
	}
	public void incluir(ActionEvent evt){
		try {
			Usuario usuarioLogado = UsuarioLogadoControl.getUsuarioLogado();
			justificativaAbono.setUsuarioLogado(usuarioLogado);
			justificativaAbonoDao.incluir(justificativaAbono);
			listar(evt);
         justificativaAbono = new JustificativaAbono();
		} catch (Exception e) {
		   UtilFaces.addMensagemFaces(e);
		}
	}
	public void alterar(ActionEvent evt) {
		try {
			justificativaAbonoDao.alterar(justificativaAbono);
			listar(evt);
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

	public JustificativaAbonoDao getJustificativaAbonoDao() {
		return justificativaAbonoDao;
	}

	public void setJustificativaAbonoDao(JustificativaAbonoDao justificativaAbonoDao) {
		this.justificativaAbonoDao = justificativaAbonoDao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setJustificativaAbonos(List<JustificativaAbono> justificativaAbonos) {
		this.justificativaAbonos = justificativaAbonos;
	}
	
	

//	public static Usuario getUsuarioLogado() {
//		return (Usuario) UtilFaces.getObjetoManagedBean("#{UsuarioLogadoControl.usuario}");
//	}
}
