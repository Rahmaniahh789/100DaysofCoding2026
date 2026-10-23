import java.util.Scanner;

public class Day52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Mau ulang berapa kali? ");
        int n = sc.nextInt();
        
        int i = 1;
        while (i <= n) {
            System.out.println("Perulangan ke-" + i);
            i++;
        }
        
        sc.close();
    }
                                 }
