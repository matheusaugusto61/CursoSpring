package com.example.testrest.services;

import com.example.testrest.domain.Categoria;
import com.example.testrest.domain.Cliente;
import com.example.testrest.repositories.CategoriaRepository;
import com.example.testrest.repositories.ClienteRepository;
import com.example.testrest.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repo;

    public Cliente buscar(Integer id){
        Optional<Cliente> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
    }
}
