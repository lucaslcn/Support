/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Node;

/**
 *
 * @author Lucas
 */
public class MyDoubleList {
    
    private DoubleNode header;
    private DoubleNode trailer;
    private int size;
    
    public DoubleNode first()
    {
        return this.header;
    }
    public DoubleNode last()
    {
        return this.trailer;
    }
    public int size()
    {
        return this.size;
    }
    public DoubleNode insertFirst(int e)
    {
        DoubleNode old = first();
        DoubleNode n = new DoubleNode (null, e, old);
        if (old != null)
        {
            old.previous = n;
        }
        else
        {
            this.trailer = n;
        }
         
        this.header = n;
        this.size++;
        return n;
    }
    
    public String toString()
    {
        String s = "";
        DoubleNode n = first();
        while(n != null)
        {
            s += n.toString();
            n = n.next;
        }
        return s;
    }
    
    public DoubleNode find(int e)
    {
        DoubleNode n = first();
        while (n != null)
        {
            if (n.element == e)
            {
                return n;
            }
            n = n.next;
        }
        return null;
        }

    public DoubleNode insertAfter(DoubleNode n, int e)
    {
        DoubleNode seguinte = n.next;
        DoubleNode inserted = new DoubleNode (n, e, seguinte);
        n.next = inserted;
        if (seguinte != null)
        {
            seguinte.previous = inserted;
        }
        else
        {
            this.trailer = n;
        }
        this.size++;
        return inserted;
    }
    
}
    
    

