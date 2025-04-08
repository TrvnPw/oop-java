/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanIfElse;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class LatIf {

    public static void main(String[] args) {
        double totalBeli, potongan = 0, jumlahBayar = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Total Pembelian Rp. ");
        totalBeli = input.nextDouble();

        if (totalBeli >= 50000) {
            potongan = 0.2 * totalBeli;
        }
        System.out.println("Besarnya Potongan Rp. "+potongan);
        jumlahBayar = totalBeli - potongan;
        System.out.println("Jumlah yang harus di bayar Rp. "+jumlahBayar);
    }
}
