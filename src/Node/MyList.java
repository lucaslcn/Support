/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Node;

/**
 *
 * @author lucas.lucian
 */
public class MyList {
    
    private Node header;
    private int size;
    
    public Node first()
    {
        return this.header;
    }
    
    public int size()
    {
        return this.size;
    }
    
    public  Node find(int e)
    {
        Node n = first();
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
    
    public Node insertFirst(int e)
    {
        Node n = new Node (e, this.header);
//      Node old = this.header           
        this.header = n;
        this.size++;
        return n;
    }
    
    public String toString()
    {
        String s = "";
        Node n = first();
        while (n != null)
        {
            s += n.toString();
            n = n.next;
        }
        
        return s;
    }
    
    public Node insertAfter(Node n, int e)
    {
        Node seguinte = n.next;
        Node novo = new Node(e, seguinte);
        n.next = novo;
        this.size++;
        return novo;
    }
    
    public Node last()
    {
        Node n = first();
        while (n != null)
        {
           if (n.next == null)
           {
               break;
           }
           n = n.next;
        }
        return n;
    }
    
}
