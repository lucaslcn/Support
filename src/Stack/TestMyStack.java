/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author lucaslucian471
 */
public class TestMyStack {
    
    
    public static void main (String[] args)
                       throws Exception
    {
    
        MyStack stack = new MyStack();

    
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("stack = " + stack);
    
        try
        {
        System.out.println("pop = " + stack.pop());
        System.out.println("pop = " + stack.pop());
        System.out.println("pop = " + stack.pop());
        System.out.println("pop = " + stack.pop());
        System.out.println("pop = " + stack.pop());
        }
        
        catch (Exception e)
        {
            System.out.println("e = " + e);
        }
        
        
    //    System.out.println("size = " + stack.size());
        try
        {
            System.out.println("peek = " + stack.peek());
        }
        catch (Exception e)
        {
            System.out.println("e = " + e);                
        }
    }
}
