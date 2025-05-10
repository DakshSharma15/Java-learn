public class index2
{
    int x = 10;
    static int y = 10;
    void show()
    {
        x++;
        System.out.println("x = "+x);
    }

    public static void main (String []args)
    {
        index2 obj1 = new index2();
        obj1.show();
    }
}
