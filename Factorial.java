import java.util.Scanner;

public class Factorial {

    static Integer getFactorial(Integer n) {

        int factorial = 1;

        for (int i = 0; i < n; i++) {
            factorial *= (n - i);
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Any Number");
        int number = scanner.nextInt();

        scanner.close();
        System.out.println(number + "! = " + getFactorial(number));
    }
}
