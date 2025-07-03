// import java.io.FileReader;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.util.HashMap;
// import java.util.Map;
// import org.json.simple.JSONArray;

// public class task3 {
//     public static void main(String[] args) {
//         String testsFilePath = "src/tests.json";
//         String valuesFilePath = "src/values.json";
//         String reportFilePath = "report.json";

//         try {
//             JSONObject testsJson = readJsonFromFile(testsFilePath);
//             JSONObject valuesJson = readJsonFromFile(valuesFilePath);

//             if (testsJson != null && valuesJson != null) {
//                 processTests(testsJson, valuesJson);
//                 writeJsonToFile(testsJson, reportFilePath);
//                 System.out.println("Отчет успешно сформирован в " + reportFilePath);
//             } else {
//                 System.err.println("Ошибка при чтении JSON файлов.");
//             }

//         } catch (IOException e) {
//             System.err.println("Ошибка ввода/вывода: " + e.getMessage());
//         }
//     }

//     private static JSONObject readJsonFromFile(String filePath) throws IOException {
//         try (FileReader reader = new FileReader(filePath)) {
//             StringBuilder jsonString = new StringBuilder();
//             int character;
//             while ((character = reader.read()) != -1) {
//                 jsonString.append((char) character);
//             }
//             return new JSONObject(jsonString.toString());
//         } catch (IOException e) {
//            throw new IOException("Ошибка при чтении файла: " + filePath, e);
//         }
//     }

//     private static void writeJsonToFile(JSONObject json, String filePath) throws IOException {
//         try (FileWriter fileWriter = new FileWriter(filePath)) {
//             fileWriter.write(json.toString(2)); // Добавляем отступы для читабельности
//         } catch (IOException e) {
//            throw new IOException("Ошибка при записи в файл: " + filePath, e);
//         }
//     }

//     private static void processTests(JSONObject testsJson, JSONObject valuesJson) {
//         JSONArray tests = testsJson.getJSONArray("tests");
//         JSONObject valuesMap = valuesJson.getJSONObject("values");

//         for (int i = 0; i < tests.length(); i++) {
//             JSONObject test = tests.getJSONObject(i);
//             processTest(test, valuesMap);
//         }
//     }

//     private static void processTest(JSONObject test, JSONObject valuesMap) {
//         if (test.has("id")) {
//             String id = test.getString("id");
//             if (valuesMap.has(id)) {
//                 test.put("value", valuesMap.get(id));
//             }
//         }

//         if (test.has("values")) {
//             JSONArray values = test.getJSONArray("values");
//             for (int i = 0; i < values.length(); i++) {
//                 JSONObject nestedTest = values.getJSONObject(i);
//                 processTest(nestedTest, valuesMap);
//             }
//         }
//     }
// }
