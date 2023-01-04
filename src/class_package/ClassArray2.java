package class_package;

import java.util.Arrays;
import java.util.Random;

public class ClassArray2 {
    public static void main(String[] args) {

        int[] arrayOfNumbers = {1, 2, 3, 4, 5};

        int sumOfNumbers = 0;
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            sumOfNumbers += arrayOfNumbers[i];
        }
        System.out.println(sumOfNumbers);

        /*arrayOfNumbers[0] = (int) Math.pow(arrayOfNumbers[0], 2);
        arrayOfNumbers[1] = (int) Math.pow(arrayOfNumbers[1], 2);
        arrayOfNumbers[2] = (int) Math.pow(arrayOfNumbers[2], 2);
        arrayOfNumbers[3] = (int) Math.pow(arrayOfNumbers[3], 2);
        arrayOfNumbers[4] = (int) Math.pow(arrayOfNumbers[4], 2);

        System.out.println(Arrays.toString(arrayOfNumbers));*/

       /* for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = (int) Math.pow(arrayOfNumbers[i], 2);
            //System.out.println(arrayOfNumbers[i]);
        }
        System.out.println(Arrays.toString(arrayOfNumbers));
*/
        int[] myArray = createArrayWithRandomNumbers(10);
        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(sortArrayToOddNumbers(myArray)));

    }

    public static int[] createArrayWithRandomNumbers(int lengthOfArray) {
        int[] arrayOfNumbers = new int[lengthOfArray];
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            Random random = new Random();
            arrayOfNumbers[i] = random.nextInt(100);
        }
        return arrayOfNumbers;
    }

    public static int[] sortArrayToOddNumbers(int[] arrayOfNumbers) {
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] % 2 == 0) {
                arrayOfNumbers[i] = 0;
            }
        }
        return arrayOfNumbers;
    }
}
