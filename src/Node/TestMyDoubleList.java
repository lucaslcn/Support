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
public class TestMyDoubleList {
    
    public static void main(String[] args)
    {
        MyDoubleList list = new MyDoubleList();
        
        DoubleNode a = list.insertFirst(1);
        System.out.println("list: " + list);
        
        DoubleNode b = list.insertFirst(2);
        System.out.println("list: " + list);
        
        DoubleNode c = list.insertFirst(3);
        System.out.println("list: " + list);
        
        System.out.println("size: " + list.size());
        
        DoubleNode d = list.insertAfter(c,4);
        System.out.println("list: " + list);
    }
    
}
