import java.util.Iterator;
import java.util.LinkedList;

public class Lesson_4_3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(6);
        list.add(5);
        list.add(3);
        list.add(1);
        Iterator<Integer> iterator = list.iterator();
        int sum = 0;
        while (iterator.hasNext()){
            sum += iterator.next();
        }
        System.out.println(sum);
    }
}
