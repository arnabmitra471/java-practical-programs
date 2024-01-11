import java.util.*;
class ShapeArea
{
    int len,bre,hei;
    ShapeArea(int len,int bre)
    {
        this.len = len;
        this.bre = bre;
    }
    ShapeArea(int len,int bre,int hei)
    {
        this.len = len;
        this.bre = bre;
        this.hei = hei;
    }
    ShapeArea(int len)
    {
        this.len = len;
    }
    int calarea()
    {
        return len * bre;
    }
    int calarea1()
    {
        return (2 *((len*bre)+(bre*hei)+(len*hei)));
    }
    int calarea2()
    {
        return 6 * len;
    }

}
class CalcArea
{
    public static void main(String[] args)
    {
        Scanner am = new Scanner(System.in);
        System.out.println("Enter the length of the cuboid");
        int len = am.nextInt();
        System.out.println("Enter the breadth of the cuboid");
        int bre = am.nextInt();
        System.out.println("Enter the height of the cuboid");
        int hei = am.nextInt();

        ShapeArea sa = new ShapeArea(len,bre);
        int rectArea = sa.calarea();
        System.out.println("The area of the rectangle is "+rectArea);
        ShapeArea sa1 = new ShapeArea(len,bre,hei);
        int cuboidSurfaceArea = sa1.calarea1();
        System.out.println("The Surface area of the cuboid is "+cuboidSurfaceArea);
        ShapeArea sa2 = new ShapeArea(len);
        int cubeSurfaceArea = sa2.calarea2();
        System.out.println("The surface area of the cube is "+cubeSurfaceArea);
    }
}