
import Day87 ;

public class ManipulasiArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] angka = new int[5];

        for (int i = 0; i < angka.length; i++) {
            angka[i] = input.nextInt();
        }

        angka[0] = 100;

        System.out.println("Data setelah dimanipulasi:");

        for (int i = 0; i < angka.length; i++) {
            System.out.println(angka[i]);
        }

        input.close();
    }
}
