package aula3;

public class Tarefa extends Thread {
	  
    private final long valorInicial;
    private final long valorFinal;
    private long total = 0;
  
    //metodo construtor que recebera os parametros da tarefa
    public Tarefa(int valorInicial, int valorFinal) {
        this.valorInicial = valorInicial;
        this.valorFinal = valorFinal;
    }
  
    //método que retorna o total calculado
    public long getTotal() {
        return total;
    }
  
    /*
     Este método se faz necessário para que possamos dar start() na Thread 
     e iniciar a tarefa em paralelo
     */
    @Override
    public void run() {
        for (long i = valorInicial; i <= valorFinal; i++) {
            total += i;
        }
    }
}
