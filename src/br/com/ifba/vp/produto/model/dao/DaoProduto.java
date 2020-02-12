/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.produto.model.dao;

import br.com.ifba.vp.infraestructure.dao.BaseDao;
import br.com.ifba.vp.infraestructure.dao.IBaseDao;
import br.com.ifba.vp.produto.model.bean.Produto;
import java.util.List;
/**
 *
 * @author andee
 */
    public class DaoProduto extends BaseDao<Produto> implements IDaoProduto{
        public DaoProduto() {
    }
        
        
    @Override
    public List<Produto> findByCodigoBarras(String CodBarras){
        
        String query = "select c from Produto c WHERE upper(c.CodigoBarras) like upper('" + CodBarras +"%')";
        
        return BaseDao.entityManager.createQuery(query).getResultList();
        
    }
      @Override
    public List<Produto> findByNomeProduto(String Nome){
        
        String query = "select c from Produto c WHERE upper(c.NomeProduto) like upper('" + Nome +"%')";
        
        return BaseDao.entityManager.createQuery(query).getResultList();
        
    }
}
