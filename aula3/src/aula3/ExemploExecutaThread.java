package aula3;

public class ExemploExecutaThread {
	  
    public static void main(String[] args) {
        //cria tres tarefas
        Tarefa t1 = new Tarefa(0, 1000);
        t1.setName("Tarefa1");
        Tarefa t2 = new Tarefa(1001, 2000);
        t2.setName("Tarefa2");
        Tarefa t3 = new Tarefa(2001, 3000);
        t3.setName("Tarefa3");
  
        //inicia a execucao paralela das tres tarefas, iniciando tres novas threads no programa
        t1.start();
        t2.start();
        t3.start();
  
        //aguarda a finalização das tarefas
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
  
        //Exibimos o somatório dos totalizadores de cada Thread
        System.out.println("Total: " + (t1.getTotal() + t2.getTotal() + t3.getTotal()));
    }
}
