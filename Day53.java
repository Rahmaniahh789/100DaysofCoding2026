import java.util.Scanner;

public class Day53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ulang;

        do {
            System.out.print("Masukin nama: ");
            String nama = sc.nextLine();
            System.out.println("Halo, " + nama);

            System.out.print("Ulang lagi? (ya/tidak): ");
            ulang = sc.nextLine();
            
        } while (ulang.equalsIgnoreCase("ya"));

        sc.close();
    }
              }
