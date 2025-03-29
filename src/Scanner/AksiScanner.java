
package Scanner;



public class AksiScanner {
    public static void main(String[] args) {
        ClassScanner scan = new ClassScanner();
        scan.inputScanner();
        System.out.println("\nNama anda :"+scan.getNama());
        System.out.println("Nilai anda : "+scan.rata());
    }
}
