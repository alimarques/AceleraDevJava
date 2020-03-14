//package com.codenation.aula6.component;
//
//import com.codenation.aula6.entity.Cliente;
//import com.codenation.aula6.service.ClienteService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class CommandLineAppStartupRunner implements CommandLineRunner {
//
//    @Autowired
//    ClienteService clienteService;
//
//    @Override
//    public void run(String... args){
//        this.criarCliente();
//    }
//
//    private void criarCliente(){
//
//        Cliente cliente1 = new Cliente();
//        Cliente cliente2 = new Cliente();
//        Cliente cliente3 = new Cliente();
//
//        cliente1.setNome("Ali Marques");
//        cliente1.setCpf("29586710593");
//
//        cliente2.setNome("Josiene");
//        cliente2.setCpf("19854302912");
//
//        cliente3.setNome("Taina");
//        cliente3.setCpf("94859403200");
//
//        clienteService.add(cliente1);
//        clienteService.add(cliente2);
//        clienteService.add(cliente3);
//    }
//
//}
