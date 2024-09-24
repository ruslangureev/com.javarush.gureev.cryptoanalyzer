import java.io.IOException;
import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        System.out.println("Шифр Цезаря");
        System.out.println("Что будем делать?");
        System.out.println("1. Шифруем");
        System.out.println("2. Деифруем");
        System.out.println("3. Взлом");

        Scanner console = new Scanner(System.in);
        int vibor = Integer.parseInt(console.nextLine());

        try {
            if (vibor == 1) {
                CaesarEncryption.encrypt();
            } else if (vibor == 2) {
                CaesarDecryption.decrypt();
            } else if (vibor == 3) {
                BruteForce.bruteForce();
            } else {
                System.exit(1);
            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
