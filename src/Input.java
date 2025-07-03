import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private static Scanner sc = new Scanner(System.in);

    public static byte readByte(String message){
        while (true) {
            try {
                System.out.print(message + " ");
                return sc.nextByte();
            } catch (InputMismatchException e) {
                System.out.println("Format error.");
                sc.nextLine();
            }
        }

    }

    public static int readInt(String message){
        while (true) {
            try {
                System.out.print(message + " ");
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Format error.");
                sc.nextLine();
            }
        }
    }

    public static double readDouble(String message) {
        while (true) {
            try {
                System.out.print(message + " ");
                return sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Format error.");
                sc.nextLine();
            }
        }
    }

    public static float readFloat(String message) {
        while (true) {
            try {
                System.out.print(message + " ");
                return sc.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("Format error.");
                sc.nextLine();
            }
        }
    }

}
