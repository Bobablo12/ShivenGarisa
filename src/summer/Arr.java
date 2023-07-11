package summer;

import java.util.Arrays;

public class Arr {
    public static void main(String args[]) {
        int[] arr = {1,2,3,4};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int[] arr2 = new int[3]; // [0,0,0]
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 5;
        } 
        arr2[1] = 687;
        System.out.println(Arrays.toString(arr2));

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

        int[] randomArray = {23, 54, 12, 67, 87, 34, 56, 91, 18, 75};
        double mean = 0.0;
        double median = 0.0;
        int range = 0;

        int sum = 0;
        for (int i = 0; i < randomArray.length; i++) {
            sum += randomArray[i];
        }
        mean = (double) sum / randomArray.length;

        Arrays.sort(randomArray);
        if (randomArray.length % 2 == 0) {
            int mid1 = randomArray.length / 2 - 1;
            int mid2 = randomArray.length / 2;
            median = (double) (randomArray[mid1] + randomArray[mid2]) / 2;
        } else {
            int mid = randomArray.length / 2;
            median = randomArray[mid];
        }

        int min = randomArray[0];
        int max = randomArray[randomArray.length - 1];
        range = max - min;

        System.out.println("Random Array: " + Arrays.toString(randomArray));
        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Range: " + range);
    }
}