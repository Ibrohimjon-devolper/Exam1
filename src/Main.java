import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Main {
    public static void main(String[] args) throws IOException {


        Path sourse = Path.of("TestTxt/Test1.txt");
        Path target = Path.of("TestTxt/q1.txt");
//        Files.copy(sourse, target);

        String s1 = "qwfkwjhgfahefilhfqieahfiaegf9pq3hfg";


        Files.writeString(sourse,s1, StandardOpenOption.APPEND);



    }
}