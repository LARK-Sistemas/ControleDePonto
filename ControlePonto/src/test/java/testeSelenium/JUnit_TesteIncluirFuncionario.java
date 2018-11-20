package testeSelenium;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import javax.xml.datatype.Duration;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import br.com.senai.fatesg.controleponto.controle.FuncionarioControl;
import br.com.senai.fatesg.controleponto.entidade.Funcionario;

@Transactional
public class JUnit_TesteIncluirFuncionario {
	
	@Autowired
	FuncionarioControl funcionarioControl = new FuncionarioControl();
	
	@Test
	public void incluirFuncionario() {
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("NOME TESTE");
		funcionario.setLogradouro("logradouro TESTE");
		funcionario.setNumero("numero TESTE");
		funcionario.setComplemento("complemento TESTE");
		funcionario.setBairro("bairro TESTE");
		funcionario.setCidade("cidade TESTE");
		funcionario.setEstado("estado TESTE");
		funcionario.setCep("cep TESTE");
		funcionario.setTelefone("telefone TESTE");
		funcionario.setCelular("celular TESTE");
		funcionario.setCpf("cpf TESTE");
		funcionario.setBancoHoras("bancoHoras TESTE");
		funcionario.setJornadaTrabalho(123);
		funcionario.setRfid("rfid TESTE");
		funcionario.setPapel("papel TESTE");
		
		assertNull(funcionario);
		System.out.println("Incluindo um Funcionario: " + funcionario.getNome());
		funcionarioControl.incluirFuncionario(funcionario);
		
		Funcionario funcionario2 = new Funcionario();
		
		
		funcionario2 = funcionarioControl.consultar(funcionario);
		
		System.out.println("Consulta Funcionario: " + funcionario2.getNome());
		assertEquals(funcionario, funcionario2);
		
	}/***
	@Test
	public void testAlterarFuncionario() {
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("NOME TESTE");
		funcionario.setLogradouro("logradouro TESTE");
		funcionario.setNumero("numero TESTE");
		funcionario.setComplemento("complemento TESTE");
		funcionario.setBairro("bairro TESTE");
		funcionario.setCidade("cidade TESTE");
		funcionario.setEstado("estado TESTE");
		funcionario.setCep("cep TESTE");
		funcionario.setTelefone("telefone TESTE");
		funcionario.setCelular("celular TESTE");
		funcionario.setCpf("cpf TESTE");
		funcionario.setBancoHoras("bancoHoras TESTE");
		funcionario.setJornadaTrabalho(123);
		funcionario.setRfid("rfid TESTE");
		funcionario.setPapel("papel TESTE");
		
		System.out.println("Incluindo uma funcionario: " + funcionario.getNome());
		funcionarioControl.alterar(funcionario);

		Funcionario funcionario2 = new Funcionario();
		funcionario2 = funcionarioControl.consultar(funcionario);
		System.out.println("Consulta Jornada: " + funcionario2.getNome());
		assertEquals(funcionario, funcionario2);
	}
	
	@Test
	public void testExcluirFuncionario() {
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("NOME TESTE 2");
		funcionario.setLogradouro("logradouro TESTE 2");
		funcionario.setNumero("numero TESTE 2");
		funcionario.setComplemento("complemento TESTE 2");
		funcionario.setBairro("bairro TESTE 2");
		funcionario.setCidade("cidade TESTE 2");
		funcionario.setEstado("estado TESTE 2");
		funcionario.setCep("cep TESTE 2");
		funcionario.setTelefone("telefone TESTE 2");
		funcionario.setCelular("celular TESTE 2");
		funcionario.setCpf("cpf TESTE 2");
		funcionario.setBancoHoras("bancoHoras TESTE 2");
		funcionario.setJornadaTrabalho(123);
		funcionario.setRfid("rfid TESTE 2");
		funcionario.setPapel("papel TESTE 2");
		

		System.out.println("Incluindo uma Funcionario: " + funcionario.getNome());
		funcionarioControl.alterar(funcionario);

		funcionarioControl.excluir(funcionario);

		assertNull(funcionarioControl.consultar(funcionario));
	} ***/
}
