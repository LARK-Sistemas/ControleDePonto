package br.com.senai.fatesg.controleponto.persistencia;

import org.springframework.stereotype.Repository;

import br.com.ambientinformatica.jpa.persistencia.PersistenciaJpa;
import br.com.senai.fatesg.controleponto.entidade.JornadaTrabalho;

@Repository("jornadaTrabalhoDao")
public class JornadaTrabalhoDaoJpa extends PersistenciaJpa<JornadaTrabalho> implements JornadaTrabalhoDao{

   private static final long serialVersionUID = 1L;

}
