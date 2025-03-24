package addon;

import java.util.ArrayList;

public class InsertNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        
        list.add(0, 777);
        list.add(4, 333);
        
        System.out.println(list);
    }
}
