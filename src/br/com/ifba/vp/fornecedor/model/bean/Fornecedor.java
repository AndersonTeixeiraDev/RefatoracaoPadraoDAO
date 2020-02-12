/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.fornecedor.model.bean;

import br.com.ifba.vp.infraestructure.model.AbstractEntity;
import javax.persistence.Entity;
import java.io.Serializable;
/**
 *
 * @author Icaro
 */
@Entity
public class Fornecedor extends AbstractEntity implements Serializable {
    
    private String RazaoSocial;
    private int InscricaoEstadual;
    private int Telefone;
    private int fax; 
    private int CNPJ;
    private String Email;
    private String Rua;
    private int Numero;
    private String Cidade;
    private String Bairro;
    private String Estado;
    private int CEP;

    public String getRazaoSocial() {
        return RazaoSocial;
    }

    public void setRazaoSocial(String RazaoSocial) {
        this.RazaoSocial = RazaoSocial;
    }

    public int getInscricaoEstadual() {
        return InscricaoEstadual;
    }

    public void setInscricaoEstadual(int InscricaoEstadual) {
        this.InscricaoEstadual = InscricaoEstadual;
    }

    public long getTelefone() {
        return Telefone;
    }

    public void setTelefone(int Telefone) {
        this.Telefone = Telefone;
    }

    public long getFax() {
        return fax;
    }

    public void setFax(int fax) {
        this.fax = fax;
    }

    public long getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public int getCEP() {
        return CEP;
    }

    public void setCEP(int CEP) {
        this.CEP = CEP;
    }
    
    
    
}
