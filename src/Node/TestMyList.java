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
public class TestMyList {
    
    public static void main(String[] args)
    {
    
        MyList list = new MyList();
    
        Node a = list.insertFirst(1);
        Node b = list.insertFirst(2);
        Node c = list.insertFirst(3);
        Node d = list.insertAfter(b,4);
        Node e = list.insertAfter(a, 5);
        
        Node n = list.first();
        while(n != null)
        {
            System.out.print(n);
            n = n.next;
        }
        
        System.out.println("\n"+list);
        System.out.println("Size: " +list.size());
        
        System.out.println(list.find(4) != null);
        System.out.println(list.last());
        
        
    }
    
}
