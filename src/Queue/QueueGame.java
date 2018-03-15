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
public class QueueGame
{
    
    public static void main(String[] args)
            throws Exception
    {
    
        MyQueue q = new MyQueue();
        q.add(rngBetween20and50());
        q.add(rngBetween20and50());
        q.add(rngBetween20and50());
        q.add(rngBetween20and50());
        q.add(rngBetween20and50());
        
        System.out.println(q);
        
        while (q.size() != 0)
        {
            int i = 0;
            while ( i <= 1)
            {
                i = Entrada.leiaInt("Digite um numero maior que 1, com objetivo de ser divisor dos numeros da fila");
            }
            
            for (int j = 0; j <= q.size(); j++)
            {
                if (q.first() % i == 0)
                {
                    q.remove();
                    System.out.println(q);
                }
            
            }
            
            if (q.size() == 0) {
                break;
            }
            else{
                    q.add(rngBetween20and50());
                    System.out.println(q);
            }
            
                }
            
        
        System.out.println("Queue is empty. Congratulations!");
        
        
    
    }
    
    public static int rngBetween20and50()
    {
        return ((int)((Math.random()*31))+20);
    }
            
    
    
    
}
