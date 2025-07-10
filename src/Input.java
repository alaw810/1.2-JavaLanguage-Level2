import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private static final Scanner sc = new Scanner(System.in);

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


    public static char readChar(String message) {
        while (true) {
            System.out.print(message + " ");
            String input = sc.nextLine().trim();
            try {
                if (input.length() != 1) {
                    throw new InvalidInputException("You must enter exactly one character.");
                }
                return input.charAt(0);
            } catch (InvalidInputException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }

        }
    }

    public static String readString(String message) {
        while (true) {
            System.out.print(message + " ");
            String input = sc.nextLine().trim();
            try {
                if (input.isEmpty()) {
                    throw new InvalidInputException("Input cannot be empty.");
                }
                return input;
            } catch (InvalidInputException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }
    }

    public static boolean readYesNo(String message) {
        while (true) {
            System.out.print(message + " ");
            String input = sc.nextLine().trim().toLowerCase();
            try {
                if (input.equals("y")) {
                    return true;
                } else if (input.equals("n")) {
                    return false;
                } else {
                    throw new InvalidInputException("Please enter 'y' for yes or 'n' for no.");
                }
            } catch (InvalidInputException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }

    }

}
