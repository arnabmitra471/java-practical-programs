class Static_Block
{
    static
    {
        // The static block is executed before the main method in the class
        System.out.println("Hey !! I am inside a static block");
    }
    public static void main(String[] args)
    {
        System.out.println("Hey I am inside the main method");
    }
}