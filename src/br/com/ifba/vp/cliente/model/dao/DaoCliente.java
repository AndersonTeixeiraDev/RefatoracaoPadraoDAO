/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.cliente.model.dao;

import br.com.ifba.vp.infraestructure.dao.BaseDao;
import br.com.ifba.vp.infraestructure.dao.IBaseDao;
import br.com.ifba.vp.cliente.model.dao.IDaoCliente;
import br.com.ifba.vp.cliente.model.bean.Cliente;
import java.util.List;
/**
 *
 * @author andee
 */
    public class DaoCliente extends BaseDao<Cliente> implements IDaoCliente{
        public DaoCliente() {
    }
        
      @Override
    public List<Cliente> findByNome(String Nome){
        
        String query = "select c from cliente c WHERE upper(c.Nome) like upper('" + Nome +"%')";
        
        return BaseDao.entityManager.createQuery(query).getResultList();
        
    }
}
