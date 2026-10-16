import java.util.Scanner;
public class Day45{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hari = in.nextInt();

        switch (hari) {
            case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            default:
                System.out.println("Hari tidak valid");
        }
    }
        }
