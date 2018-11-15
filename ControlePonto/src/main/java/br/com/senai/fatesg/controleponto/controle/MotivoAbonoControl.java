package br.com.senai.fatesg.controleponto.controle;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.event.ActionEvent;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import br.com.ambientinformatica.ambientjsf.util.UtilFaces;
import br.com.senai.fatesg.controleponto.entidade.MotivoAbono;
import br.com.senai.fatesg.controleponto.persistencia.MotivoAbonoDao;

@Named("MotivoAbonoControl")
@Scope("conversation")
public class MotivoAbonoControl {
	
	private MotivoAbono motivoAbono = new MotivoAbono();
	
	@Autowired
	private MotivoAbonoDao MotivoAbonoDao;
	
	private List<MotivoAbono> motivosAbonos = new ArrayList<MotivoAbono>();
	
	@PostConstruct
	public void init() {
		listar(null);
	}
	
	public void confirmar(ActionEvent evt) {
		try {
			MotivoAbonoDao.alterar(motivoAbono);
			listar(evt);
			motivoAbono = new MotivoAbono();
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e);
		}
	}
	
	public void excluir(ActionEvent evt) {
		try {
			MotivoAbonoDao.excluirPorId(motivoAbono.getId());
			listar(evt);
			motivoAbono = new MotivoAbono();
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e);
		}
	}
	
	public void listar(ActionEvent evt) {
		try {
			motivosAbonos = MotivoAbonoDao.listar();
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e);
		}
	}

	public MotivoAbono getMotivoAbono() {
		return motivoAbono;
	}

	public void setMotivoAbono(MotivoAbono motivoAbono) {
		this.motivoAbono = motivoAbono;
	}

	public MotivoAbonoDao getMotivoAbonoDao() {
		return MotivoAbonoDao;
	}

	public void setMotivoAbonoDao(MotivoAbonoDao motivoAbonoDao) {
		MotivoAbonoDao = motivoAbonoDao;
	}

	public List<MotivoAbono> getMotivosAbonos() {
		return motivosAbonos;
	}

	public void setMotivosAbonos(List<MotivoAbono> motivosAbonos) {
		this.motivosAbonos = motivosAbonos;
	}
	
	
}
