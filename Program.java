import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws MyStringNullException {
        //float n = task1();
        //System.out.println(n);
        //task2();
        //task3();
        task4();
    }

    public static float task1(){
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        float num;
            try {
                num = scanner.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("Incorrect form! Enter a number: ");
                Scanner scanner1 = new Scanner(System.in);
                num = scanner1.nextFloat();
            }
        return num;
    }

    public static void task2() {
        int[] intArray = {1, 8, 9, 7, 6, 7, 8,7 ,4};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e.getMessage());
        }
    }

    public static void task3() {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

    public static void task4() throws MyStringNullException {
        System.out.println("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String a;
        a = scanner.nextLine();
        if (a.isEmpty()){
            throw new MyStringNullException("a might not be empty!");
        }
        System.out.println(a);
    }


}

class MyStringNullException extends Exception{
    public MyStringNullException(String message){
        super(message);
    }
}
