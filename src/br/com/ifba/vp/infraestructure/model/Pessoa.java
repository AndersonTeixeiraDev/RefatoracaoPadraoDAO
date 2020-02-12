/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.infraestructure.model;

import javax.persistence.Entity;
import java.io.Serializable;
/**
 *
 * @author Icaro
 */
@Entity
public abstract class Pessoa extends AbstractEntity implements Serializable{
    
    protected String Nome;
    protected long Telefone;
    protected int RG;
    protected String Estado;
    protected String Cidade;;
    protected String Rua;
    protected String Bairro;
    protected int Numero;
    protected String Sexo;
    protected long CPF;
    protected int CEP;
    
}
