import java.util.Scanner;

public class CountStringChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter ay text");

        String enteredText = scanner.nextLine();

        scanner.close();

        char[] chars = enteredText.toCharArray();


        int letters = 0;
        int numbers = 0;
        int spaces = 0;
        int others = 0;

        for (int i = 0; i < enteredText.length(); i++) {
            if (Character.isLetter(chars[i])) {
                letters++;
            }else if (Character.isDigit(chars[i])) {
                numbers++;
            } else if (Character.isSpaceChar(chars[i])) {
                spaces++;
            } else {
                others++;
            }
            
        }

        System.out.println("Letters : " + letters);
        System.out.println("Numbers : " + numbers);
        System.out.println("Spaces : " + spaces);
        System.out.println("Others : " + others);
    }
}
