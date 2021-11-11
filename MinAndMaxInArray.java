public class MinAndMaxInArray {
    public static void main(String[] args) {
        int myArray[] = {23, 67, 25, 10, 9, 45};

        int max = myArray[0];
        int min = myArray[0];

        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] < min) 
                min = myArray[i];
            if(myArray[i] > max)
                max = myArray[i];
        }

        System.out.println("Min " + min + " and Max " + max);
    }
}
