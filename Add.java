import java.util.Scanner;

public class Add {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a=sc.nextInt();

        System.out.print("Enter second number: ");
        int b=sc.nextInt();

        int sum;
        sum=a+b;

        System.out.print(sum);

        sc.close();
        
    }
    
}
