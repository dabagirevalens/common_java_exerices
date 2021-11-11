import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number");

        int i = 0;
        int num = 0;

        int n = scanner.nextInt();

        scanner.close();

        // Empty String
        String primeNumbers = "";

        System.out.println("Prime numbers from 1 to " + n + " are :");

        for (i = 1; i <= n; i++) {

            int counter = 0;

            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter ++;
                }
            }
            
            if (counter == 2) {
                primeNumbers += i + " ";
            }
        }
        System.out.println(primeNumbers);
    }
}
