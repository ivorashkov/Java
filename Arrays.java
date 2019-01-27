import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(array1));
        //            int[] array = new int[] {1, 2, 3, 4, 5, 6};
//
//            //създава се фор цикъл за обхождане на масива по дължина и извеждането на елементите в него
//            for(int index = 0; index < array.length; index++){
//                System.out.printf("element[%d] = %s%n", index, array[index]);
    }


    public static void mathMethod() {
        double[] myList = {1.9, 2.9, 3.4, 3.5};

        // Print all the array elements
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }

        // Summing all elements
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.println("Total is " + total);

        // Finding the largest element
        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) max = myList[i];
        }
        System.out.println("Max is " + max);

    }

    // For-each
    public static void citiesMethod() {
        String[] cities = new String[]{"Byala", "Ruse", "Sofia", "Kazanlak"};
        for (String city : cities) {
            System.out.println(city);
        }
    }

    public static void numbersMethod() {
        Integer[] numbers = new Integer[]{1, 2, 3, 4, 5, 6};
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }

    public static void wordsMethod() {
        String[] words = new String[]{"or", "that", "is", "it"};
        for (String word : words) {
            System.out.printf("Words are: %s%n", word);
        }
    }

    public static void namesMethod() {
        String[] names = new String[]{"Ivo", "Kolio", "Nelly"};
        for (String name : names) {
            System.out.printf("Names: %s%n", name);
        }
    }

    public static void matrixMethod() {
        int[][] matrix = {
                {1, 2, 3, 4, 5, 6}, // row 0 values
                {7, 8, 9, 10, 11, 12} //row 1 values
        };

        //Print the matrix on the console
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.printf("%d", matrix[row][col]);
            }
            System.out.println();
        }
    }

    public static void matrixScannerMethod() {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        int cols = input.nextInt();

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.printf("matrix[%d,%d] =", row, col);
                matrix[row][col] = input.nextInt();
            }
        }
        // System.out.println(Arrays.deepToString(matrix));
    }

    public static void reversedArrayMethod() {
        int[] array = new int[]{1, 2, 4, 5};
        System.out.print("Reversed: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

    }
    public  static void symetricArrayMethod(){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = input.nextInt();
        }
        boolean symmetric = true;
        for (int i = 0; i < (array.length +1)/2; i++){
            if (array[i] != array[n - i - 1])
                symmetric = false;
        }
        System.out.printf("Symmetric? %b%n", symmetric);

//        int [] array = new int [] {1,2,3,3,2,1};
//        for (int index = 0; index < array.length; index++){}
//
//        boolean symmetric = true;
//        for(int i = 0; i < (array.length + 1)/2; i++){
//            if (array[i] != array[array.length - i - 1])
//                symmetric = false;
//        }
//        System.out.printf("Symmetric? %b%n", symmetric);
    }
}
