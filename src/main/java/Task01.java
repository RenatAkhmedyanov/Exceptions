import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Выберите один из трёх вариантов (0 для выхода): \n" +
                "1 - вызвать NullPointerException\n" +
                "2 - вызвать FileNotFoundException\n" +
                "3 - вызвать ArrayIndexOutOfBoundsException");
        Scanner scn = new Scanner(System.in);
        int input;
        while ((input = scn.nextInt()) != 0){
            switch (input) {
                case 1:
                    firstMethod();
                    break;
                case 2:
                    secondMethod();
                    break;
                case 3:
                    thirdMethod();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Нажмите 1, 2 или 3 (0 - для выхода)");
            }
        }
    }

    public static void firstMethod() throws NullPointerException {
        throw new NullPointerException("Вызван NullPointerException");
    }

    public static void secondMethod() throws FileNotFoundException {
        throw new FileNotFoundException("Вызван FileNotFoundException");
    }

    public static void thirdMethod() throws ArrayIndexOutOfBoundsException {
        throw new ArrayIndexOutOfBoundsException("Вызван ArrayIndexOutOfBoundsException");
    }
}
