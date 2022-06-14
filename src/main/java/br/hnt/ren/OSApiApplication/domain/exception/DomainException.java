/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.hnt.ren.OSApiApplication.domain.exception;

/**
 *
 * @author devsys-b
 */
public class DomainException extends RuntimeException {
    
    private static final long seriaVersionUID =1L;
    
    
    public DomainException(String message) {
        super (message);
    }
}
