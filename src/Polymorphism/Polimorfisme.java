/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

/**
 *
 * @author user
 */
public class Polimorfisme {
    public static void main(String[] args) {
        Hewan kuda = new Kuda();
        Hewan kucing = new Kucing();
        Hewan ayam = new Ayam();
        
        kuda.berSuara();
        kucing.berSuara();
        ayam.berSuara();
    }
}
