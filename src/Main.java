import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Pavel\\IdeaProjects\\Laba16_moduli\\input_code.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("output_code.txt")))
        {
            String str;
            StringBuilder code = new StringBuilder();

            Pattern pattern = Pattern.compile("(/\\*([\\S\\s]+?)\\*/)|(//.*)");

            while ((str = reader.readLine()) != null){
                code.append(str).append("\n");
            }

            str = code.toString();
            Matcher matcher = pattern.matcher(str);
            str = matcher.replaceAll("");

            writer.write(str);
            System.out.println("Комментарии удалены, а запись удалась");
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}