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
public class TestNode {
    
    public static void main (String[] args)
    {
        Node x = new Node(1, null);
        Node y = new Node(2, null);
        Node z = new Node(3, null);
        
        x.next = y;
        y.next = z;
        
        System.out.print(x);
        System.out.print(y);
        System.out.println(z);
    }
    
    
}
