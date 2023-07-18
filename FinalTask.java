import java.util.*;

public class FinalTask {
    public static void main(String[] args) {
        Set<NoteBook> set = new HashSet<>();
        NoteBook notebooks1 = new NoteBook(8, 512, "Windows 7", "Золотой");
        NoteBook notebooks2 = new NoteBook(8, 256, "Windows 10", "Металлик");
        NoteBook notebooks3 = new NoteBook(16, 512, "macOS", "Серый космос");
        NoteBook notebooks4 = new NoteBook(16, 256, "Windows 10", "Черный");
        NoteBook notebooks5 = new NoteBook(16, 512, "Windows 8", "Металлик");
        NoteBook notebooks6 = new NoteBook(8, 256, "Windows 7", "Металлик");

        set.add(notebooks1);
        set.add(notebooks2);
        set.add(notebooks3);
        set.add(notebooks4);
        set.add(notebooks5);
        set.add(notebooks6);

        for (NoteBook notebooks : set) {
            System.out.println(notebooks);
        }
        Map<String, Integer> filters = new HashMap();
        System.out.println("Выберите критерий поиск: ");
        System.out.println("1 - Оперативная память ноутбука");
        System.out.println("2 - Объем ЖД ноутбука");
        System.out.println("3 - Операционная система ноутбука");
        System.out.println("4 - Цвет ноутбука");
        Scanner scanner = new Scanner(System.in);
        int filterNumber = scanner.nextInt();
        String filterKey = "";
        switch(filterNumber){
            case 1: filterKey = "ram";
                System.out.println("Введите объем оперативной памяти в ГБ: ");
                int ram = scanner.nextInt();
                filters.put(filterKey, ram);
                break;
            case 2: filterKey = "hdd";
                System.out.println("Введите объем ЖД в ГБ: ");
                int hdd = scanner.nextInt();
                filters.put(filterKey, hdd);
                break;
            case 3: filterKey = "os";
                System.out.println("Введите операционную систему: ");
                String os = scanner.next();
                filters.put(filterKey, os);
                break;
            case 4: filterKey = "color";
                System.out.println("Введите цвет: ");
                String color = scanner.next();
                filters.put(filterKey, color);
                break;
        }

    }

}




