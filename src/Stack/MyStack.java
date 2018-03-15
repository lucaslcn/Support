//LIFO - Last in first out

package Stack;
import java.util.*;

/**
 *
 * @author lucaslucian471
 */
public class MyStack {
    
    private ArrayList<Integer> array;
    
    public MyStack()
    {
        this.array = new ArrayList<Integer>();
    }
    
    public void push (int i)
    {
        this.array.add(i);
    }
    
    public int pop () throws Exception
    {
        if (size() != 0)
        {
        return this.array.remove(size()-1);
        }
        else
        {
            throw new Exception("empty stack");
        }
    }
    
    public int size()
    {
        return this.array.size();
    }
    
    public String toString()
    {
        return this.array.toString();
    }
    
    public int peek() throws Exception
    {
        if (size() != 0)
        {
            return this.array.get(size()-1);
        }
        else
        {
            throw new Exception("empty stack");
        }
    
    }
}