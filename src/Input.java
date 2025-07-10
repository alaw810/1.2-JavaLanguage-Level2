import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private static Scanner sc = new Scanner(System.in);

    public static byte readByte(String message) {
        while (true) {
            try {
                System.out.print(message + " ");
                return sc.nextByte();
            } catch (InputMismatchException e) {
                System.out.println("Format error. Please enter a valid byte number.");
                sc.nextLine();
            }
        }
    }

    public static int readInt(String message) {
        while (true) {
            try {
                System.out.print(message + " ");
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Format error. Please enter a valid integer.");
                sc.nextLine();
            }
        }
    }

    public static double readDouble(String message) {
        while (true) {
            try {
                System.out.print(message + " ");
                double d = sc.nextDouble();
                sc.nextLine();
                return d;
            } catch (InputMismatchException e) {
                System.out.println("Format error. Please enter a valid double using a comma.");
                sc.nextLine();
            }
        }
    }

    public static float readFloat(String message) {
        while (true) {
            try {
                System.out.print(message + " ");
                float f = sc.nextFloat();
                sc.nextLine();
                return f;
            } catch (InputMismatchException e) {
                System.out.println("Format error. Please enter a valid float using a comma.");
                sc.nextLine();
            }
        }
    }

}
