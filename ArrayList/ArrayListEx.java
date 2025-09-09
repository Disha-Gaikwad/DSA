import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < 4; i++){
            list.add(in.nextInt());
        }

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        
    }
}
