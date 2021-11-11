import java.util.Scanner;

public class CompareNumbers {
    
    public static void main(String[] args) {
        int num1, num2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter fist number");
        num1 = scanner.nextInt();

        System.out.println("Enter fist number");
        num2 = scanner.nextInt();

        scanner.close();

        if(num1 > num2) {
            System.out.println("First number " + num1 +  " is greater than second number " + num2);
        } else if(num1 < num2) {
            System.out.println("First number " + num1 +  " is less than second number" + num2);
        } else 
            System.out.println("Numbers are equal");
    }
}
