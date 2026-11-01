
import java.util.Scanner;

public class Day61 {
    public static void main(String[] args) throws Exception {
        Scanner in= new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i + " x " + n + " = " + (i * n));
        }

        in.close();
    }
}

    
    

