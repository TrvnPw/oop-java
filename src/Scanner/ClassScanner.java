/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Scanner;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ClassScanner {
    public String nama;
    public int n2;
    public double n1, n3;
    Scanner input = new Scanner(System.in);
    
    public String getNama(){
    return nama;
    }
    public void inputScanner(){
        System.out.println("Masukkan nama anda:");
        nama = input.nextLine();
        System.out.println("Masukkan nilai 1:");
        n1 = input.nextDouble();
        System.out.println("Masukkan nilai 2:");
        n2 = input.nextInt();       
    }
    public double rata(){
    return ((n1+n2)/2);
    }
}
