abstract class Super
{
    public Super()
    {
        System.out.println("super");
    }
    public void meth1()
    {
        System.out.println("meth1");
    }
    abstract void meth2();
}

class sub extends Super{
    public void meth2()
    {
        System.out.println("meth2");
    }
}

public class testabs
{
    public static void main(String args[])
    {
        // Super s1;
        // sub s2 = new sub();
        Super s = new sub();
        s.meth1();
        s.meth2();
    }
}
