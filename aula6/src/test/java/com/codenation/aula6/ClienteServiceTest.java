//package com.codenation.aula6;
//
//import com.codenation.aula6.entity.Cliente;
//import com.codenation.aula6.service.ClienteService;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.transaction.annotation.Transactional;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//@SpringBootTest
//@Transactional
//public class ClienteServiceTest {
//
//    @Autowired
//    ClienteService clienteServiceTest;
//
//    @Test
//    void addClienteComSucesso(){
//        Cliente cliente = new Cliente();
//        cliente.setNome("Ali");
//        cliente.setCpf("12345678910");
//
//        Cliente clienteSalvo = clienteServiceTest.add(cliente);
//
//        assertThat(clienteSalvo).isNotNull();
//    }
//
//    @Test
//    public void getUserByID(){
//        Cliente cliente = new Cliente();
//        cliente.setNome("Ali");
//        cliente.setCpf("12345678910");
//
//        clienteServiceTest.add(cliente);
//
//        Cliente found = clienteServiceTest.get(cliente.getId());
//
//        assertThat(found.getNome()).isEqualTo(cliente.getNome());
//    }
//
//    @Test
//    public void contaQuantosClientesNoBanco(){
//        Cliente cliente = new Cliente();
//        cliente.setNome("Ali");
//        cliente.setCpf("12345678910");
//
//        clienteServiceTest.add(cliente);
//
//        long quantidade = clienteServiceTest.quantidadeClientes();
//
//        assertThat(quantidade).isEqualTo(4);
//    }
//
//}
