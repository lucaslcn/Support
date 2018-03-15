import java.util.*;

public class MySet
{
    protected ArrayList<String> array;

    public MySet() {
        this.array = new ArrayList<String>();
    }

    public void add(String s) {
        this.array.add(s);
    }

    public void add(MySet set) {
        for (String s : set.array) {
            /*this.array.*/ add(s);
        }
    }

    public void remove(String s) {
        this.array.remove(s);
    }

    public int size() {
        return this.array.size();
    }

    public String toString() {
        return this.array.toString();
    }
    
    public static MySet union (MySet s1, MySet s2)
    {
        MySet result = new MySet();
        result.add(s1);
        result.add(s2);
        return result;
                
    }
    
    public static MySet intersection(MySet s1, MySet s2)
    {
        MySet result = new MySet();
                
            for (String s : s1.array)
            {
                if (s2.array.contains(s))
                {
                    result.add(s);
                }
            }
        return result;
    }
}
