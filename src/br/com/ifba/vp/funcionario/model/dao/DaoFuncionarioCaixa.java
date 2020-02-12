/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.funcionario.model.dao;

import br.com.ifba.vp.fornecedor.model.dao.*;
import br.com.ifba.vp.infraestructure.dao.BaseDao;
import br.com.ifba.vp.infraestructure.dao.IBaseDao;
import br.com.ifba.vp.fornecedor.model.bean.Fornecedor;
import br.com.ifba.vp.funcionario.model.bean.FuncionarioCaixa;

import java.util.List;
/**
 *
 * @author andee
 */
    public class DaoFuncionarioCaixa extends BaseDao<FuncionarioCaixa> implements IDaoFuncionarioCaixa{
        public DaoFuncionarioCaixa() {
    }


    @Override
    public List<FuncionarioCaixa> findByNomeFuncionario(String Nome) {
        String query = "select c from Funcionario c WHERE upper(c.Nome) like upper('" + Nome +"%')";
        
        return BaseDao.entityManager.createQuery(query).getResultList();    }

    @Override
    public FuncionarioCaixa saveFuncionario(FuncionarioCaixa funcionarioCaixa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
