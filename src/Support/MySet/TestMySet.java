public class TestMySet
{
    public static void main(String[] args)
    {
        MySet set1 = new MySet();
        set1.add("a");
        set1.add("b");
        set1.add("c");
        System.out.println(set1);
        System.out.println(set1.size());
        set1.remove("c");
        System.out.println(set1);

        MySet set2 = new MySet();
        set2.add("d");
        set2.add("e");
        System.out.println(set2);
        
        MySet set3 = MySet.union(set1, set2);
        System.out.println("set 3 = " +set3);
        
        MySet set4 = MySet.intersection(set1, set2);
        System.out.println("set 4 = " + set4);
    }
}

