import java.util.*;  
public class ArrayListExample4{  
 public static void main(String args[]){  
  ArrayList<String> Fruit=new ArrayList<String>();  
  Fruit.add("Mango");  
  Fruit.add("Apple");  
  Fruit.add("Banana");  
  Fruit.add("Grapes");  
  //accessing the element    
  System.out.println("Returning element: "+Fruit.get(1));//it will return the 2nd element, because index starts from 0  
  //changing the element  
  Fruit.set(1,"Dates");  
  //Traversing list  
  for(String fruit:Fruit)    
    System.out.println(fruit);    
 }  
}
    

