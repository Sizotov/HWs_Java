import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Lesson_3_3 {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();
        planets.add("Venus");
        planets.add("Mars");
        planets.add("Earth");
        planets.add("Jupiter");
        planets.add("Moon");
        planets.add("Mercury");
        planets.add("Pluto");
        planets.add("Uranus");
        planets.add("Neptune");
        planets.add("Saturn");
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Venus");
        planets.add("Moon");
        System.out.println(planets);
    }
    static void PrintArray(ArrayList<Integer> arr) {
    Random rand = new Random();
        for (int element : arr) {
            System.out.println(Collections.frequency(arr,"venus"));
        }
    }
}