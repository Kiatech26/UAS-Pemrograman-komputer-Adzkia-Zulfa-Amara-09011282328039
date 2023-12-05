import java.util.Scanner;

public class Soal3 {

    public static void main(String[] args) {
        
        int n;
        int a = 0;
        int b = 1;
        int c;

        
        try (Scanner Angka = new Scanner(System.in)) {
            System.out.print("Masukkan Suku ke-n: ");
            n = Angka.nextInt();
        }
        // Menampilkan deret Fibonacci
        System.out.print("Deret Fibonacci ke-" + n + ": ");
        System.out.print(a + ", " + b);
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(", " + c);
        }
    }
}
