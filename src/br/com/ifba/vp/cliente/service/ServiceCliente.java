/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.cliente.service;

import br.com.ifba.vp.cliente.model.bean.Cliente;
import java.util.List;
import br.com.ifba.vp.infraestructure.exception.BusinessException;
import br.com.ifba.vp.infraestructure.support.StringUtil;
import br.com.ifba.vp.cliente.model.dao.DaoCliente;
import br.com.ifba.vp.cliente.model.dao.IDaoCliente;


/**
 *
 * @author andee
 */
public class ServiceCliente implements IServiceCliente {
     
    // Representa a mensagem de erro se o Cliente for nulo.
    public final static String CLIENT_NULL = "Cliente nulo";
    // Representa a mensagem de erro se o Cliente já existir.
    public final static String CLIENT_EXISTE = "O Cliente já existe, sua operação não pode ser complitada";
    // Representa a mensagem de erro se o Cliente não existir na base de dados (na hora do update).
    public final static String CLIENT_NAO_EXISTE= "Cliente inexistente!";
    // Representa a mensagem de erro se o Cliente for inválido.
    public final static String CLIENT_INVALIDO = "Cliente inválido";
    
    

    // Objeto que faz a comunicação com a camada Dao
    private final IDaoCliente daoCliente = new DaoCliente();

    @Override
    public Cliente saveCliente(Cliente cliente) {
        if(cliente == null){
            // Tratamento de exceção
            throw new BusinessException(CLIENT_NULL);
            
        }else if(this.validaCliente(cliente) == false){
            // Tratamento de exceção
            throw new BusinessException(CLIENT_INVALIDO);
            
        }else if(this.clienteExistente(cliente)){
            // Tratamento de exceção
            throw new BusinessException(CLIENT_EXISTE);
            
        }else{
            // Salvando objeto na base de dados
            return this.daoCliente.save(cliente);
           
        }
    }
    

    @Override
    public Cliente updateCliente(Cliente cliente) {
        if(cliente == null) {
            // Tratamento de exceção
            throw new BusinessException(CLIENT_NULL);
            
        }else if(this.daoCliente.findById(cliente.getId()) == null) {
            // Tratamento de exceção
            throw new BusinessException(CLIENT_NAO_EXISTE);
            
        }else if(this.validaCliente(cliente) == false){
            // Tratamento de exceção
            throw new BusinessException(CLIENT_INVALIDO);
            
        }else {
            return this.daoCliente.update(cliente);
        }
        
    }

    @Override
    public void deleteCliente(Cliente cliente) {
         if(cliente == null){
            // Tratamento de exceção
            throw new BusinessException(CLIENT_NULL);
        }else if(this.daoCliente.findById(cliente.getId()) == null) {
            // Tratamento de exceção
            throw new BusinessException(CLIENT_NAO_EXISTE);
        }else{
            this.daoCliente.delete(cliente);
        }
    }

    @Override
    public List<Cliente> getAllCliente() {
       return daoCliente.findAll();
    }

    @Override
    public Cliente findByNome(String Nome) {
         return (Cliente) daoCliente.findByNome(Nome);
    }

    
  
    
    //Verifica se já existe algum Cliente com o mesmo titulo na base de dados
    public boolean clienteExistente(Cliente cliente) {
        // Recebe todos os Clientes da base de dados
        List<Cliente> todos = this.daoCliente.findAll();
        
        //Percorre a lista de Cliente
        for(int i = 0; i < todos.size(); i++){
            //Verifica se o cod de barras é igual ao de algum da lista
            if(cliente.getNome().equals(todos.get(i).getNome())){
                return true;
            }
        }
        return false;
    }
    public boolean validaCliente(Cliente cliente) {
        
        StringUtil util = StringUtil.getInstance();
        
        if(cliente == null) {
            return false;
        }
        
        if( util.isNullOrEmpty(cliente.getNome())           ||
            util.isNullOrEmpty(cliente.getBairro())          ||
            util.isNullOrEmpty(cliente.getCidade())          ||
            util.isNullOrEmpty(cliente.getEstado())          ||
            util.isNullOrEmpty(cliente.getNome())          ||
            util.isNullOrEmpty(cliente.getRua())          ||
            util.isNullOrEmpty(cliente.getSexo())          ) {
        
            return false;
        }
        
     
        
        return true;
        
    }   
}
