/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.fornecedor.service;

import br.com.ifba.vp.fornecedor.model.bean.Fornecedor;

import java.util.List;
/**
 *
 * @author andee
 */
public interface IServiceFornecedor {
 
    // Metodo que salva um Fornecedor na base de dados
    public abstract Fornecedor saveFornecedor (Fornecedor  fornecedor );
    // Metodo que atualiza um Fornecedor que já existe na base de dados
    public abstract Fornecedor updateFornecedor  (Fornecedor  fornecedor);
    // Metodo que deleta um Fornecedor da base de dados
    public abstract void deleteFornecedor  (Fornecedor  fornecedor);
    // Metodo que retorna todos os Fornecedores da base de dados
    public abstract List<Fornecedor> getAllFornecedor();
    // Metodo que busca um Fornecedor na base de dados através do CNPJ
    public abstract Fornecedor findByCNPJ(String CNPJ);
    
}
