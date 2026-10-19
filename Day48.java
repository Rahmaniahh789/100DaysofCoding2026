import java.util.Scanner;

public class Day48{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Angka 1: ");
        int a = in.nextInt();
        System.out.print("Angka 2: ");
        int b = in.nextInt();
        System.out.print("Operator: ");
        char op = in.next().charAt(0);

        switch(op){
            case '+': System.out.println(a+b); break;
            case '-': System.out.println(a-b); break;
            case '*': System.out.println(a*b); break;
            case '/': System.out.println(a/b); break;
            default: System.out.println("Salah");
        }
        in.close();
    }
          }
