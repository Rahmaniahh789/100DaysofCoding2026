public class day4 {
    public static void main(String[] args) {
      // byte: 8-bit (-128 s/d 127) - hemat memori untuk angka kecil
      byte umur = 25;

      // short: 16-bit (-32.768 s/d 32.767) - angka bulat skala kecil
      short jumlahSiswa = 1500;

      // int: 32-bit (-2,1 Miliar s/d 2,1 Miliar) - standar nilai bulat 
      int gaji = 10000000;

      // long: 64-bit - angka sangat besar (wajib menggunakan akhiran 'L')
      long populasiBumi = 8000000000L;

        // Memanggil variabel secara langsung dalam operasi
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Jumlah siswa: " + jumlahSiswa);
        System.out.println("Gaji: Rp " + gaji);
        System.out.println("Populasi bumi: " + populasiBumi + " jiwa");
    }
}
