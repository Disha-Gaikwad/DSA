import java.util.Arrays;

public class MaxValInRange {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8, -1};
        System.out.println("Maximum value in range  5 to 2 : " + max(arr, 1 , 3));
    }
    
    static int max(int[] arr, int start, int end){
        if(arr == null || arr.length == 0){
            return -1;  //Edge case
        }
        
        int maxno = arr[start];
        for(int i = start; i <= end; i++){
            if(arr[i]> maxno){
                maxno = arr[i];
            }
        }
        return maxno;
    }
}
