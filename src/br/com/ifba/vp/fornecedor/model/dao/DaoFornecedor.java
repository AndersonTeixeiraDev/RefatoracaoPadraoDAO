/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.fornecedor.model.dao;

import br.com.ifba.vp.infraestructure.dao.BaseDao;
import br.com.ifba.vp.infraestructure.dao.IBaseDao;
import br.com.ifba.vp.fornecedor.model.bean.Fornecedor;

import java.util.List;
/**
 *
 * @author andee
 */
    public class DaoFornecedor extends BaseDao<Fornecedor> implements IDaoFornecedor{
        public DaoFornecedor() {
    }

    @Override
    public List<Fornecedor> findByNomeFornecedor(String Nome) {
         String query = "select c from fornecedor c WHERE upper(c.CNPJ) like upper('" + Nome +"%')";
        
        return BaseDao.entityManager.createQuery(query).getResultList();
    }
    
       @Override
    public List<Fornecedor> findByCNPJ(String CNPJ) {
         String query = "select c from fornecedor c WHERE upper(c.CNPJ) like upper('" + CNPJ +"%')";
        
        return BaseDao.entityManager.createQuery(query).getResultList();
    }
}
