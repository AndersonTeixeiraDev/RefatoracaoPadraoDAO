/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.funcionario.service;

import br.com.ifba.vp.funcionario.model.bean.FuncionarioCaixa;
import java.util.List;
/**
 *
 * @author andee
 */
public interface IServiceFuncionarioCaixa {
 
    // Metodo que salva um produto na base de dados
    public abstract FuncionarioCaixa  saveFuncionario  (FuncionarioCaixa   funcionario );
    // Metodo que atualiza um Projeto de produto que já existe na base de dados
    public abstract FuncionarioCaixa  updateFuncionario  (FuncionarioCaixa   funcionario);
    // Metodo que deleta um Projeto de produto da base de dados
    public abstract void deleteFuncionario  (FuncionarioCaixa   funcionario);
    // Metodo que retorna todos os produtos da base de dados
    public abstract List<FuncionarioCaixa > getAllFuncionario ();
    // Metodo que busca um produto na base de dados através do nome
    public abstract FuncionarioCaixa  findByNomeFuncionario (String Nome);
    
}
