import java.util.*;

public class TestArrayList
{
    public static void main(String[] args)
    {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);

        /*for (int i = 0; i < a.size(); i++) { 
            System.out.println(a.get(i));
        }*/

        for (int x : a) {
            System.out.println(x);
        }
    }
}
