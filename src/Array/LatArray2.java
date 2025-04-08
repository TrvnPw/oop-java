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
public class LatArray2 {
    public static void main(String[] args) {
        int i,j;
        int[][] dataJual;
        dataJual = new int[3][3];
        Scanner input = new Scanner(System.in);
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.print("Masukkan data jual ke ["+i+"]["+j+"]");
                dataJual[i][j] = input.nextInt();
            }
            System.out.println();
        }
        System.out.println("\n\nData jual yang diinput ke elemen array \n");
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.println("Nilai data jual ["+i+"]["+j+"]"+" = "
                        +dataJual[i][j]);                
            }
            System.out.println();
        }
    }
}
