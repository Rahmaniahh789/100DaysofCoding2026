import java.util.Scanner;

public class Day39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Pilih menu [1-4]: ");
        int pilih = input.nextInt();

        if (pilih == 1) {
            System.out.println("Kamu pilih Nasi Goreng. Pesanan diproses!");
        } else if (pilih == 2) {
            System.out.println("Kamu pilih Mie Goreng. Pesanan diproses!");
        } else if (pilih == 3) {
            System.out.println("Kamu pilih Ayam Geprek. Pesanan diproses!");
        } else if (pilih == 4) {
            System.out.println("Terima kasih, keluar program.");
        } else {
            System.out.println("Pilihan tidak valid! Pilih 1-4 saja.");
        }

        input.close();
    }
              }
