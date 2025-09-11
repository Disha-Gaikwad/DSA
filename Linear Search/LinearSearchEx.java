import java.util.Arrays;

public class LinearSearchEx{
    public static void main(String[] args){
        int[] arr = {23, 45, 12, 65, -66, 74, 81, 39, -22};
        int target = 74;
        System.out.println("Element found at index : " + LinearS(arr, target));

    }

    static int LinearS(int[] arr,int target){
        if((arr.length == 0) || (arr == null)){
            return -1;  //Edge case
        }

        for(int index = 0; index < arr.length; index++){
            if(arr[index] == target){
                return index;
            }
        }
        return -1;
    }
    
}
