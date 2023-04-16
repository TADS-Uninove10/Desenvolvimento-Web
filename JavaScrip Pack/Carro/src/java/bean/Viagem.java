/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Administrador
 */
public class Viagem {
    private String n1, n2;

    /**
     * @return the n1
     */
    public String getN1() {
        return n1;
    }

    /**
     * @param n1 the n1 to set
     */
    public void setN1(String n1) {
        this.n1 = n1;
    }

    /**
     * @return the n2
     */
    public String getN2() {
        return n2;
    }

    /**
     * @param n2 the n2 to set
     */
    public void setN2(String n2) {
        this.n2 = n2;
    }
    


    
  
     public float tanque () {
        try {
            float a1 = Float.parseFloat(n1);
            float a2 = Float.parseFloat(n2);
            
            return (a1 * a2 )-20/100;
        } catch (Exception e) {
            return -999;
    
       
        
    
        }
     }
}

   
    /**
     * @return the v1
     */
    