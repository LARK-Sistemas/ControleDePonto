package br.com.senai.fatesg.controleponto.persistencia;

import org.springframework.stereotype.Repository;

import br.com.ambientinformatica.jpa.persistencia.PersistenciaJpa;
import br.com.senai.fatesg.controleponto.entidade.JustificativaAbono;

@Repository("justificativaAbonoDao")
public class JustificativaAbonoDaoJpa extends PersistenciaJpa<JustificativaAbono> implements JustificativaAbonoDao{

   private static final long serialVersionUID = 1L;
}
