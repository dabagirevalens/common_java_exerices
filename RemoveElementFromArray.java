import java.util.Scanner;

public class RemoveElementFromArray {
    public static void main(String[] args) {

        int [] myArray = {1, 2, 3, 4, 5, 6};
        
        System.out.print("Your recent array is: [ ");

        for (int i : myArray)
            System.out.print(i + " ");
        System.out.print("]");
        System.out.println("");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the removing index: ");

        int removingIndex = scanner.nextInt();
        scanner.close();


        for (int i = removingIndex - 1; i < myArray.length -1; i++) {
            myArray[i] = myArray[i + 1];
        }

        System.out.print("Your new array is: [ ");

        for (int i = 0; i < myArray.length - 1; i++) 
            System.out.print(myArray[i] + " ");
        
        System.out.println("]");
    }
}
