import java.util.Scanner;

public class Soal6 {

    public static void main(String[] args) {
        // Deklarasi variabel
        String kata;

        // Membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kata atau frasa: ");
        kata = scanner.nextLine();

        // Melakukan pengecekan
        if (cekPalindrom(kata)) {
            System.out.println(kata + " frasa tersebut Merupakan palindrom.");
        } else {
            System.out.println(kata + " frasa tersebut bukan palindrom.");
        }
    }

    // Metode untuk melakukan pengecekan
    public static boolean cekPalindrom(String kata) {
        // Buat string baru yang berisi kata dibalik
        String kataBalik = "";
        for (int i = kata.length() - 1; i >= 0; i--) {
            kataBalik += kata.charAt(i);
        }

        // Cek apakah string baru sama dengan kata asli
        return kata.equals(kataBalik);
    }
}