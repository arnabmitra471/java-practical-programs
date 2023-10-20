import java.util.*;
class RevNum
{
    public static void main(String args[])
    {
        Scanner am = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = am.nextInt();
        int digit,rev=0;
        while(num >0)
        {
            digit = num % 10;
            rev = (rev * 10) + digit;
            num/=10;
        }
        System.out.println("The reversed number is "+rev);
    }
}