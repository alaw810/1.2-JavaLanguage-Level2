## 📄 Description – Exercise Statement

- Create a class called `Input`. This class is responsible for handling various keyboard input exceptions using Java's
  `Scanner` class.

- The first step is to instantiate a `Scanner` object. Then, create **static methods** to read different types of data
  from the keyboard.

- Each method must:
    - Accept a `String` parameter with the message to display to the user (e.g., `"Enter your age:"`)
    - Handle possible exceptions
    - **Keep prompting** the user until the input is valid
    - Return the correctly typed value entered by the user

---

### Required Methods

#### These methods must catch `InputMismatchException`:

```java
public static byte readByte(String message);

public static int readInt(String message);

public static float readFloat(String message);

public static double readDouble(String message);
```

#### These methods must use a custom exception derived from `Exception`:

```java
public static char readChar(String message);

public static String readString(String message);

public static boolean readYesNo(String message);
```

The method `readYesNo()` returns:

- `true` if the user enters `"y"`

- `false` if the user enters `"n"`

- It repeats the prompt otherwise, using a custom `InvalidInputException`.

---

## 💻 Technologies Used

- Java 21
- IntelliJ IDEA (or any other Java IDE)
- Git & GitHub (optional, for version control)

---

## 📋 Requirements

- Java SDK 21 or higher
- An IDE like IntelliJ IDEA or Eclipse
- Git installed (optional)

---

## 🛠️ Installation

1. Clone the repository (if available):

   ```bash
   git clone https://github.com/alaw810/1.2-JavaLanguage-Level2.git

2. Open the project in IntelliJ IDEA:

    File → Open → Select the project folder

3. Set the correct Java SDK:

    File → Project Structure → SDKs → Java 21+

---

## ▶️ Execution

1. Open the `Main.java` file.

2. Run the `main()` method.

3. You will be prompted to enter various types of data (byte, int, float, etc.). The program will validate input and
   provide clear error messages if input is invalid.

4. At the end, a summary of all entered values is shown.

--- 

## 🌐 Deployment

This is a Java console-based educational exercise and doesn't require production deployment.
If desired, you can compile and run it manually:

    javac *.java
    java Main

Or export it as a `.jar` file using IntelliJ IDEA.

---

## 🤝 Contributions

This is a learning project for academic practice.
However, improvements are welcome!

1. Fork the repo

2. Create a new branch (`git checkout -b feature/your-feature`)

3. Commit and push your changes

4. Open a Pull Request
