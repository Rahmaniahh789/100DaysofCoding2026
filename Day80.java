import java.util.Scanner;

public class Day80 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] angka = {10, 20, 30, 40, 50};

        int indeks = input.nextInt();

        System.out.println("Nilai pada indeks " + indeks + " adalah " + angka[indeks]);
    }
}
