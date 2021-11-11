public class SwitchArrayElements {
    public static void main(String[] args) {
        int[] my_array = { 1, 2, 3, 4, 5,6 };

        for (int i = 0; i < my_array.length / 2; i++) {
            int temp = my_array[i];

            my_array[i] = my_array[my_array.length - i - 1];
            my_array[my_array.length - i - 1] = temp;
        }

        for (int el : my_array) {
            System.out.print( el + " ");
        }
    }
}
