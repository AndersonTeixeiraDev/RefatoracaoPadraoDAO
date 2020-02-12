/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.infraestructure.service;

import br.com.ifba.vp.produto.model.bean.Produto;
import br.com.ifba.vp.cliente.model.bean.Cliente;
import br.com.ifba.vp.fornecedor.model.bean.Fornecedor;
import br.com.ifba.vp.funcionario.model.bean.Funcionario;
import br.com.ifba.vp.funcionario.model.bean.FuncionarioCaixa;
import java.util.List;

/**
 *
 * @author andee
 */
public interface IFachada {
    
      //---------------- Produtos ---------------------//
    
    // Metodo que salva um Produto na base de dados
    public abstract Produto saveProduto (Produto produto);
    // Metodo que atualiza um Produto que já existe na base de dados
    public abstract Produto updateProduto (Produto produto);
    // Metodo que deleta um Produto da base de dados
    public abstract void deleteProduto(Produto produto);
    // Metodo que retorna todos os Grupo de Pesquisa da base de dados
    public abstract List<Produto> getAllProduto();
    // Metodo que busca um Produto na base de dados através do nome
    public abstract Produto findByNomeProduto(String Nome);
   
    
    //---------------- Clientes ---------------------//
    
    // Metodo que salva um Cliente na base de dados
    public abstract Cliente saveCliente (Cliente cliente);
    // Metodo que atualiza um Cliente que já existe na base de dados
    public abstract Cliente updateCliente (Cliente cliente);
    // Metodo que deleta um Cliente da base de dados
    public abstract void deleteCliente(Cliente cliente);
    // Metodo que retorna todos os Clientes da base de dados
    public abstract List<Cliente> getAllCliente();
    // Metodo que busca um Cliente na base de dados através do nome
    public abstract Cliente findByNome(String Nome);
    
    
    
    //---------------- Fornecedores ---------------------//
    
    // Metodo que salva um Fornecedor na base de dados
    public abstract Fornecedor saveFornecedor (Fornecedor fornecedor);
    // Metodo que atualiza um Fornecedor que já existe na base de dados
    public abstract Fornecedor updateFornecedor (Fornecedor fornecedor);
    // Metodo que deleta um Fornecedor da base de dados
    public abstract void deleteFornecedor(Fornecedor fornecedor);
    // Metodo que retorna todos os Fornecedores da base de dados
    public abstract List<Fornecedor> getAllFornecedor();
    // Metodo que busca um Fornecedor na base de dados através do nome
    public abstract Fornecedor findByCNPJ(String CNPJ);
    
    
    
    //---------------- Funcionários ---------------------//
    
     // Metodo que salva um Funcionário na base de dados
    public abstract FuncionarioCaixa saveFuncionario (FuncionarioCaixa funcionario);
    // Metodo que atualiza um Funcionário que já existe na base de dados
    public abstract FuncionarioCaixa updateFuncionario (FuncionarioCaixa funcionario);
    // Metodo que deleta um Funcionário da base de dados
    public abstract void deleteFuncionario(FuncionarioCaixa funcionario);
    // Metodo que retorna todos os Funcionários da base de dados
    public abstract List<FuncionarioCaixa> getAllFuncionario();
    // Metodo que busca um Funcionário na base de dados através do nome
    public abstract FuncionarioCaixa findByNomeFuncionario(String Nome);
}
