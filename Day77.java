
import java.util.Scanner;

public class Day77 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.println("\n=== METHOD STRING ===");
        System.out.println("Panjang nama: " + nama.length());
        System.out.println("Huruf besar: " + nama.toUpperCase());
        System.out.println("Huruf kecil: " + nama.toLowerCase());
        System.out.println("Huruf pertama: " + nama.charAt(0));
        System.out.println("Mengandung 'a': " + nama.contains("a"));
        System.out.println("Mengganti huruf: " + nama.replace("a", "i"));
        System.out.println("Menghapus spasi: " + nama.trim());

        input.close();
    }
}
