/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author user
 */
public class Sepeda {
    public int kecepatan = 0;
    public int gir = 0;

    public Sepeda(int kecepatan,int gir){
    this.kecepatan = kecepatan;
    this.gir = gir;
    }

    public int getGir() {
        return gir;
    }

    public void setGir(int gir) {
        this.gir = gir;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }
    
}
