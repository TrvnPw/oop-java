/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan5Kasus;

import java.util.Scanner;


public class Pertemuan5Kasus2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i, jd;
        String[] nama = new String[10];
        String[] kodePelanggan = new String[10];
        String[] alamat = new String[10];
        String tanya = "";

        do {
            System.out.println("Masukkan jumlah data :");
            jd = input.nextInt();
            for (i = 1; i <= jd; i++) {
                System.out.println("Data ke-" + i);
                System.out.println("Kode Pelanggan :");
                kodePelanggan[i] = input.next();
                System.out.println("Nama pelanggan :");
                nama[i] = input.next();
                System.out.println("Alamat pelanggan :");
                alamat[i] = input.next();
            }
            System.out.println("\n\n     DATA PELANGGAN PT.SENTOSA JAYA");
            System.out.println("   JL.sagu No.27A Kebagusan Jakarta selatan");
            System.out.println("===============================================");
            for (i = 1; i <= jd; i++) {
                System.out.println("Data ke-" + i);
                System.out.println("Kode pelanggan :" + kodePelanggan[i]);
                System.out.println("Nama pelanggan :" + nama[i]);
                System.out.println("Alamat :" + alamat[i]);
                System.out.println("==============================================");
            }
            System.out.println("Mau input data lagi? :");
            tanya = input.next();
        } while (tanya.equalsIgnoreCase("Y"));

    }
}
