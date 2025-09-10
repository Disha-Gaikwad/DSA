import java.util.Arrays;

public class SwapTwoElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(arr));
        swap(arr, 1, 3);
        System.out.println("Array after swapping elements at index 1 and 3: " + Arrays.toString(arr));
    }
    
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    
}
