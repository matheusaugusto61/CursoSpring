package com.example.testrest.resources;

import com.example.testrest.domain.Categoria;
import com.example.testrest.domain.Cliente;
import com.example.testrest.repositories.ClienteRepository;
import com.example.testrest.services.CategoriaService;
import com.example.testrest.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResources {

    @Autowired
    private ClienteService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id){
        Cliente obj = service.buscar(id);
        return ResponseEntity.ok().body(obj);
    }

}
