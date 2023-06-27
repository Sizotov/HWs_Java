import java.util.Scanner;

/**
 * Вычислить n-ое треугольного число (сумма чисел от 1 до n)
 */

public class Task_1_1 {
    public static void main(String[] args) {
        System.out.print("Введите любое целое число от 1 до 10: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println ("Вы ввели число " + number);
        for (int i = 1;i <= number; i++) {
            if (i != number) {
                System.out.print(i + "+");
            } else {
                System.out.print(i + "=");
            }
        }
        System.out.print(number*(number+1)/2);
    }

}
