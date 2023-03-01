import java.util.*;

public class Iterniry {
    public static String getStart(HashMap<String,String>ticket){
        HashMap<String,String> revMap=new HashMap<>();

        for(String key:ticket.keySet()){
            revMap.put(ticket.get(key),key);
        }

        for(String key:ticket.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }

return null;
    }
    public static void main(String args[]){
        HashMap<String,String> map=new HashMap<>();

        map.put("chennai","Bengaluru");
        map.put("Mumbai","Delhi");
        map.put("Goa","chennai");
        map.put("Delhi","Goa");

        String start=getStart(map);

        while(map.containsKey(start)){
            System.out.print(start + "->");
            start=map.get(start);
        }
        System.out.println(start);

    }
    
}
