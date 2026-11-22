import java.util.Scanner;

public class Day82 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p = input.nextInt();
        int l = input.nextInt();

        for (int i = 1; i <= l; i++) {
            for (int j = 1; j <= p; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
} 
