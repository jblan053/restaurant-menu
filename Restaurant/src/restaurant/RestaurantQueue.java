/*
 * Jonathan Blanco
 * version 2.0
 * The program represents a queue (implemented as linkedlist).
 * Concepts being applied are LinkedList and ListIterator.
 */

package restaurant;

/**
 * A class that makes a queue in a restaurant.
 */
public class RestaurantQueue
{
    public class Node
    {
      public WalkIn element;
      public Node next;
      
      public Node(WalkIn e, Node n)
      {
           element = e; 
           next = n;
      }
    }
    
    Node front = null;     // head of list, where items are removed
    Node rear = null;      // last node in list, where items are added
  
    /**
     * Add walk-in to queue (or line).
     * @param aCustWalkIn walk-in to add
     */
    public void addWalkIn(WalkIn aCustWalkIn)
    {
        if (rear != null)
        {
            rear.next = new Node(aCustWalkIn, null);
            rear = rear.next;
        }
        else
        {
            rear = new Node(aCustWalkIn, null);
            front = rear;
        }
    }
    
    /**
     * Remove walk-in from queue.
     * @return walk-in removed
     */
    public WalkIn removeFromQueue()
    {
        if (empty())
            return null;//throw new IllegalStateException();
        else
        {
            WalkIn value = front.element;
            front = front.next;
            
            if (front == null)
                rear = null;
            
            return value;
        }
    }

    /**
     * Check if queue is empty.
     * @return null if queue is empty
     */
    public boolean empty()
    {
        return front == null;
    }

    /**
     * Check the next walk-in coming up.
     * @return next walk-in 
     */
    public WalkIn peek()
    {
        if (rear == null)
            return null;
        
        return front.element;
    }

    /**
     * Remove walk-in from queue.
     * @return the walk-in removed
     */
    public WalkIn fillEmptyTable(/*WalkIn aCustWalkIn*/)
    {
      //  System.out.println("Here is your table " + aCustWalkIn.getFirstName()
      //                     + " " + aCustWalkIn.getLastName() + ".");
        
        return removeFromQueue();
    }
    
    /**
      * To print the list of walk-ins.
      * @return string to be printed
      */
    public String toString()
    {
        String string = "";
        
        Node start = front;
        
        while(start != null)
        {
            string += start.element.toString() + "\n";
            start = start.next;
        }
        
        return string;
    }
}
