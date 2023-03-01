import java.util.Scanner;

public class Average {
    public static void main(String args[]){

       int nums[] = {1,2,3,4,5,6};
      float sum=0;

       for(int num:nums)
       sum=sum+num;
    
    float average=(sum/nums.length);
    System.out.print("Average: " +average);
}
}
