import java.util.Scanner;

public class Soal1 {

    public static void main(String[] args) {
        // Deklarasi variabel
        int jumlahBeli;
        int hargaBarang;
        double diskon;
        double totalHarga;

        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jumlah barang yang Anda beli: ");
        jumlahBeli = scanner.nextInt();
        System.out.print("Harga barang: ");
        hargaBarang = scanner.nextInt();

        // Menghitung diskon
        if (jumlahBeli < 5) {
            diskon = 0;
        } else if (jumlahBeli <= 10) {
            diskon = 0.05;
        } else if (jumlahBeli <= 20) {
            diskon = 0.1;
        } else {
            diskon = 0.2;
        }

        
        totalHarga = hargaBarang * (1 - diskon);

        
        System.out.println("Total harga setelah diskon: Rp" + totalHarga);
    }
}