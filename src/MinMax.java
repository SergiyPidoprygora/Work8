import java.util.Arrays;
import java.util.Random;

public class MinMax {
    public static void main(String[] args) {
        int[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int max = intArray[0];
        int min = intArray[0];
        for(int i = 0; i < 10; i++) {
            if (max < i); {
                max = i;
            }
            if (min > i) {
                min = i;
            }
        }
            System.out.println("Min:  " +min);
            System.out.println("Max:  " +max);
        }

    }

