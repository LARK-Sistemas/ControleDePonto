package br.com.senai.fatesg.controleponto.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import br.com.ambientinformatica.jpa.persistencia.PersistenciaJpa;
import br.com.senai.fatesg.controleponto.entidade.AjusteDeRegistro;

@Repository("AjusteDeRegistroDao")
public class AjusteDeRegistroDaoJpa extends PersistenciaJpa<AjusteDeRegistro> implements AjusteDeRegistroDao {
	private static final long serialVersionUID = 1L;

	public void teste(AjusteDeRegistro ajusteDeRegistro) {
		// TODO Auto-generated method stub
		EntityManager entityManager;
		
	}

	
}
