public class ArrayUebungen {

    //Aufgabe 1:
    public static int getSum(int[] elements) {
        int sum = 0;
        for (int element : elements) {
            sum += element;

        }
        return sum;

    }
    //Aufgabe 2:
    public static int getSum(int[][] elements) {
        int totalSum = 0;

        for (int[] row : elements) {
            int rowSum = getSum(row);
            totalSum += rowSum;
        }

        return totalSum;
    }

    //Aufgabe 3:
    public static int[] concatenate(int[] arr1, int[] arr2) {
        int newLength = arr1.length + arr2.length;

        int[] result = new int[newLength];

        // Kopieren der Elemente von arr1 in das neue Array
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }

        // Kopieren der Elemente von arr2 in das neue Array, an die Position nach den Elementen von arr1
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }
        return result;

    }
    //Aufgabe 4:
    public static int[] filter(int[] arr, int min, int max) {
        // Überprüfe, ob das Eingabearray null ist
        if (arr == null) {
            return null;
        }

        // Zähle die Elemente, die im Filterbereich liegen
        int count = 0;
        for (int element : arr) {
            if (element >= min && element <= max) {
                count++;
            }
        }

        // Erstelle ein neues Array mit der korrekten Größe
        int[] result = new int[count];
        int index = 0;

        // Fülle das neue Array mit den gefilterten Elementen
        for (int element : arr) {
            if (element >= min && element <= max) {
                result[index++] = element;
            }
        }

        return result;
    }

    //Werte:
    public static void main(String[] args) {
        // Aufgabe 2:
        int[][] array2D = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        int sum = getSum(array2D);
        System.out.println("Summe aller Elemente: " + sum);
        // Aufgabe 3:
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] concatenatedArray = concatenate(arr1, arr2);

        for (int value : concatenatedArray) {
            System.out.print(value + " ");
        }
        System.out.println();
        // Aufgabe 4:
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int min = 3;
        int max = 7;

        int[] filteredArray = filter(arr, min, max);

        if (filteredArray != null) {
            System.out.print("Gefiltertes Array: ");
            for (int i = 0; i < filteredArray.length; i++) {
                System.out.print(filteredArray[i] + " ");
            }
            System.out.println();
        }
        //
    }
}
