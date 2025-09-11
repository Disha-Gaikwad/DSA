import java.util.Arrays;

public class MaxVal {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8, -1};
        System.out.println("Maximum value: " + max(arr));
    }
    
    static int max(int[] arr){
        int maxno = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i]> maxno){
                maxno = arr[i];
            }
        }
        return maxno;
    }
}