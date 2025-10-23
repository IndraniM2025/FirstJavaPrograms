public class Logical
{
    public static void main (String[] args)
    {
        int x= 10;
        int y= 20;
        int a = 15;
        int b = 25;
        System.out.println(x == y && a < b);
        System.out.println(a <= y || b == 10);
        System.out.println(b >= a && a <= x);
        System.out.println(b != y || y >= a);
        System.out.println(a <= x && b != y);
        System.out.println(! (x == y));
    }

}
