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
		//gerarEmpresa();
		listar(null);
	}

	public void gerarEmpresa() {
		try {
			empresa.setCnpj(Long.parseLong("11111111111111")); 	// 11.111.111/1111-11
			empresa.setRazaoSocial("Funcionarios Felizes LTDA");
			empresa.setNomeFantasia("Funcionários Felizes");
			empresa.setLogradouro("Rua do emprego");
			empresa.setNumero("11");
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

	public void consultarEmpresa(ActionEvent event) {
		try {
			empresas = empresaDao.listar();
			empresa.setRazaoSocial(empresas.get(0).getRazaoSocial());
			empresa.setNomeFantasia(empresas.get(0).getNomeFantasia());
			empresa.setCnpj(empresas.get(0).getCnpj());
			empresa.setLogradouro(empresas.get(0).getLogradouro());
			empresa.setNumero(empresas.get(0).getNumero());
			empresa.setComplemento(empresas.get(0).getComplemento());
			empresa.setBairro(empresas.get(0).getBairro());
			empresa.setCidade(empresas.get(0).getCidade());
			empresa.setEstado(empresas.get(0).getEstado());
			empresa.setCep(empresas.get(0).getCep());
			empresa.setInscricaoEstadual(empresas.get(0).getInscricaoEstadual());
			empresa.setEmail(empresas.get(0).getEmail());
			empresa.setTelefone(empresas.get(0).getTelefone());
			empresa.setSite(empresas.get(0).getSite());
			empresa.setRedeSocial(empresas.get(0).getRedeSocial());
			empresa.setPorcentagemHorasExtras(empresas.get(0).getPorcentagemHorasExtras());
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e);
		}
	}
	
	public void confirmar(ActionEvent event) {
		try {
			empresaDao.alterar(empresa);
			listar(event);
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
