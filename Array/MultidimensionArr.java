import java.util.Arrays;
import java.util.Scanner;

public class multidimensionArr{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Enter the elements of the array : ");
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }
        }

        //Output using For loop
        System.out.println("Output using for loop");
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        //Output using toString() method
        System.out.println("Output using toString() method");
        for(int row = 0; row < arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        } 

        //Output using for each loop
        System.out.println("Output using for each loop");
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
}
}