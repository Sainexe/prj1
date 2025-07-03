import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int attempts = 0;
        int number = rand.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Загадано число от 1 до 100. Игра началась!");

        while (true) {
            System.out.print("Введите ваше предположение: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == number) {
                System.out.println("Вы угадали!");
                break;
            } else if (guess < number) {
                System.out.println("Слишком мало");
            } else {
                System.out.println("Слишком много");
            }
        }

        System.out.println("Количество попыток: " + attempts);
        scanner.close();
    }
}
