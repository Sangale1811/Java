import java.util.Scanner;

public class AverageMarks {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of Students: ");

        int n = sc.nextInt();

        int[] marks = new int[n];              //array declaration

        System.out.print("Enter the marks :");

        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();           //set the array
        }
        int averageMarks = 0;

        for (int i = 0; i < n; i++) {
            averageMarks += marks[i];
        }
        averageMarks /= n;

        System.out.print("The average marks are : " +averageMarks);
    }

}
