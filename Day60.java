
import java.util.Scanner;

public class Day60{
    public static void main(String[] args) throws Exception {
        Scanner in= new Scanner(System.in);

        int n = in.nextInt();
        int total = in.nextInt();

        for (int i = 0; i <= n ; i++) {
            total += i;
            System.out.println("jumalah  1 sampai " + n + "="+ total);
            
        }

    
    }
}
