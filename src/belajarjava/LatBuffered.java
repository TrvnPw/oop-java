package belajarjava;

import java.io.*;


public class LatBuffered {
    public static void main(String[] args) throws IOException {
        InputStreamReader keyReader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(keyReader);
        
        String kata1, kata2;
        
        System.out.println("Masukkan Kata Pertama : ");
        kata1 = input.readLine();
        System.out.println("Masukkan Kata Kedua : ");
        kata2 = input.readLine();
        System.out.println("\nHasil input string "+kata1+" "+kata2);
    }
}
