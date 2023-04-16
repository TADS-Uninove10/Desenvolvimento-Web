package bean;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrador
 */
public class Media {

    private String n1, n2, n3;

    public String getN1() {
        return n1;
    }

    public void setN1(String n1) {
        this.n1 = n1;
    }

    public String getN2() {
        return n2;
    }

    public void setN2(String n2) {
        this.n2 = n2;
    }

    public String getN3() {
        return n3;
    }

    public void setN3(String n3) {
        this.n3 = n3;
    }

    public float Calcula() {
        try {
            float a1 = Float.parseFloat(n1);
            float a2 = Float.parseFloat(n2);
            float a3 = Float.parseFloat(n3);
            return (a1 + a2 + a3) / 3;
        } catch (Exception e) {
            return -999;
        }
    }
}
