public class Main {
    public static void main(String[] args) {
        byte b = Input.readByte("How old are you?");
        int i = Input.readInt("What year were you born?");
        double d = Input.readDouble("What's your current weight in kilograms?");
        float f = Input.readFloat("How tall are you in meters?");
        char c = Input.readChar("What's the first letter of your name?");
        String s = Input.readString("Where do you live?");
        boolean yesNo = Input.readYesNo("Do you like pizza? (y/n)");

        // Summary
        System.out.println("\n--- Summary of your input ---");
        System.out.println("Age: " + b);
        System.out.println("Year of birth: " + i);
        System.out.println("Weight: " + d + " kg");
        System.out.println("Height: " + f + " m");
        System.out.println("First letter of your name: " + c);
        System.out.println("City: " + s);
        System.out.println("Likes pizza: " + (yesNo ? "Yes" : "No"));

    }
}
