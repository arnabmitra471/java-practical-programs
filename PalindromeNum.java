import java.util.*;

class PalindromeNum {
    public static void main(String args[]) 
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            int digit, rev = 0, temp;
            temp = num;
            while (num != 0) {
                digit = num % 10;
                rev = (rev * 10) + digit;
                num /= 10;
            }

            if (rev == temp) {
                System.out.println(temp + " is a palindrome number");
            } else {
                System.out.println(temp + " is not a palindrome number");
            }
        }
    }
}