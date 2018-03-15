/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;
import java.util.*;

/**
 *
 * @author lucaslucian471
 */
public class MyQueue {
    
    /**
 *
 * @author lucaslucian471
 */ 
    protected ArrayList<Integer> array;
    
    public MyQueue()
    {
        this.array = new ArrayList<Integer>();
    }
    
    public void add (int i)
    {
        this.array.add(i);
    }
    
    public int remove ()  throws Exception
    {
        if (size() != 0)
        {
        return this.array.remove(0);
        }   
        else
        {
            throw new Exception("empty queue");
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
    
    public int first()
    {
        return this.array.get(0);
    }
}
    

