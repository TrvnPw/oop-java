/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

import Inheritance.SepedaGunung;

/**
 *
 * @author user
 */
public class SepedaGunungBeraksi {
    public static void main(String[] args) {
        SepedaGunung sepedaku = new SepedaGunung (20,8);
        int kecepatan = sepedaku.getKecepatan();
        int gir = sepedaku.getGir();
        sepedaku.setketinggianSadel(10);
        int ketinggianSaddle = sepedaku.getketinggianSadel();
        System.out.println("Sepeda saya memiliki kecepatan "+kecepatan+"km"+
                ", Sepedaku juga memiliki gir "+gir+", Dan ketinggian saddle sepedaku yaitu "+ketinggianSaddle);
    }
}
