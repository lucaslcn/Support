/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author lucas.lucian
 */
public class MyDeque extends MyQueue
{
    public void addFirst(int i)
    {
        this.array.add(0, i);
    }
    
    public int removeLast() throws Exception
    {
        if (size() != 0)
        {
        return this.array.remove(size() - 1);
        }   
        else
        {
            throw new Exception("empty deque");
        }
    }
    
    public int last() throws Exception
    {
        if(size() != 0)
        {
        return this.array.get(size() - 1);
        }
        
        else
        {
            throw new Exception("empty deque");
        }
    }
    
    
    
}
