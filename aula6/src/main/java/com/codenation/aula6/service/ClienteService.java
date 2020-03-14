package com.codenation.aula6.service;

import com.codenation.aula6.entity.Cliente;
import com.codenation.aula6.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente add(Object object){
        return clienteRepository.save((Cliente) object);
    }

    public Optional<Cliente> get(long id){
        return clienteRepository.findById(id);
    }

    public Cliente update(Object object){
        return clienteRepository.save((Cliente) object);
    }

    public long quantidadeClientes(){
        return clienteRepository.count();
    }

    public Optional<Cliente> findById(long id){
        return clienteRepository.findById(id);
    }

    public List<Cliente> findAll(){
        return clienteRepository.findAll();
    }


}
