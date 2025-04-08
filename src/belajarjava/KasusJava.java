import java.util.Scanner;

class Barang {
    String kode;
    String nama;
    int harga;
    int jumlah;

    Barang(String kode, String nama, int harga, int jumlah) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }
    
    int getTotalHarga() {
        return harga * jumlah;
    }
}

public class KasusJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Data barang
        String[][] dataBarang = {
            {"P001", "Printer", "700000"},
            {"V001", "VGA Card", "75000"},
            {"M001", "Motherboard", "950000"}
        };

        System.out.print("Nama Petugas: ");
        String namaPetugas = scanner.nextLine();
        
        System.out.print("Tanggal: ");
        String tanggal = scanner.nextLine();
        
        System.out.print("Jumlah Data yang dimasukkan: ");
        int jumlahData = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        Barang[] transaksi = new Barang[jumlahData];
        
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Masukkan Kode Barang: ");
            String kode = scanner.nextLine();
            System.out.print("Masukkan Jumlah Barang: ");
            int jumlah = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            String nama = "Tidak Ditemukan";
            int harga = 0;
            
            for (String[] barang : dataBarang) {
                if (barang[0].equalsIgnoreCase(kode)) {
                    nama = barang[1];
                    harga = Integer.parseInt(barang[2]);
                    break;
                }
            }
            
            transaksi[i] = new Barang(kode, nama, harga, jumlah);
        }
        
        // Output
        System.out.println("\nPT. PERMATA \"PRATAMA\"");
        System.out.println("Nama Petugas: " + namaPetugas);
        System.out.println("Tanggal: " + tanggal);
        System.out.println("Jumlah Data: " + jumlahData);
        System.out.println("-----------------------------------------------------");
        System.out.printf("%-10s %-10s %-15s %-10s %-10s %-10s\n", "Data Ke", "Kode", "Nama", "Harga", "Jumlah", "Total");
        
        int totalPendapatan = 0;
        for (int i = 0; i < jumlahData; i++) {
            Barang b = transaksi[i];
            System.out.printf("%-10d %-10s %-15s Rp.%-10d %-10d Rp.%-10d\n", (i + 1), b.kode, b.nama, b.harga, b.jumlah, b.getTotalHarga());
            totalPendapatan += b.getTotalHarga();
        }
        
        System.out.println("-----------------------------------------------------");
        System.out.println("Total Pendapatan pada tanggal " + tanggal + " adalah sebesar Rp. " + totalPendapatan);
        
        scanner.close();
    }
}
