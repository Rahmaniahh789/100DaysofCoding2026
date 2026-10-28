import java.util.Scanner;

public class Day57 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("n = ");
        int n = s.nextInt();
        
        System.out.print("Ganjil: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        
        System.out.print("\nGenap: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        
        s.close();
    }
}
