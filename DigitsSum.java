import java.util.Scanner;

public class DigitsSum {

    static Integer digitsSum(Integer number) {
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Any Number");
        int number = scanner.nextInt();

        scanner.close();
        System.out.println("Digits sum for " + number + " is " + digitsSum(number));
    }
}
