
import java.util.Scanner;

public class Day78 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String user, password;
        String loginUser, loginPassword;

        System.out.print("Buat Username: ");
        user = input.nextLine();

        System.out.print("Buat Password: ");
        password = input.nextLine();

        System.out.println("\n=== LOGIN AKUN ===");

        do {
            System.out.print("Username: ");
            loginUser = input.nextLine();

            System.out.print("Password: ");
            loginPassword = input.nextLine();

            if (!loginUser.equals(user) || !loginPassword.equals(password)) {
                System.out.println("Login gagal! Coba lagi.\n");
            }

        } while (!loginUser.equals(user) || !loginPassword.equals(password));

        System.out.println("Login berhasil! Selamat datang.");

        input.close();
    }
}
