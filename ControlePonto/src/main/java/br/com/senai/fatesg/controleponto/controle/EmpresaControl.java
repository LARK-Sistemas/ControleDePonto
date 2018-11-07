package br.com.senai.fatesg.controleponto.controle;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.event.ActionEvent;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import br.com.ambientinformatica.ambientjsf.util.UtilFaces;
import br.com.senai.fatesg.controleponto.entidade.Empresa;
import br.com.senai.fatesg.controleponto.persistencia.EmpresaDao;

@Named("EmpresaControl")
@Scope("conversation")
public class EmpresaControl{
	
	private Empresa empresa = new Empresa();
	
	@Autowired
	private EmpresaDao empresaDao;
	
	private List<Empresa> empresas = new ArrayList<>();
	
	@PostConstruct
	public void init(){
	   listar(null);
	}
	
	public void confirmar(ActionEvent event) {
		try {
			empresaDao.alterar(empresa);
			empresa = new Empresa();
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e);
		}
	}
	
	public void listar(ActionEvent event) {
		try {
			empresas = empresaDao.listar();
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e);
		}
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public List<Empresa> getEmpresas() {
		return empresas;
	}
}
