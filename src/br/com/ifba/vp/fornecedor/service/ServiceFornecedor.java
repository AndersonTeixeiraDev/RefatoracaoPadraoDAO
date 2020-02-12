/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.fornecedor.service;

import br.com.ifba.vp.fornecedor.model.bean.Fornecedor;
import java.util.List;
import br.com.ifba.vp.infraestructure.exception.BusinessException;
import br.com.ifba.vp.infraestructure.support.StringUtil;
import br.com.ifba.vp.fornecedor.model.dao.DaoFornecedor;
import br.com.ifba.vp.fornecedor.model.dao.IDaoFornecedor;


/**
 *
 * @author andee
 */
public class ServiceFornecedor implements IServiceFornecedor {
     
    // Representa a mensagem de erro se o Fornecedor for nulo.
    public final static String FORN_NULL = "Fornecedor nulo";
    // Representa a mensagem de erro se o Fornecedor já existir.
    public final static String FORN_EXISTE = "O Fornecedor já existe, sua operação não pode ser complitada";
    // Representa a mensagem de erro se o Fornecedor não existir na base de dados (na hora do update).
    public final static String FORN_NAO_EXISTE= "Fornecedor inexistente!";
    // Representa a mensagem de erro se o Fornecedor for inválido.
    public final static String FORN_INVALIDO = "Fornecedorr inválido";
    
    

    // Objeto que faz a comunicação com a camada Dao
    private final IDaoFornecedor daoFornecedor = new DaoFornecedor();

    
   
    @Override
    public Fornecedor saveFornecedor(Fornecedor fornecedor) {
           if(fornecedor == null){
            // Tratamento de exceção
            throw new BusinessException(FORN_NULL);
            
        }else if(this.validaFornecedor(fornecedor) == false){
            // Tratamento de exceção
            throw new BusinessException(FORN_INVALIDO);
            
        }else if(this.fornecedorExistente(fornecedor)){
            // Tratamento de exceção
            throw new BusinessException(FORN_EXISTE);
            
        }else{
            // Salvando objeto na base de dados
            return this.daoFornecedor.save(fornecedor);
        }
    }

    @Override
    public Fornecedor updateFornecedor(Fornecedor fornecedor) {
             if(fornecedor == null) {
            // Tratamento de exceção
            throw new BusinessException(FORN_NULL);
            
        }else if(this.daoFornecedor.findById(fornecedor.getId()) == null) {
            // Tratamento de exceção
            throw new BusinessException(FORN_NAO_EXISTE);
            
        }else if(this.validaFornecedor(fornecedor) == false){
            // Tratamento de exceção
            throw new BusinessException(FORN_INVALIDO);
            
        }else {
            return this.daoFornecedor.update(fornecedor);
        }
    }

    @Override
    public void deleteFornecedor(Fornecedor fornecedor) {
             if(fornecedor == null){
            // Tratamento de exceção
            throw new BusinessException(FORN_NULL);
        }else if(this.daoFornecedor.findById(fornecedor.getId()) == null) {
            // Tratamento de exceção
            throw new BusinessException(FORN_NAO_EXISTE);
        }else{
            this.daoFornecedor.delete(fornecedor);
        }
    }

    @Override
    public List<Fornecedor> getAllFornecedor() {
       return daoFornecedor.findAll();
    }
    

    
     @Override
    public Fornecedor findByCNPJ(String CNPJ) {
         return (Fornecedor) daoFornecedor.findByCNPJ(CNPJ);
    }
    
    
      //Verifica se já existe algum Fornecedor com o mesmo titulo na base de dados
    public boolean fornecedorExistente(Fornecedor fornecedor) {
//        // Recebe todos os Fornecedores da base de dados
//        List<Fornecedor> todos = this.daoFornecedor.findAll();
//        
//        //Percorre a lista de Fornecedor
//        for(int i = 0; i < todos.size(); i++){
//            //Verifica se o CNPJ é igual ao de algum da lista
//            if(fornecedor.getCNPJ().equals(todos.get(i).getCNPJ())){
     //          return true;
//            }
//        }
        return false;
    }
    public boolean validaFornecedor(Fornecedor fornecedor) {
        
        StringUtil util = StringUtil.getInstance();
        
        if(fornecedor == null) {
            return false;
        }
        
        if( util.isNullOrEmpty(fornecedor.getBairro())           ||
            util.isNullOrEmpty(fornecedor.getRazaoSocial())          ||
            util.isNullOrEmpty(fornecedor.getEmail())          ||
            util.isNullOrEmpty(fornecedor.getRua())          ||
            util.isNullOrEmpty(fornecedor.getCidade())          ||
            util.isNullOrEmpty(fornecedor.getBairro())          ) {
        
            return false;
        }

        return true;
        
    }   
}
