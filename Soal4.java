import java.util.ArrayList;
import java.util.Scanner;

public class Soal4 {

    public static void main(String[] args) {
        // Deklarasi variabel
        int n;
        ArrayList<Integer> faktor = new ArrayList<>();

        // Membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat positif: ");
        n = scanner.nextInt();

        // Melakukan faktorisasi
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                faktor.add(i);
                n /= i;
            }
        }

        // Menampilkan hasil faktorisasi
        System.out.println("Faktorisasi: ");
        for (int i = 0; i < faktor.size(); i++) {
            if (i == 0) {
                System.out.print(faktor.get(i));
            } else {
                System.out.print(" * " + faktor.get(i));
            }
        }

        scanner.close();
    }
}

