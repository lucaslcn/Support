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
public class MyOrderedList extends MyDoubleList {
    
    public void insertInOrder(int e)
        {
            DoubleNode n = first();
            
            if (n == null || n.element > e)
            {
                insertFirst(e);
            }
            else
            {
                while (n.element < e && n.next != null)
                {
                    //while (n.element < e) quando 9 for maior que 5, sai do while
                    
                        n = n.next;
                }   
                    insertAfter(n,e);
 
                }
                
            }
  
        
        
    
    public static void main (String[] args)
    {
        MyOrderedList list = new MyOrderedList();
        list.insertInOrder((int)(Math.random()*10));
        System.out.println("list: " + list);
        list.insertInOrder(3);
        System.out.println("list: " + list);
        list.insertInOrder(9);
        System.out.println("list: " + list);
        list.insertInOrder(11);
        System.out.println("list: " + list);
        
    
        int x = Entrada.leiaInt("Digite um inteiro para inserir ordenadamente na lista");

        list.insertInOrder(x);
        System.out.println("list: " + list);
        System.exit(0);
        
        
    }
    
    
}
