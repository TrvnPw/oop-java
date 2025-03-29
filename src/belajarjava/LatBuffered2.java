/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author user
 */
public class LatBuffered2 {

    public static void main(String[] args) throws IOException {
//        InputStreamReader keyReader = new InputStreamReader(System.in);
//        BufferedReader input = new BufferedReader(keyReader);
//
//        String kata1, kata2;
//
//        System.out.print("Masukkan Kata Pertama: ");
//        kata1 = input.readLine();
//        System.out.print("Masukkan Kata Kedua: ");
//        kata2 = input.readLine();
//
//        System.out.println("\nHasil input string: " + kata1 + " " + kata2);
        InputStreamReader keyReader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(keyReader);

        String kata1 = "", kata2 = "";

        try {
            // Meminta pengguna memasukkan dua kata
            System.out.print("Masukkan Kata Pertama: ");
            kata1 = input.readLine();  // Membaca input pertama
            System.out.print("Masukkan Kata Kedua: ");
            kata2 = input.readLine();  // Membaca input kedua
        } catch (IOException e) {
            // Menangani error jika terjadi masalah saat membaca input
            System.out.println("Terjadi kesalahan dalam input!");
        }

        // Menampilkan hasil input
        System.out.println("\nHasil input string: " + kata1 + " " + kata2);
    }
}
