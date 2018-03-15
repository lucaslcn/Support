/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author lucaslucian471
 */
public class TestMyQueue {
    
    public static void main (String[] args)
            throws Exception
    {
        MyQueue q = new MyQueue();
        q.add(1);
        q.add(2);
        System.out.println("q = " + q);
        System.out.println("first = " + q.first());
        System.out.println("size = " + q.size());
        
        try
        {
            System.out.println(q.remove());
            System.out.println(q.remove());
            System.out.println(q.remove());
        }
        catch (Exception e)
                {
                    System.out.println(e);
                }
        
        
    }
    
}
