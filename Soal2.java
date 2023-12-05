import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {
        // Deklarasi variabel
        String username;
        String password;

        // Membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Username: ");
        username = scanner.nextLine();
        System.out.print("Password: ");
        password = scanner.nextLine();

        // Cek autentikasi, Autentikasi gagal apabila usename dan password sama
        if (cekAutentikasi(username, password)) {
            System.out.println("Autentikasi Berhasil");
        } else {
            System.out.println("Autentikasi Gagal");
        }
    }

    private static boolean cekAutentikasi(String username, String password) {
        if (username.equals(password)) {
            return false;
        }

        // Cek autentikasi sesuai dengan kebutuhan Anda
        return true;
    }
}
