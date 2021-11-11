import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any text");
        String text = scanner.nextLine();

        scanner.close();

        char charsArray[] = text.toCharArray();

        String reversedString = "";

        for (int i = charsArray.length - 1; i >= 0; i--) {
            reversedString += charsArray[i];   
        }

        System.out.println("Reversed String : ");
        System.out.println(reversedString);
    }
}
