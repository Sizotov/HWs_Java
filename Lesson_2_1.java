import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class Lesson_2_1 {
    public static <args> void main() throws IOException {
        Logger logger = Logger.getLogger(Lesson_2_1.class.getName());
        FileHandler fh = new FileHandler("logLesson_2_1.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info("Массив: ");
        int [] array = {2, 6, 4, -8, 3, 46, 0};
        printArrayInt(array);
        int[] newArr = listSort(array);
        System.out.printf("\n:Отсортированный массив: \n");
        printArrayInt(newArr);
    }
    public static void printArrayInt(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            System.out.printf("%d, ", arr[i]);
        }
            System.out.print(arr[arr.length-1]);
    }
    public static int[] listSort(int [] arr){
        for(int k = 0; k < arr.length-1; k++) {
            for (int i = 0; i < arr.length - k-1; i++){
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    }
                }
            }
            return arr;
        }

    }
