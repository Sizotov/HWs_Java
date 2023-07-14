import java.util.ArrayList;
import java.util.Collections;

public class Lesson_4_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(12);
        list.add(21);
        list.add(13);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }

}
