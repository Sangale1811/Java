import java.util.Scanner;

public class Positive {
    
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        //for(int i=0;i>n;i++){
            if(n>0){
                System.out.println("Number is Positive");
            }
            else if(n<0){
                System.out.print("Number is Negative");
            }
            else{
                System.out.print(" Number is Zero");
            }
        }
    }

