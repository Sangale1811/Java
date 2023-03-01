import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int temp = n;
        int reverseString = 0;

        while (temp > 0) {
           // int lastDigit = temp % 10;
            reverseString = reverseString * 10 + (temp%10);
            temp /= 10;
        }
        if (reverseString == n) {
            System.out.print(n + " is palindrome ");
        } else {
            System.out.println(n + " is not palindrome ");
        }

    }

}
