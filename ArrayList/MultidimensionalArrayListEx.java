import java.util.ArrayList;
import java.util.Scanner;

public class MultidimensionalArrayListEx{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        //Initialization
        for(int i = 0; i < 3; i++){
            list.add(new ArrayList<>());
        }

        //add elements
        System.out.println("Enter 9 elements : ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
}