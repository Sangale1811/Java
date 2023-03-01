class Cat {
    boolean hasFur;
    int legs, eyes;

    public void eat() {
        System.out.println("cat is eating");
    }

    public void walk() {
        System.out.println("cat is walking");
    }
}

public class ClassObject {
    public static void main(String args[]) {

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        cat1.walk();
        cat2.eat();
        cat1.eat();
        cat2.walk();

    }

}
