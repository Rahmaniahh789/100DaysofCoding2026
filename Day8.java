public class day8{
    public static void main(String[] args) {
        // 1. DEKLARASI: Membuat variabel (menentukan tipe data dan nama)
        int umur;
        String nama;

        // 2. INISIALISASI: Memberikan nilai awal ke variabel
        umur = 19;
        nama = "Rahmaniah";

        // Menampilkan nilai SEBELUM di-update
        System.out.println("Sebelum Update");
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);

        // 3. UPDATE: Mengubah nilai variabel yang sudah ada
        umur = 20;             // Mengganti nilai 19 menjadi 20
        nama = "Niahh"; // Mengganti nilai "Rahmaniah" menjadi "Niahh"

        // Menampilkan nilai SETELAH di-update
        System.out.println("\n Setelah Update");
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
    }
  }
