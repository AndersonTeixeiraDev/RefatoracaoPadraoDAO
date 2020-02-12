/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.fornecedor.model.dao;


import br.com.ifba.vp.infraestructure.dao.IBaseDao;
import br.com.ifba.vp.fornecedor.model.bean.Fornecedor;
import java.util.List;
/**
 *
 * @author andee
 */

public interface IDaoFornecedor extends IBaseDao<Fornecedor>{
    public abstract List<Fornecedor> findByNomeFornecedor(String Nome);
    public abstract List<Fornecedor> findByCNPJ(String CNPJ);
}
