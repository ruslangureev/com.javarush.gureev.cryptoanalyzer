import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class CaesarDecryption {
    static void decrypt() throws IOException {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите путь к файлу: ");
        Path pathIn = Path.of(console.nextLine());

        System.out.println("Введите путь для записи файла:");
        String fileOut = console.nextLine();

        if (Files.exists(pathIn)){

            BufferedReader buffReader = new BufferedReader(Files.newBufferedReader(pathIn));
            char[] inputChar = new char[(int) Files.size(pathIn)];
            int realSizeInputChars = buffReader.read(inputChar);
            BufferedWriter buffWriter = new BufferedWriter(new FileWriter(fileOut), realSizeInputChars);

            System.out.println("Введите ключ: ");
            int key = -Integer.parseInt(console.next());

            buffWriter.write(Algorithm.getCipherChars(inputChar, realSizeInputChars, key));
            buffWriter.flush();
            buffWriter.close();
        } else {
            System.out.println("По данной ссылке файл не найден!");
        }
    }
}
