import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        // indices:      0  1  2  3  4
        /* int[] numbers = {6, 5, 8, 7, 11};
        System.out.println("Index of the smallest number: " + App.indexOfSmallest(numbers)); */
        // indices:       0  1  2  3   4
        /* int[] numbers = {-1, 6, 9, 8, 12};
        System.out.println(App.indexOfSmallestFrom(numbers, 0));
        System.out.println(App.indexOfSmallestFrom(numbers, 1));
        System.out.println(App.indexOfSmallestFrom(numbers, 2)); */

/*         int[] numbers = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(numbers));

        App.swap(numbers, 1, 0);
        System.out.println(Arrays.toString(numbers));

        App.swap(numbers, 0, 3);
        System.out.println(Arrays.toString(numbers)); */


        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        App.sort(numbers);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (Integer i: array) {
            if (i < smallest) {
                smallest = i;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }
        return index ;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int index = startIndex;
        int smallest = table[startIndex];
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int swap = array[index1];
        array[index1] = array[index2];
        array[index2] = swap;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            swap(array, indexOfSmallestFrom(array, i), i);;
            System.out.println(Arrays.toString(array));
        }
    }
}
