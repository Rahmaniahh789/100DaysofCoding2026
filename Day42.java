import java.util.Scanner;
public class Day42 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double pokok = in.nextDouble(); // gaji pokok
        double pot = in.nextDouble();   // potongan

        if (pot > pokok) {
            System.out.println("Tidak valid");
        } else {
            System.out.println(pokok - pot); // gaji bersih
        }
    }
            }
