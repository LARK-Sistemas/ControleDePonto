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
public class EmpresaControl {

	private Empresa empresa = new Empresa();

	@Autowired
	private EmpresaDao empresaDao;

	private List<Empresa> empresas = new ArrayList<>();

	@PostConstruct
	public void init() {
		listar(null);
	}

	public void gerarEmpresa(ActionEvent event) {
		try {
			empresa.setCnpj(Long.parseLong("11111111111111")); 	// 11.111.111/1111-11
			empresa.setRazaoSocial("Funcionarios Felizes LTDA");
			empresa.setNomeFantasia("Funcionários Felizes");
			empresa.setLogradouro("Rua do emprego");
			empresa.setNumero("123");
			empresa.setComplemento("Quadra A Lotes 1, 2 e 3");
			empresa.setBairro("Setor dos funcionários");
			empresa.setCidade("Goiânia");
			empresa.setEstado("Goiás");
			empresa.setCep("12123123"); 						// 12.123-123
			empresa.setInscricaoEstadual("22222222222");		
			empresa.setEmail("funcionarios@felizes.com");
			empresa.setTelefone("123456789012");				// XX XX XXXX-XXXX 
			empresa.setSite("www.funcionarios.com.br");
			empresa.setRedeSocial("facebook.com/empresaFeliz");
			empresa.setPorcentagemHorasExtras(Double.parseDouble("12"));
			empresas.add(empresa);
			empresaDao.incluir(empresa);
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e);
		}
	}

	
	public void confirmar(ActionEvent event) {
		try {
			empresaDao.alterar(empresa);
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
