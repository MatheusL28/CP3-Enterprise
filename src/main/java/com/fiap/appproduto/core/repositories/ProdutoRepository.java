package com.fiap.appproduto.core.repositories;

import com.fiap.appproduto.core.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    @Query("SELECT p FROM Produto p WHERE p.name LIKE %?1%")
    public Iterable<Produto> GetProdutoByName(String name);
}
