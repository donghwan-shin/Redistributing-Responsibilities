package example.project.Refactoring;

public class ExtractMethods {

    static int[] initialiseArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        return array;
    }

    static void printArrayWithDelimiter(int[] array, String delimiter) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + delimiter);
        }
        System.out.println();
    }

    public static void foo_after_refactoring() {
        // initialise an array of random numbers with the size of 10
        int[] array1 = initialiseArray(10);

        // print the array with a given delimiter
        printArrayWithDelimiter(array1, " ");

        // initialise another array of random numbers with the size of 10
        int[] array2 = initialiseArray(10);

        // print the array with a given delimiter
        printArrayWithDelimiter(array2, " ");
    }
}