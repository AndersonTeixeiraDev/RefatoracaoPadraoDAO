/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.produto.service;

import br.com.ifba.vp.produto.model.bean.Produto;
import java.util.List;
/**
 *
 * @author andee
 */
public interface IServiceProduto {
 
    // Metodo que salva um produto na base de dados
    public abstract Produto saveProduto (Produto  produto );
    // Metodo que atualiza um Projeto de produto que já existe na base de dados
    public abstract Produto updateProduto  (Produto  produto);
    // Metodo que deleta um Projeto de produto da base de dados
    public abstract void deleteProduto  (Produto  produto);
    // Metodo que retorna todos os produtos da base de dados
    public abstract List<Produto> getAllProduto();
    // Metodo que busca um produto na base de dados através do código de barras
    public abstract Produto findByCodigoBarras(String CodBarras);
    // Metodo que busca um produto na base de dados através do nome
    public abstract Produto findByNomeProduto(String Nome);
    
}
