import java.util.*;

public class AList {
    public static void main(String args[]){

        ArrayList<Integer> list= new ArrayList<Integer>();

        list.add(3);
        list.add(5);
        list.add(6);
        list.add(2);
        list.add(1);

        System.out.println(list);

       // int element=list.get(0);                        //get element
        System.out.println(list.get(0));

        list.add(0,1);          //add element
        list.add(2,4);
        System.out.println(list);

        list.set(2,2);           //set element
        System.out.println(list);

        list.remove(1);
        System.out.println(list);


    }
    
}
