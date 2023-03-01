import java.util.Stack;

public class Stacks {
    public static void main(String args[]){

        Stack<String> animal=new Stack<String>();

        animal.push("Lion");
        animal.push("cat");
        animal.push("Horse");
        animal.push("Dog");

        System.out.println("Stack :" +animal);

        System.out.println(animal.peek());

        animal.pop();
        System.out.println(animal.pop());
    }
    
}
