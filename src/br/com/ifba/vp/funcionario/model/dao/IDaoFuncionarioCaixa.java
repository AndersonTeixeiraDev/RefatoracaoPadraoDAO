/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.funcionario.model.dao;


import br.com.ifba.vp.fornecedor.model.dao.*;
import br.com.ifba.vp.infraestructure.dao.IBaseDao;
import br.com.ifba.vp.fornecedor.model.bean.Fornecedor;
import br.com.ifba.vp.funcionario.model.bean.FuncionarioCaixa;
import java.util.List;
/**
 *
 * @author andee
 */

public interface IDaoFuncionarioCaixa extends IBaseDao<FuncionarioCaixa>{
    
    public abstract List<FuncionarioCaixa> findByNomeFuncionario(String Nome);
    public FuncionarioCaixa saveFuncionario(FuncionarioCaixa funcionarioCaixa);
    
}
