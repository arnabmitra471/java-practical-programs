import java.util.*;
class LargestNum
{
    public static void main(String args[])
    {
        try (Scanner am = new Scanner(System.in)) {
            System.out.println("Enter the first number: ");
            int num1 = am.nextInt();
            System.out.println("Enter the second number: ");
            int num2 = am.nextInt();
            System.out.println("Enter the third number: ");
            int num3 = am.nextInt();
            
            int max_num = (num1 > num2 && num1 > num3)?num1:(num2>num1 && num2>num3)?num2:num3;
            System.out.println("The largest number is "+max_num);
        }
    }
}