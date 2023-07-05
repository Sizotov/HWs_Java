
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import org.json.*;









/**
 * Получить исходную json строку из файла, используя FileReader или Scanner
 * Дана json строка вида:
 * String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
 * "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
 * "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
 *
 * Задача написать метод(ы), который распарсить строку и выдаст ответ вида:
 * Студент Иванов получил 5 по предмету Математика.
 * Студент Петрова получил 4 по предмету Информатика.
 * Студент Краснов получил 5 по предмету Физика.
 *
 * Используйте StringBuilder для подготовки ответа. Далее создайте метод, который запишет
 * результат работы в файл. Обработайте исключения и запишите ошибки в лог файл с помощью Logger.
 */

public class Lesson_2 {
    public static void main(String[] args) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        String json = new StringBuilder().append("[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},")
                                         .append("{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},")
                                         .append("{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]").toString();
       JSONArray jsonArray = new JSONArray (json);
        for (int i = 0; i < jsonArray.length() ; i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            stringBuilder.append("Студент").append(jsonObject.getString("фамилия")).append("получил").append(jsonObject.gerString("оценка")).append("по предмету").append("по предмету").append(jsonObject.getString("предмет")).append(".n");
        }
        File outputFile = new File("output.txt");
        File logFile = new File("log.txt");
        try {
            FileWriter writer = new FileWriter(outputFile);
            writer.write(stringBuilder.toString());
            writer.close();
        } catch (FileNotFoundException e) {
            FileWriter logWriter = new FileWriter(logFile, true);
            logWriter.write("Упс: файл не был найден.n");
            logWriter.close();
        } catch (IOException e) {
            FileWriter logWriter = new FileWriter(logFile, true);
            logWriter.write("Упс: " + e.getMessage() + "n");
            logWriter.close();
        }
    }
}

