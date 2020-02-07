package aula3;

public class ExemploThread {
	
	// Thread executada por Runnable
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                //código para executar em paralelo
            	System.out.println("Classe: " + Thread.currentThread().getClass());
                System.out.println("ID: " + Thread.currentThread().getId());
                System.out.println("Nome: " + Thread.currentThread().getName());
                System.out.println("Prioridade: " + Thread.currentThread().getPriority());
                System.out.println("Estado: " + Thread.currentThread().getState());
            }
        }).start();
    }
}
