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
import br.com.senai.fatesg.controleponto.entidade.JornadaTrabalho;
import br.com.senai.fatesg.controleponto.persistencia.FuncionarioDao;
import br.com.senai.fatesg.controleponto.persistencia.JornadaTrabalhoDao;

@Named("FuncionarioControl")
@Scope("conversation")
public class FuncionarioControl {
	
	private Funcionario funcionario = new Funcionario();
	
	@Autowired
	private FuncionarioDao funcionarioDao;
	
	private JornadaTrabalhoDao jornadaTrabalhoDao;

	private List<JornadaTrabalho> jornadasTrabalhos = new ArrayList<JornadaTrabalho>();
	private List<Funcionario> funcionarios = new ArrayList<Funcionario>();
	private List<String> funcionariosMotivoAbono = new ArrayList<String>();
	
	@PostConstruct
	public void init(){
		preencherFuncionarios();
	    listar(null);
	}
	
	private void preencherFuncionarios() {
		// TODO Auto-generated method stub
		funcionarios = funcionarioDao.listar();
		for (int i = 0; i < funcionarios.size(); i++) {
			if(!funcionarios.isEmpty()) {
				funcionariosMotivoAbono.add(funcionarios.get(i).getNome());
			}
				
				
		}
	}
	
	public void confirmar(ActionEvent evt){
		try {
			//funcionario.mostraJornada();
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

	public FuncionarioDao getFuncionarioDao() {
		return funcionarioDao;
	}

	public void setFuncionarioDao(FuncionarioDao funcionarioDao) {
		this.funcionarioDao = funcionarioDao;
	}

	public JornadaTrabalhoDao getJornadaTrabalhoDao() {
		return jornadaTrabalhoDao;
	}

	public void setJornadaTrabalhoDao(JornadaTrabalhoDao jornadaTrabalhoDao) {
		this.jornadaTrabalhoDao = jornadaTrabalhoDao;
	}

	public List<JornadaTrabalho> getJornadasTrabalhos() {
		return jornadasTrabalhos;
	}

	public void setJornadasTrabalhos(List<JornadaTrabalho> jornadasTrabalhos) {
		this.jornadasTrabalhos = jornadasTrabalhos;
	}

	

	public List<String> getFuncionariosMotivoAbono() {
		return funcionariosMotivoAbono;
	}

	public void setFuncionariosMotivoAbono(List<String> funcionariosMotivoAbono) {
		this.funcionariosMotivoAbono = funcionariosMotivoAbono;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	
}


