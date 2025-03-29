/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarjava;

/**
 *
 * @author user
 */
public class OperatorPemberiNilai {
    public static void main(String[] args) {
        int a,c,d,e;
        double b;
        a = 3; b = 5; c = 13; d = 4; e = 6;
        a *=2;
        b /=2;
        c %=2;
        d +=2;
        e -=2;
        System.out.println("Nilai a *=2 adalah:"+a);
        System.out.println("Nilai b /=2 adalah:"+b);
        System.out.println("Nilai c %=2 adalah:"+c);
        System.out.println("Nilai d +=2 adalah:"+d);
        System.out.println("Nilai e -=2 adalah:"+e);
    }
}
