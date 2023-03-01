import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList{
    public static void main(String args[]){

        List<String> list = new ArrayList();

        list.add("Shivani");
        list.add("Nikita");
        list.add("Prem");

       // System.out.println(list);

        //list.add("Punam");
        //System.out.println(list);

        //list.add(4,"Sangale");
        //System.out.println(list);

        //List<String> newlist = new ArrayList();
        //newlist.add("abc");
        //newlist.add("xyz");

       // list.addAll(newlist);
       // System.out.println(newlist);
      //  System.out.println(list);

        //System.out.println(list.get(2));

       // list.remove(0);
        //System.out.println(list);

        list.remove(String.valueOf("Shivani"));
        System.out.println(list);

       // list.clear();
        //System.out.println(list);

      //  list.set(1,"mno");
        //System.out.println(list);

      System.out.println(list.contains("Nikita"));

     Iterator<String>it=list.iterator();
      while(it.hasNext()){

        System.out.println("iterator " +it.next());
      }


    }
}