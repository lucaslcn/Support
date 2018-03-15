public class Derived extends Base
{
    private   int d;
    
    public Derived()
    {
        super(123);
        d = 567;
    }
    
    public void method1()
    { 
        System.out.println("new m1"); 
    }
    
    public static void main(String[] args)
    {
        Derived d = new Derived();
        d.method1();
    }
}