/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.cliente.model.dao;

import br.com.ifba.vp.infraestructure.dao.IBaseDao;
import br.com.ifba.vp.cliente.model.bean.Cliente;
import java.util.List;
/**
 *
 * @author andee
 */

public interface IDaoCliente extends IBaseDao<Cliente>{
    public abstract List<Cliente> findByNome(String Nome);
}
