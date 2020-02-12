/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.infraestructure.service;
import br.com.ifba.vp.cliente.model.bean.Cliente;
import br.com.ifba.vp.cliente.service.IServiceCliente;
import br.com.ifba.vp.cliente.service.ServiceCliente;
import br.com.ifba.vp.fornecedor.model.bean.Fornecedor;
import br.com.ifba.vp.fornecedor.service.IServiceFornecedor;
import br.com.ifba.vp.fornecedor.service.ServiceFornecedor;
import br.com.ifba.vp.funcionario.model.bean.Funcionario;
import br.com.ifba.vp.funcionario.model.bean.FuncionarioCaixa;
import br.com.ifba.vp.infraestructure.service.IFachada;
import br.com.ifba.vp.produto.model.bean.Produto;
import br.com.ifba.vp.produto.service.IServiceProduto;
import br.com.ifba.vp.produto.service.ServiceProduto;
import java.util.List;
/**
 *
 * @author andee
 */
public class Fachada implements IFachada{
    
//---------------- Produtos --------------------//
    
    private final IServiceProduto serviceProduto = new ServiceProduto();
    
    @Override
    public Produto saveProduto(Produto produto) {
        return this.serviceProduto.saveProduto(produto);
    }

    @Override
    public Produto updateProduto(Produto produto) {
        return this.serviceProduto.updateProduto(produto);
    }

    @Override
    public void deleteProduto(Produto produto) {
         this.serviceProduto.deleteProduto(produto);
    }

    @Override
    public List<Produto> getAllProduto() {
       return this.serviceProduto.getAllProduto();
    }

    @Override
    public Produto findByNomeProduto(String Nome) {
        return this.serviceProduto.findByNomeProduto(Nome);
    }

   
    
    
    //---------------- Clientes --------------------//

     private final IServiceCliente serviceCliente = new ServiceCliente();
    
    @Override
    public Cliente saveCliente(Cliente cliente) {
             return this.serviceCliente.saveCliente(cliente);
    }

    @Override
    public Cliente updateCliente(Cliente cliente) {
       return this.serviceCliente.updateCliente(cliente);
    }

    @Override
    public void deleteCliente(Cliente cliente) {
         this.serviceCliente.deleteCliente(cliente);
    }

    @Override
    public List<Cliente> getAllCliente() {
        return this.serviceCliente.getAllCliente();
    }

    @Override
    public Cliente findByNome(String Nome) {
       return this.serviceCliente.findByNome(Nome);
    }

    
       //---------------- Fornecedores--------------------//
    
    private final IServiceFornecedor serviceFornecedor = new ServiceFornecedor();
    
    @Override
    public Fornecedor saveFornecedor(Fornecedor fornecedor) {
        return this.serviceFornecedor.saveFornecedor(fornecedor);
    }

    @Override
    public Fornecedor updateFornecedor(Fornecedor fornecedor) {
        return this.serviceFornecedor.updateFornecedor(fornecedor);
    }

    @Override
    public void deleteFornecedor(Fornecedor fornecedor) {
        this.serviceFornecedor.deleteFornecedor(fornecedor);
      }

    @Override
    public List<Fornecedor> getAllFornecedor() {
        return this.serviceFornecedor.getAllFornecedor();
    }

    @Override
    public Fornecedor findByCNPJ(String CNPJ) {
        return this.serviceFornecedor.findByCNPJ(CNPJ);
    }

    
    
    
       //---------------- Funcionários --------------------//
    @Override
    public FuncionarioCaixa saveFuncionario(FuncionarioCaixa funcionario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FuncionarioCaixa updateFuncionario(FuncionarioCaixa funcionario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteFuncionario(FuncionarioCaixa funcionario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<FuncionarioCaixa> getAllFuncionario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FuncionarioCaixa findByNomeFuncionario(String Nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
    
}
