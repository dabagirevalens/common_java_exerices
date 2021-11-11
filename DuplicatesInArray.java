public class DuplicatesInArray {
    public static void main(String[] args) {
        
        int[] myArray = new int[]{1,2,2,3,3,3,4,4,5,5,5,6,7,8,9};

        for(int i = 0; i < myArray.length; i++) {
           for(int j = i + 1; j < myArray.length; j++) {
               if(myArray[i] == myArray[j]) {
                   System.out.println(" " + myArray[j] + " ");
               }
           }
        }
    }
}
