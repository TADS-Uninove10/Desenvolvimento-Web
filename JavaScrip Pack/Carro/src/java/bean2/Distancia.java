/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean2;

/**
 *
 * @author Administrador
 */
public class Distancia {
     private String v1, v2;

    /**
     * @return the v1
     */
    public String getV1() {
        return v1;
    }

    /**
     * @param v1 the v1 to set
     */
    public void setV1(String v1) {
        this.v1 = v1;
    }

    /**
     * @return the v2
     */
    public String getV2() {
        return v2;
    }

    /**
     * @param v2 the v2 to set
     */
    public void setV2(String v2) {
        this.v2 = v2;
    }
    public float Distac () {
        try {
            float b1 = Float.parseFloat(v1);
            float b2 = Float.parseFloat(v2);
            
            return (b1*2)/b2;
        } catch (Exception e) {
            return -999;
    
       
        
    
        }
    
}
}
