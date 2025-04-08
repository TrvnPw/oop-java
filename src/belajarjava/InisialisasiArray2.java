/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarjava;

/**
 *
 * @author user
 */
public class InisialisasiArray2 {
    public static void main(String[] args) {
        int i,j;
        int[][] nilaiAkhir = {{150, 159, 230},{100,125,150},{210,125,156}};
        
        System.out.println("Data yang diinput ke elemen array \n");
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.println("Nilai akhir index ["+i+"]["+j+"] = "
                        +nilaiAkhir[i][j]);
            }
        }
                
    }
}