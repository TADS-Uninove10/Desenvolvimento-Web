/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculaFrete;


public class Frete {

    private String areadacaixa, peso;

   

    public float Calcula() {
        try {
            float a1 = Float.parseFloat(areadacaixa);
            float a2 = Float.parseFloat(peso);
            return (a1 * a2 ) / 100;
        } catch (Exception e) {
            return -999;
        }
    }

    
  
    }

    /**
     * @param peso the peso to set
     */
    

/**
 *
 * @author Administrador
 */

    

