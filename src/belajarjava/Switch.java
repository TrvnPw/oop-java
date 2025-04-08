/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarjava;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Switch {

    public static void main(String[] args) {
        int kode;
        String namaBarang = "";
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan kode barang[1..3]:");
        kode = input.nextInt();
        switch (kode) {
            case 1:
                namaBarang = "Alat Olahraga";
                break;
            case 2:
                namaBarang = "Alat Elektronik";
                break;
            case 3:
                namaBarang = "Alat Alat Masak";
                break;
            default:
                namaBarang = " Anda Salah Kode !!!";
                break;
        }
        System.out.println("\nNama Barang :" +namaBarang);
    }
}
