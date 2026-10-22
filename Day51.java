import java.util.Scanner;

public class Day51 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Mau ulang berapa kali: ");
        int jumlah = in.nextInt();

        for (int i = 1; i <= jumlah; i++) {
            System.out.println("Perulangan ke-" + i);
        }
        in.close();
    }
    }
