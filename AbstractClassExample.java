abstract class Shape
{
    abstract void drawShape();
    abstract void greet();
    void sayHi(){
        System.out.println("Hi everyone out there");
    }
    void gen_shape(){
        System.out.println("A Shape is being drawn");
    }
}
class Rectangle extends Shape
{
    @Override
    void drawShape(){
        System.out.println("A rectangle is being drawn");
    }
    @Override
    void greet(){
        System.out.println("Good Morning");
    }
}
class Square extends Shape
{
    @Override
    void drawShape(){
        System.out.println("A Square is being drawn");
    }
    @Override
    void greet(){
        System.out.println("Bonjour");
    }
}
class Triangle extends Shape
{
    @Override
    void drawShape()
    {
        System.out.println("A triangle is being drawn");
    }
    @Override
    void greet(){
        System.out.println("Good Aternoon !!");
    }
}
class Circle extends Shape
{
    @Override
    void drawShape(){
        System.out.println("A circle is being drawn");
    }
    @Override
    void greet(){
        System.out.println("Good Evening");
    }
}

class MainShape
{
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle();
        r1.greet();
        r1.drawShape();
        r1.sayHi();
        r1.gen_shape();


        Triangle tr1 = new Triangle();
        tr1.greet();
        tr1.drawShape();
        tr1.sayHi();
        tr1.gen_shape();

        
        Circle c1 = new Circle();
        c1.greet();
        c1.drawShape();
        c1.sayHi();
        c1.gen_shape();

    }
}