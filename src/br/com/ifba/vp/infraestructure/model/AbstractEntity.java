/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.infraestructure.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
/**
 *
 * @author andee
 */

//classe que as entidades irão herdar
@MappedSuperclass
public class AbstractEntity {
        private long id;
        
        @Id @GeneratedValue
        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
}
