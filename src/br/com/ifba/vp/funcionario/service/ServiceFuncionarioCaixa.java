/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.funcionario.service;

import br.com.ifba.vp.funcionario.model.bean.FuncionarioCaixa;
import java.util.List;
import br.com.ifba.vp.infraestructure.exception.BusinessException;
import br.com.ifba.vp.infraestructure.support.StringUtil;

import br.com.ifba.vp.funcionario.model.dao.DaoFuncionarioCaixa;
import br.com.ifba.vp.funcionario.model.dao.IDaoFuncionarioCaixa;

/**
 *
 * @author andee
 */
public class ServiceFuncionarioCaixa implements IServiceFuncionarioCaixa {
     
    // Representa a mensagem de erro se o Funcionario  for nulo.
    public final static String FUNC_NULL = "Funcionario  nulo";
    // Representa a mensagem de erro se o Funcionario  já existir.
    public final static String FUNC_EXISTE = "O Funcionario  já existe, sua operação não pode ser complitada";
    // Representa a mensagem de erro se o Funcionario  não existir na base de dados (na hora do update).
    public final static String FUNC_NAO_EXISTE= "Funcionario  inexistente!";
    // Representa a mensagem de erro se o Funcionario  for inválido.
    public final static String FUNC_INVALIDO = "Funcionario  inválido";
    
    

    // Objeto que faz a comunicação com a camada Dao
    private final IDaoFuncionarioCaixa daoFuncionario = new DaoFuncionarioCaixa();
    

   
    @Override
    public FuncionarioCaixa saveFuncionario(FuncionarioCaixa funcionarioCaixa) {
        if(funcionarioCaixa == null){
            //Tratamento de exceção
            throw new BusinessException(FUNC_NULL);
        }
        
        return this.daoFuncionario.saveFuncionario(funcionarioCaixa);

    }
    
    @Override
    public FuncionarioCaixa updateFuncionario(FuncionarioCaixa funcionario) {
           
            return this.daoFuncionario.update(funcionario);
        }
    

    @Override
    public void deleteFuncionario(FuncionarioCaixa funcionario) {
 
            this.daoFuncionario.delete(funcionario);
        
    }

    @Override
    public List<FuncionarioCaixa> getAllFuncionario() {
        return daoFuncionario.findAll();
    }

    @Override
    public FuncionarioCaixa findByNomeFuncionario(String Nome) {
         return (FuncionarioCaixa) daoFuncionario.findByNomeFuncionario(Nome);

    }



}
