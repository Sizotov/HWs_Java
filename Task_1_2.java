
/**
* Вычислить n! (произведение чисел от 1 до n)
 */
public class Task_1_2 {
    public static void main(String[] args) {
        System.out.println  (func(10));
    }
    public static int func (int n) {

        if (n == 1) {
            return 1;
        }
        return n * func(n - 1);
    }

}
