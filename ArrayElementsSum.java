import java.util.Scanner;

public class ArrayElementsSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size");

        int n = scanner.nextInt();
        int numbers[] = new int[n];

        int sum = 0;
        int average = 1;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter " + (i + 1) + " number  : ");
            numbers[i] = scanner.nextInt();
        }

        scanner.close();
        // for (int i = 0; i < numbers.length; i++) {
        // sum += numbers[i];
        // }

        for (int element : numbers) {
            sum += element;
        }
        average = sum / numbers.length;

        System.out.println("SUM : " + sum);
        System.out.println("AVERAGE : " + average);
    }
}