/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Administrador
 */
public class CalcularFrete {

    private String pro, alt, lar, pe, are, fr;

    /**
     * @return the pro
     */
    public String getPro() {
        return pro;
    }

    /**
     * @param pro the pro to set
     */
    public void setPro(String pro) {
        this.pro = pro;
    }

    /**
     * @return the alt
     */
    public String getAlt() {
        return alt;
    }

    /**
     * @param alt the alt to set
     */
    public void setAlt(String alt) {
        this.alt = alt;
    }

    /**
     * @return the lar
     */
    public String getLar() {
        return lar;
    }

    /**
     * @param lar the lar to set
     */
    public void setLar(String lar) {
        this.lar = lar;
    }

    /**
     * @return the pe
     */
    public String getPe() {
        return pe;
    }

    /**
     * @param pe the pe to set
     */
    public void setPe(String pe) {
        this.pe = pe;
    }

    public String getAre() {
        return are;
    }

    /**
     * @param are the are to set
     */
    public void setAre(String are) {
        this.are = are;
    }

    public String getFr() {
        return fr;
    }

    /**
     * @param fr the fr to set
     */
    public void setFr(String fr) {
        this.fr = fr;
    }

    public float Calcular() {
        try {
            float a1 = Float.parseFloat(pro);
            float a2 = Float.parseFloat(alt);
            float a3 = Float.parseFloat(lar);
            float a4 = Float.parseFloat(pe);
            float a5 = Float.parseFloat(are);
            float a6 = Float.parseFloat(fr);
            a5 = a1 * a2 * a3;
             a6 = a5 * a4 /100;

            if (a4 > 10) {
                a6 = a5 / a4;
                
            } else {
                
               
                
            
            }


            
        
    
           
           
           
            
            
    
    return a6 ;
}
catch (Exception e) {
            return -999;
}}
    
}

    /**
     * @return the are
     */
