package br.com.senai.fatesg.controleponto.controle;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.event.ActionEvent;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import br.com.ambientinformatica.ambientjsf.util.UtilFaces;
import br.com.senai.fatesg.controleponto.entidade.Funcionario;
import br.com.senai.fatesg.controleponto.persistencia.FuncionarioDao;

@Named("FuncionarioControl")
@Scope("conversation")
public class FuncionarioControl {
	
	private Funcionario funcionario = new Funcionario();
	
	@Autowired
	private FuncionarioDao funcionarioDao;
	
	private List<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	@PostConstruct
	public void init(){
	      listar(null);
	}
	
	public void confirmar(ActionEvent evt){
		try {
			funcionarioDao.alterar(funcionario);
         listar(evt);
         funcionario = new Funcionario();
		} catch (Exception e) {
		   UtilFaces.addMensagemFaces(e);
		}
	}
	
	public void excluir(ActionEvent evt) {
		try {
			funcionarioDao.excluirPorId(funcionario.getId());
			listar(evt);
			funcionario = new Funcionario();
		}catch(Exception e) {
			UtilFaces.addMensagemFaces(e);
		}
	}

	public void listar(ActionEvent evt){
		try {
			funcionarios = funcionarioDao.listar();
		} catch (Exception e) {
		   UtilFaces.addMensagemFaces(e);
		}
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	
}


