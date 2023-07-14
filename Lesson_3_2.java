import java.util.ArrayList;

public class Lesson_3_2 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list = FillRandomArray(10);
        PrintArray(list);
        int max = findMax(list);
        int min = findMin(list);
        Double middleCount = findMiddle(list);
        System.out.printf("Максимальный элемент: %d \n", max);
        System.out.printf("Минимальный элемент: %d \n", min);
        System.out.printf("Среднее арифметическое: %.1f \n", middleCount);
    }
    static Double findMiddle(ArrayList<Integer> array) {
        int sum = 0;
        for(int element : array){
            sum += element;
        }
        Double avg = Double.valueOf(sum)/Double.valueOf(array.size());
        return avg;
    }
    static void PrintArray(ArrayList<Integer> arr) {
        for (int element : arr) {
            System.out.printf("%d, ", element);
        }
        System.out.println();
    }
    static ArrayList<Integer> FillRandomArray(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add((int) (Math.random() * 100));
        }
        return(list);
    }
    static int findMax(ArrayList<Integer> arr){
        int max=arr.get(0);
        for(int element:arr){
        if(element > max)
        max = element;
        }
        return max;
        }
    static int findMin(ArrayList<Integer> arr){
        int min = arr.get(0);
        for(int element:arr){
        if(element < min)
        min = element;
        }
        return min;
}
}




