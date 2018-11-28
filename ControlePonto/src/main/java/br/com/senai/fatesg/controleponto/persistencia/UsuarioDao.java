package br.com.senai.fatesg.controleponto.persistencia;

import java.util.List;

import javax.persistence.PersistenceException;

import br.com.ambientinformatica.jpa.persistencia.Persistencia;
import br.com.senai.fatesg.controleponto.entidade.Usuario;

public interface UsuarioDao extends Persistencia<Usuario>{

	Usuario consultarPorLogin(String login) throws PersistenceException;
	List<Usuario> consultarPorNome(String nomePessoa) throws PersistenceException;

}
