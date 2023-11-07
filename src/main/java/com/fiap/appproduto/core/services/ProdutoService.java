package com.fiap.appproduto.core.services;

import com.fiap.appproduto.core.entities.Produto;
import com.fiap.appproduto.core.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> GetAllProduto(){
        return produtoRepository.findAll();

    }

    public void CreateProduto(Produto produto){
        produtoRepository.save(produto);
    }

    public Iterable<Produto> GetProdutoByName(String name)
    {
        return produtoRepository.GetProdutoByName(name);
    }

    public void UpdateProduto(Produto produto) {produtoRepository.save(produto);}
}
