/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class LatArray1 {
    public static void main(String[] args) {
        int i;
        int[] nilaiAkhir;
        
        nilaiAkhir = new int[6];
        Scanner input = new Scanner(System.in);
        for(i=0; i<6; i++){
            System.out.println("Masukkan array ke "+i+" = ");
            nilaiAkhir[i]= input.nextInt();
        }
        System.out.println("\n\nData yang diinput ke elemen array \n");
        for(i=0; i<6; i++){
            System.out.print("Nilai akhir index "+i);
            System.out.println(" = "+nilaiAkhir[i]);
        }
    }
}
