public class Main {
    public static void main(String[] args)  {
        byte b = Input.readByte("Enter a byte number:");
        int i = Input.readInt("Enter an integer number:");
        double d = Input.readDouble("Enter a double number:");
        float f = Input.readFloat("Enter a float number:");
        char c = Input.readChar("Enter a char:");
        String s = Input.readString("Enter a string:");
        boolean yesNo = Input.readYesNo("Enter 'y' for yes or 'n' for no");
    }
}
