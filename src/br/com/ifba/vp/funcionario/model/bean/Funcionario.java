/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.funcionario.model.bean;

import br.com.ifba.vp.infraestructure.model.Pessoa;

/**
 *
 * @author Icaro
 */
public abstract class Funcionario extends Pessoa{
    
    protected String email;
    protected int Senha;
    
   public abstract void CadastroCliente();
    
   public abstract void CadastroProduto();
    
   public abstract void ControleEstoque();
}
