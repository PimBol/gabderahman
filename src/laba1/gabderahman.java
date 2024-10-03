import java.util.Scanner;

public class gabderahman {

    public static int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        int result = gcd(num1, num2);
        System.out.println("Наибольший общий делитель (" + num1 + ", " + num2 + ") = " + result);

        scanner.close();
    }
}
