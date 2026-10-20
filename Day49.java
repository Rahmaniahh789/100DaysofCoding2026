import java.util.Scanner;

public class Day49{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Umur: ");
        int umur = in.nextInt();
        
        String hasil = (umur >= 17) ? "Dewasa" : "Anak-anak";
        
        System.out.println(hasil);
        in.close();
    }
          }
