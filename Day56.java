import java.util.Scanner;

public class Day56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // cetak 1 - n
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // cetak n - 1
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
          }
