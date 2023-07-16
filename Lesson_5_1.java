import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Lesson_5_1 {
    String[] names = new String[]{
            "Иванов Роман Артёмович", "Белов Роман Артёмович", "Истомин Иван Давидович",
            "Дубовцева Татьяна Олеговна", "Дорн Артём Владимирович", "Панфилов Иван Максимович",
            "Молчунов Гордей Георгиевич", "Песах Артемий Михайлович", "Романов Дмитрий Артемьевич",
            "Димитрова Марьям Мироновна"
    };
    Integer[] numbers = new Integer[]{
            3205034, 3209067, 3205555, 3206689, 3208890,
            3201123, 3206090, 3201232, 3208075, 3203565
    };
    Map<String, ArrayList<Integer>> phoneBook = new HashMap<>() {
        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            forEach((key, value) -> stringBuilder.append(String.format("%30s ",key)).append(" ").append(value).append("\n"));
            return stringBuilder.toString();
        }
    };

    public int getNumber() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            if(phoneBook.containsKey(names[i])) {
                phoneBook.get(names[i]).add(numbers[i]);
            }
            else{
                list.add(numbers[i]);
                phoneBook.put(names[i],list);
            }
    }   return(0);
    }
}


