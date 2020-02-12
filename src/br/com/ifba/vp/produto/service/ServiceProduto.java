/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.produto.service;

import br.com.ifba.vp.produto.model.bean.Produto;
import java.util.List;
import br.com.ifba.vp.infraestructure.exception.BusinessException;
import br.com.ifba.vp.infraestructure.support.StringUtil;
import br.com.ifba.vp.produto.model.dao.DaoProduto;
import br.com.ifba.vp.produto.model.dao.IDaoProduto;

/**
 *
 * @author andee
 */
public class ServiceProduto implements IServiceProduto {
     
    // Representa a mensagem de erro se o Projeto de Pesquisa for nulo.
    public final static String PROD_NULL = "Pesquisador nulo";
    // Representa a mensagem de erro se o Projeto de Pesquisa já existir.
    public final static String PROD_EXISTE = "O Pesquisador já existe, sua operação não pode ser complitada";
    // Representa a mensagem de erro se o Projeto de Pesquisa não existir na base de dados (na hora do update).
    public final static String PROD_NAO_EXISTE= "Pesquisador inexistente!";
    // Representa a mensagem de erro se o Projeto de Pesquisa for inválido.
    public final static String PROD_INVALIDO = "Pesquisador inválido";
    
    

    // Objeto que faz a comunicação com a camada Dao
    private final IDaoProduto daoProduto = new DaoProduto();

    
   
    @Override
    public Produto saveProduto(Produto produto) {
           if(produto == null){
            // Tratamento de exceção
            throw new BusinessException(PROD_NULL);
            
        }else if(this.validaProduto(produto) == false){
            // Tratamento de exceção
            throw new BusinessException(PROD_INVALIDO);
            
        }else if(this.produtoExistente(produto)){
            // Tratamento de exceção
            throw new BusinessException(PROD_EXISTE);
            
        }else{
            // Salvando objeto na base de dados
            return this.daoProduto.save(produto);
        }
    }

    @Override
    public Produto updateProduto(Produto produto) {
             if(produto == null) {
            // Tratamento de exceção
            throw new BusinessException(PROD_NULL);
            
        }else if(this.daoProduto.findById(produto.getId()) == null) {
            // Tratamento de exceção
            throw new BusinessException(PROD_NAO_EXISTE);
            
        }else if(this.validaProduto(produto) == false){
            // Tratamento de exceção
            throw new BusinessException(PROD_INVALIDO);
            
        }else {
            return this.daoProduto.update(produto);
        }
    }

    @Override
    public void deleteProduto(Produto produto) {
             if(produto == null){
            // Tratamento de exceção
            throw new BusinessException(PROD_NULL);
        }else if(this.daoProduto.findById(produto.getId()) == null) {
            // Tratamento de exceção
            throw new BusinessException(PROD_NAO_EXISTE);
        }else{
            this.daoProduto.delete(produto);
        }
    }

    @Override
    public List<Produto> getAllProduto() {
       return daoProduto.findAll();
    }
    

    @Override
    public Produto findByCodigoBarras(String CodBarras) {
         return (Produto) daoProduto.findByCodigoBarras(CodBarras);
    }
    
     @Override
    public Produto findByNomeProduto(String Nome) {
         return (Produto) daoProduto.findByNomeProduto(Nome);
    }
    
    
      //Verifica se já existe algum Produto com o mesmo titulo na base de dados
    public boolean produtoExistente(Produto produto) {
        // Recebe todos os produtos da base de dados
        List<Produto> todos = this.daoProduto.findAll();
        
        //Percorre a lista de produtos
        for(int i = 0; i < todos.size(); i++){
            //Verifica se o cod de barras é igual ao de algum da lista
            if(produto.getNomeProduto().equals(todos.get(i).getNomeProduto())){
                return true;
            }
        }
        return false;
    }
    public boolean validaProduto(Produto produto) {
        
        StringUtil util = StringUtil.getInstance();
        
        if(produto == null) {
            return false;
        }
        
        if( util.isNullOrEmpty(produto.getNomeProduto())           ||
            util.isNullOrEmpty(produto.getGenero())          ||
            util.isNullOrEmpty(produto.getDataValidade())          ) {
        
            return false;
        }
        
     
        
        return true;
        
    }   
}
