import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];   //Initialization of array
        
        System.out.print("Enter the number of elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();  //Takes input from user
        }

        System.out.print("Array elements are : ");
        for(int i = 0; i < arr.length; i++){
        System.out.print(arr[i] + " ");  //Prints the array elements
        }

        //Another methods for printing array
        //for(int num : arr){         //Enhanced for loop OR For each loop
        //    System.out.print(num + " ");
        //}
    }
}