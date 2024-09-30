import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class TestSearchFileTXT {

    public static void main(String[] args) throws IOException {

        //Path path = Path.of("ExamTest");
/**
 * 1-List<Path> walk = Files.walk(Path.of("ExamTest")).toList();
 * buyoda po'lni adress beriladi;
 *
 */
        List<Path> walk = Files.walk(Path.of("ExamTest")).toList();



        for (Path path : walk) {
            if (Files.isRegularFile(path)){
                System.out.println(path);
            }else if (Files.isDirectory(path)){

            }

        }

        /**
         *   Pattern OnlyDigit = Pattern.compile("\\d{1}");
         *
         *         Pattern Digit2 = Pattern.compile("\\d{2}");
         *
         *         Pattern Digit3 = Pattern.compile("[3-8]{3}");
         *
         *         Pattern Digit4 = Pattern.compile("\\b[a-z]{3,7}");
         *
         *         Pattern Digit5 = Pattern.compile("\\b[A-Z]{4,7}");
         *
         *         Pattern Digit6 = Pattern.compile("free");
         *
         *         Pattern Digit7 = Pattern.compile("\\b[a-zA-Z]*stu");
         *
         *
         *
         *         //task1
         *         int digit1=0;
         *         Matcher matcher1 = OnlyDigit.matcher(text);
         *         while (matcher1.find()){
         *             digit1++;
         *             System.out.print(matcher1.group());
         *         }
         */


    }
}
