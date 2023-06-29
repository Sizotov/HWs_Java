import java.util.Scanner;

/**
 * Реализовать простой калькулятор
 */
public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int n1 = scanner.nextInt();
        System.out.println("Введите операцию(+, -, *, /): ");
        char operation = scanner.next().charAt(0);
        System.out.println("Введите второе число: ");
        int n2 = scanner.nextInt();
        int summa;
        switch (operation) {
            case '+': summa = n1 + n2;
                break;
            case '-': summa = n1 - n2;
                break;
            case '*': summa = n1 * n2;
                break;
            case '/': summa = n1 / n2;
            default:
                System.out.println("Упс! Неправильная операция!");
                return;
        }
        System.out.print("Результат: \n");
        System.out.format(n1 + " " + operation + " " + n2 + " = " + summa);
}
}
