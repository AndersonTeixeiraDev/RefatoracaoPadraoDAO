/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.infraestructure.model;

/**
 *
 * @author Icaro
 */
public class Caixa {
    private double debito;
    private double caixa;

    public double getDebito() {
        return debito;
    }

    public void setDebito(double debito) {
        this.debito = this.debito + debito;
    }

    public double getCaixa() {
        return caixa;
    }

    public void setCaixa(double caixa) {
        this.caixa = this.caixa + caixa;
    }
    
}
