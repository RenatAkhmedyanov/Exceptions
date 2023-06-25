import java.util.Arrays;
import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        int[] firstArray = generateArray();
        System.out.println(Arrays.toString(firstArray));
        int[] secondArray = generateArray();
        System.out.println(Arrays.toString(secondArray));

        try {
            double[] array = divideTwoArrays(firstArray, secondArray);
            System.out.println(Arrays.toString(array));
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Разные длины массивов!");
        }
    }

    public static double[] divideTwoArrays(int[] firstArray, int[] secondArray) throws RuntimeException {
        if (firstArray.length != secondArray.length){
            throw new ArrayIndexOutOfBoundsException();
        }
        double[] array = new double[firstArray.length];
        for (int i = 0; i < array.length; i++) {
            if (secondArray[i] == 0) {
                throw new ArithmeticException();
            }
            double result = (double) firstArray[i] / secondArray[i];
            array[i] = (double) Math.round(result * 100) / 100;
        }
        return array;
    }

    public static int[] generateArray() {
        System.out.println("Введите длину массива: ");
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }
}
