class MultiThreading extends Thread
{
    @Override
    public void run()
    {
        int i = 1;
        while(i<=400)
        {
            System.out.println("My cooking thread is running now");
            System.out.println("I am Happy !!!");
            i++;
        }
    }
}
class Clickable extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Wohooo !!!! This thread is also Running !!!!");
        System.out.println("Wah bhai Wah !!!");
        System.out.print("Java is awesome");
        System.out.print("I am loving it a lot much more now !!!!!");
    }
}
class UsingThreading
{
    public static void main(String args[])
    {
        MultiThreading m1 = new MultiThreading();
        Clickable click = new Clickable();
        m1.start();
        click.start();

    }
}