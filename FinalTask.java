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

    }

}




