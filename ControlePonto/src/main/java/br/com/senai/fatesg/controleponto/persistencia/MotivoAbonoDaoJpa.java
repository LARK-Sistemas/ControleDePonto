package br.com.senai.fatesg.controleponto.persistencia;

import org.springframework.stereotype.Repository;

import br.com.ambientinformatica.jpa.persistencia.PersistenciaJpa;
import br.com.senai.fatesg.controleponto.entidade.MotivoAbono;

@Repository("motivoAbonoDao")
public class MotivoAbonoDaoJpa extends PersistenciaJpa<MotivoAbono> implements MotivoAbonoDao{

	private static final long serialVersionUID = 1L;
}
