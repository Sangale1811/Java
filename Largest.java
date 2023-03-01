import java.util.Scanner;

public class Largest {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int smallest;

        if (a < b) {
            if (a < c) {
                smallest = a;
            } else {
                smallest = c;
            }
        } else {
            if (b < c) {
                smallest= b;
            } else {
               smallest = c;
            }
        }
        System.out.println(smallest + " is smallest number ");

    }

}
