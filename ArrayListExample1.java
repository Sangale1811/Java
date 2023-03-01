import java.util.*;

class Book{
    int id;
    String name,Author,Publisher;
    int Quantity;

    public Book(int id,String name,String Author,String Publisher , int Quantity){
        this.id=id;
        this.name=name;
        this.Author=Author;
        this.Publisher=Publisher;
        this.Quantity=Quantity;
    }
}

public class ArrayListExample1 {
    public static void main(String args[]){

        ArrayList<Book> list=new ArrayList<Book>();

        Book b1=new Book(1,"Let C","Nikita","Niks",23);
        Book b2=new Book(2,"lets c++","Prem","pre",24);
        Book b3=new Book(3,"python","Punam","pun",32);

        list.add(b1);
        list.add(b2);
        list.add(b3);

       // for(Book b:list){  
            System.out.println(b1.id+" "+b1.name+" "+b1.Author+" "+b1.Publisher+" "+b1.Quantity);  
            System.out.println(b2.id+" "+b2.name+" "+b2.Author+" "+b2.Publisher+" "+b2.Quantity);  
            System.out.println(b3.id+" "+b3.name+" "+b3.Author+" "+b3.Publisher+" "+b3.Quantity);  
       // }  

    }
    
}
