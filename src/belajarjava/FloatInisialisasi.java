/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarjava;

/**
 *
 * @author user
 */
public class FloatInisialisasi {

    public static void main(String[] args) {
        int i;
        double[] nilaiAkhir = {56.5, 66.7,
            87.45, 98, 5, 78.9};

        System.out.println("\nData yang diinput ke elemen array \n");
        for (i = 0; i < 6; i++) {
            System.out.println("Nilai akhir index " + i + " = " + nilaiAkhir[i]);
        }
    }
}
