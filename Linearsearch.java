//Linear search implementati
public class LinearSearch {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; 
            }
        }
        return -1; // Return -1 if target is not found
    }

    public static void main(String[] args) {
        int[] numbers = {5, 12, 3, 9, 1, 7};
        int targetValue = 9;

        int result = linearSearch(numbers, targetValue);

        if (result != -1) {
            System.out.println("Element " + targetValue + " found at index: " + result);
        } else {
            System.out.println("Element " + targetValue + " not found in the array.");
        }
    }
}
