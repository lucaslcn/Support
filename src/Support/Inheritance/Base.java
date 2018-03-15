public class Base
{
    private   int a;
    protected int b;
    public    int c;
    
    public    Base()             { System.out.println("base"); }
    public    Base(int x)        { System.out.println("base x"); }
    public    Base(int x, int y) { System.out.println("base xy"); }
    
    public    void method1() { System.out.println("m1"); }
    protected void method2() { System.out.println("m2"); }
    private   void method3() { System.out.println("m3"); }
}
