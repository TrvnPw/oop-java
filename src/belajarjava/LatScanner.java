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
public class LatScanner {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nama;
        int n2;
        double n1, n3;
        
        System.out.println("Masukkan nama anda:");
        nama = input.nextLine();
        System.out.println("Masukkan nilai 1:");
        n1 = input.nextDouble();
        System.out.println("Masukkan nilai 2:");
        n2 = input.nextInt();
        
        n3 = n1+n2;
        System.out.println("\nNama anda : "+nama);
        System.out.println("Nilai anda : "+n3);
        
        
        
    }
}
