package com.codenation.aula6.controller;

import com.codenation.aula6.entity.Cliente;
import com.codenation.aula6.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping("/cliente")
    public ResponseEntity<Cliente> addCliente(@RequestBody Cliente cliente){
        try{
            return new ResponseEntity<>(clienteService.add(cliente), HttpStatus.CREATED);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/cliente/{id}")
    public ResponseEntity<Optional<Cliente>> getCliente(@PathVariable(value = "id") long id){
        try{
            Optional<Cliente> pessoa = clienteService.findById(id);
            if(pessoa.isPresent()){
                return new ResponseEntity<>(clienteService.get(id), HttpStatus.OK);
            }
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/cliente/{id}")
    public ResponseEntity<Cliente> updateCliente(@RequestBody Cliente cliente, @PathVariable(value = "id") long id){
        try{
            Optional<Cliente> pessoa = clienteService.findById(id);
            if(pessoa.isPresent()){
                cliente.setId(pessoa.get().getId());
                return new ResponseEntity<>(clienteService.update(cliente), HttpStatus.OK);
            }
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }catch(Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/quantidadeClientes")
    public long qtdeCliente(){
        return clienteService.quantidadeClientes();
    }

    @GetMapping("/cliente")
    public ResponseEntity<List<Cliente>> getCliente(){
        try{
            return new ResponseEntity<>(clienteService.findAll(), HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

}
