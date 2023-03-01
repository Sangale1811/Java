class vehicle{
    int wheels;
    String color;

vehicle(int wheels,String color){
    System.out.print(wheels+" wheels and color " +color);
}
vehicle(int wheels){
    wheels=2;
    System.out.print(wheels+" ");
}
}
public class MyConstructor {
    public static void main(String args[]){

       // vehicle obj=new vehicle(4,"red");

        vehicle obj1 = new vehicle(2 );

    }
    
}
