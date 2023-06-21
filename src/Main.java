import java.util.Random;
import java.util.Arrays;

// Створити програму в якій потрібно створити масив з 10 елементів та заповнити його випадковими числами
// Вивести його на консоль
public class Main {
    public static void main(String[] args) {
        int[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            intArray[i] = random.nextInt(100);
            System.out.print(intArray[i] + " ");
        }
    }
}