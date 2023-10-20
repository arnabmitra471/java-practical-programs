import java.util.*;
class AddNums
{
    public static void main(String args[])
    {
        Scanner am = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = am.nextInt();
        System.out.println("Enter the second number");
        int num2 = am.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of the two numbers is "+sum);
    }
}