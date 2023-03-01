class Person {
    protected String name;
    
             public void walk(){
                System.out.println(name+" is walking");
             }
             public void eat(){
                System.out.println(name+ " is eating");
             }

    }
class Teacher extends Person{
    
    public void teach(){
        System.out.println(name+ " is Teaching");
    }
}
class Singer extends Person{
    public void Sing(){
        System.out.println(name+ " is singing");
    }
}

public class Inheritance {
    public static void main(String args[]) {

        Teacher t=new Teacher();
        t.name="Shivani";

        t.eat();
        t.walk();
        t.teach();
        Singer s=new Singer();

        s.name="Nikita";
        s.Sing();
        s.eat();


    }

}
