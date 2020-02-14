package aula4.mock;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PessoaTeste {

	@Test
	public void deveriaCriarUmLogQuandoUmaPessoaForExcluida()
	           throws Exception {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Alexandre");
		
		LogMock nossoLogMock = new LogMock();
		PessoaController pessoaController = new PessoaController(nossoLogMock);
		pessoaController.exclui(pessoa);
	
		assertEquals(pessoa.getNome(), nossoLogMock.getNome());
	}
	
}
