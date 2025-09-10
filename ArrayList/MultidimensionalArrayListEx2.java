import java.util.ArrayList;
import java.util.Scanner;

public class MultidimensionalArrayListEx2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<String>> list = new ArrayList<>(); {
        
        //Create and add inner array list
        ArrayList<String> row1 = new ArrayList<>();
        row1.add("Apple");
        row1.add("Banana"); 
        list.add(row1);

        ArrayList<String> row2 = new ArrayList<>();
        row2.add("Mango");  
        row2.add("Pineapple");
        list.add(row2);

        System.out.println("Elements: " + list);  //Print whole List
        System.out.println("Element at row 0 and column 1: " + list.get(0).get(1)); //Print specific element

    }
   }
}
