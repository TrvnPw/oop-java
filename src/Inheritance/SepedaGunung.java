/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

import Inheritance.Sepeda;

/**
 *
 * @author user
 */
public class SepedaGunung extends Sepeda {
    private int ketinggianSadel;
    
    public SepedaGunung(int kecepatan,int gir){
    super(kecepatan, gir);
    }
    public int getketinggianSadel(){
    return ketinggianSadel;
    }
    public void setketinggianSadel(int ketinggianSadel){
        this.ketinggianSadel = ketinggianSadel;
    }
    
}

