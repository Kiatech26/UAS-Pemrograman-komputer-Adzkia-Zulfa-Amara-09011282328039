import java.util.Scanner;

public class Soal7 {

    public static void main(String[] args) {
        // Membuat objek buku
        Buku buku1 = new Buku("Filosofi Teras", "Henry Manapiring", 2018);
        Buku buku2 = new Buku("Sebuah Seni untuk Bersikap Bodo Amat", "Mark Manson", 2018);

        // Menampilkan informasi buku
        System.out.println("Informasi Buku Sebelum Peminjaman:");
        buku1.tampilkanInformasi();
        buku2.tampilkanInformasi();

        // Meminjam buku
        buku1.pinjamBuku();

        // Menampilkan informasi buku setelah peminjaman
        System.out.println("Informasi Buku Setelah Peminjaman:");
        buku1.tampilkanInformasi();
        buku2.tampilkanInformasi();
    }

    // Kelas untuk merepresentasikan buku
    private static class Buku {
        String judul;
        String penulis;
        int tahunTerbit;
        boolean tersedia; // Menandakan apakah buku tersedia atau sedang dipinjam

        public Buku(String judul, String penulis, int tahunTerbit) {
            this.judul = judul;
            this.penulis = penulis;
            this.tahunTerbit = tahunTerbit;
            this.tersedia = true; // Saat buku ditambahkan, diasumsikan tersedia
        }

        // Metode untuk menampilkan informasi buku
        public void tampilkanInformasi() {
            System.out.println("Judul: " + judul);
            System.out.println("Penulis: " + penulis);
            System.out.println("Tahun Terbit: " + tahunTerbit);
            System.out.println("Status: " + (tersedia ? "Buku Tersedia" : "Buku Dipinjam"));
            System.out.println();
        }

        // Metode untuk meminjam buku
        public void pinjamBuku() {
            if (tersedia) {
                tersedia = false;
                System.out.println("Buku ini berhasil dipinjam.");
            } else {
                System.out.println("Buku saat ini sedang tidak tersedia untuk dipinjam.");
            }
        }
    }
}

