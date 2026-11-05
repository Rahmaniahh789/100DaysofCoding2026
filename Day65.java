import java.util.Scanner;

public class Day65 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tinggi = input.nextInt();

        for (int i = 0; i < tinggi; i++) {
            System.out.println("|");
        }
        input.close();
    }
}
