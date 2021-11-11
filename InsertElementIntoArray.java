public class InsertElementIntoArray {
    public static void main(String[] args) {
        
        int my_array[] = {1,2,3,5,6,7,8,9,10};

        int index_to_insert = 3;

        for(int i = my_array.length - 1; i > index_to_insert; i--) {
            my_array[i] = my_array[i - 1];
        }

        int value_to_insert = 4;

        my_array[index_to_insert] = value_to_insert;

        for(int j = 0; j < my_array.length + 1; j++) {
            System.out.print(my_array[j] + " ");
        }
        
    }
}
