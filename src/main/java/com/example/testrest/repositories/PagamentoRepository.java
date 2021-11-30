package com.example.testrest.repositories;

import com.example.testrest.domain.Categoria;
import com.example.testrest.domain.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {


}
