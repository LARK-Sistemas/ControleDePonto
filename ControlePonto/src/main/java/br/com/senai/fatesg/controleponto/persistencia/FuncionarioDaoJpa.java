package br.com.senai.fatesg.controleponto.persistencia;

import org.springframework.stereotype.Repository;

import br.com.ambientinformatica.jpa.persistencia.PersistenciaJpa;
import br.com.senai.fatesg.controleponto.entidade.Funcionario;

@Repository("funcionarioDao")
public class FuncionarioDaoJpa  extends PersistenciaJpa<Funcionario> implements FuncionarioDao{

	private static final long serialVersionUID = 1L;
}
