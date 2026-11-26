
import java.util.Scanner;

public class Day86 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] angka = {10, 20, 30, 40, 50};
        int cari = input.nextInt();
        boolean ditemukan = false;

        for (int i = 0; i < angka.length; i++) {
            if (angka[i] == cari) {
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Angka ditemukan");
        } else {
            System.out.println("Angka tidak ditemukan");
        }

        input.close();
    }
}
