
package colaconlinkedlist;
import java.util.LinkedList;
 
public class ColaConLinkedlist {    
    public static void main(String[] args) {        
        LinkedList cola=new LinkedList();//Usamos LinkedList
            cola.offer(3);
            cola.add(14);
            cola.offer(12);
            cola.add(7);
            cola.offer(10);
            cola.add(10.5);
            cola.add("cadena");
            
        System.out.println("Cola llena: " + cola);
        
        while(cola.poll()!=null){      
            System.out.println(cola.peek());        
        }        
        System.out.println(cola.peek());   
    }
}