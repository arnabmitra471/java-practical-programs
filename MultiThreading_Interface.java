class Callable  implements Runnable
{
    Thread t;
    String name;
    Callable(String name)
    {
        t = Thread.currentThread();
        this.name = name;
        this.t.setName(this.name);
    }
    public void run()
    {
        int call_count = 0,i;
        try
        {
            t.currentThread().setPriority(Thread.MAX_PRIORITY);
            
            for(i=0;i<20;i++)
            {
                call_count++;
                System.out.println("You have called "+call_count+" times");
                t.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Thread Interrupted !!");
        }
        finally
        {
            System.out.println("Callable Thread has been executed");
        }
    }
}
class Caller implements Runnable
{
    Thread t;
    String name;
    int call_count = 0;
    Caller(String name)
    {
        t = Thread.currentThread();
        this.name = name;
        this.t.setName(this.name);
    }
    public void run()
    {
        int call_count = 0,i;
        try
        {
            t.currentThread().setPriority(Thread.MIN_PRIORITY);
            for(i=0;i<30;i++)
            {
                call_count++;
                System.out.println("You have called from caller class "+call_count+" times");
                t.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Thread Interrupted !!");
        }
        finally
        {
            System.out.println(" Caller Thread has been executed");
        }
    }
}
class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        Callable c1 = new Callable("Callable_Thread");
        Thread t1 = new Thread(c1);
        t1.start();
        Caller c2 = new Caller("Caller_Thread");
        Thread t2 = new Thread(c2);
        t2.start();
    }
}