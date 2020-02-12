/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.cliente.service;

import br.com.ifba.vp.cliente.model.bean.Cliente;
import java.util.List;
/**
 *
 * @author andee
 */
public interface IServiceCliente {
 
    // Metodo que salva um Cliente na base de dados
    public abstract Cliente saveCliente (Cliente  cliente );
    // Metodo que atualiza um Cliente que já existe na base de dados
    public abstract Cliente updateCliente  (Cliente  cliente);
    // Metodo que deleta um Cliente da base de dados
    public abstract void deleteCliente  (Cliente  cliente);
    // Metodo que retorna todos os clientes da base de dados
    public abstract List<Cliente> getAllCliente();
    // Metodo que busca um Cliente na base de dados através do nome
    public abstract Cliente findByNome(String Nome);
    
}
