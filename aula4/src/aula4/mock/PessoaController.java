package aula4.mock;

public class PessoaController {
	 
    private Pessoa pessoa;
    private GeradorDeLog log;
 
    public PessoaController(GeradorDeLog log) {
        this.pessoa = new Pessoa();
        this.log = log;
    }
 
    public void exclui(Pessoa pessoa) {
        pessoa.exclui(pessoa);
        log.criaLog(pessoa.getNome());
    }
}
