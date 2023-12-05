import java.util.Scanner;

public class Soal5 {

    public static void main(String[] args) {
        // Deklarasi variabel
        double a, b; // Menggunakan tipe data double untuk menangani nilai desimal
        int pilihan;

        // Membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Menampilkan menu pilihan operator
        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");

        // Meminta pengguna untuk memilih nomor operasi
        System.out.print("Masukkan nomor operasi yang dipilih (1-4): ");
        pilihan = scanner.nextInt();

        // Meminta pengguna untuk memasukkan bilangan pertama dan kedua
        System.out.print("Masukkan bilangan pertama: ");
        a = scanner.nextDouble();
        System.out.print("Masukkan bilangan kedua: ");
        b = scanner.nextDouble();

        // Melakukan operasi sesuai dengan pilihan pengguna
        switch (pilihan) {
            case 1:
                System.out.println("Hasil: " + a + " + " + b + " = " + penjumlahan(a, b));
                break;
            case 2:
                System.out.println("Hasil: " + a + " - " + b + " = " + pengurangan(a, b));
                break;
            case 3:
                System.out.println("Hasil: " + a + " * " + b + " = " + perkalian(a, b));
                break;
            case 4:
                // Menangani pembagian dengan nilai desimal dan pembagian oleh nol
                if (b != 0) {
                    System.out.println("Hasil: " + a + " / " + b + " = " + pembagian(a, b));
                } else {
                    System.out.println("Error: Pembagian oleh nol tidak valid.");
                }
                break;
            default:
                System.out.println("Nomor operasi yang Anda masukkan tidak valid.");
        }

        scanner.close();
    }

    // Metode untuk melakukan operasi penjumlahan
    public static double penjumlahan(double a, double b) {
        return a + b;
    }

    // Metode untuk melakukan operasi pengurangan
    public static double pengurangan(double a, double b) {
        return a - b;
    }

    // Metode untuk melakukan operasi perkalian
    public static double perkalian(double a, double b) {
        return a * b;
    }

    // Metode untuk melakukan operasi pembagian
    public static double pembagian(double a, double b) {
        return a / b;
    }
}
