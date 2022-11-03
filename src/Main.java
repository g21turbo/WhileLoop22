import java.util.Scanner;

public class Main {

    // while loop - executes a block of code as long
    //              as its condition remains true

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (name.isBlank()) {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();

        }
        isAlphabetic(name);
    }


    //Input validation
    public static boolean isAlphabetic(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isLetter(s.charAt(i))) {
                System.out.println("Invalid input -  Please enter" +
                        " characters only");
                return false;

            } else {
                System.out.println("Hello " + s);
                return true;
            }
        }
        return false;
    }
}
