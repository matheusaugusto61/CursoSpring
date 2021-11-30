package com.example.testrest.repositories;

import com.example.testrest.domain.Categoria;
import com.example.testrest.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {


}
