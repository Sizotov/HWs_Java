import java.util.ArrayList;

public class Lesson_3_1 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array = FillRandomArray(10);
        PrintArray(array);
        DeleteNumber(array);
        PrintArray(array);
    }
    public static void PrintArray(ArrayList<Integer> arr) {
        for (int element : arr) {
            System.out.printf("%d, ", element);
        }
        System.out.println();
}
    public static ArrayList<Integer> FillRandomArray(int n) {
        ArrayList <Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add((int)(Math.random()*100));
        }
        return list;
    }
    public static void DeleteNumber(ArrayList<Integer> list){
        int i = 0;
        while (i < list.size()){
            if(list.get(i) % 2 == 0) list.remove(i);
            else i++;
        }
    }
}