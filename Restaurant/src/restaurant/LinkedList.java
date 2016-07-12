/*
 * Jonathan Blanco
 * version 2.3
 * The program represents a Linked List and List Iterator.
 * Concepts being applied are LinkedList and ListIterator.
 */

package restaurant;

import java.util.NoSuchElementException;

/**
   A linked list is a sequence of nodes with efficient
   element insertion and removal. This class 
   contains a subset of the methods of the standard
   java.util.LinkedList class.
*/
public class LinkedList
{  
   private Node first;
   
   /** 
      Constructs an empty linked list.
   */
   public LinkedList()
   {  
      first = null;
   }
   
   /**
      Returns the first element in the linked list.
      @return the first element in the linked list
   */
   public Object getFirst()
   {  
      if (first == null) { throw new NoSuchElementException(); }
      return first.data;
   }

   /**
      Removes the first element in the linked list.
      @return the removed element
   */
   public Object removeFirst()
   {  
      if (first == null) { throw new NoSuchElementException(); }
      Object element = first.data;
      first = first.next;
      return element;
   }

   /**
      Adds an element to the front of the linked list.
      @param element the element to add
   */
   public void addFirst(Reservation element)
   {  
      Node newNode = new Node();
      newNode.data = element;
      newNode.next = first;
      first = newNode;
   }
   
   /**
      Returns an iterator for iterating through this list.
      @return an iterator for iterating through this list
   */
   public ListIterator listIterator()
   {  
      return new LinkedListIterator();
   }
   
   class Node
   {  
      public Reservation data;
      public Node next;
   }

   class LinkedListIterator implements ListIterator
   {  
      private Node position;
      private Node previous;
      private boolean isAfterNext;

      /**
         Constructs an iterator that points to the front
         of the linked list.
      */
      public LinkedListIterator()
      {  
         position = null;
         previous = null;
         isAfterNext = false;
      }
      
      /**
         Moves the iterator past the next element.
         @return the traversed element
      */
      public Reservation next()
      {  
         if (!hasNext()) { throw new NoSuchElementException(); }
         previous = position; // Remember for remove
         isAfterNext = true;

         if (position == null)
         {
            position = first;
         }
         else
         {
            position = position.next;
         }

         return position.data;
      }
      
      /**
         Tests if there is an element after the iterator position.
         @return true if there is an element after the iterator position
      */
      public boolean hasNext()
      {  
         if (position == null)
         {
            return first != null;
         }
         else
         {
            return position.next != null;
         }
      }
      
      /**
         Adds an element before the iterator position
         and moves the iterator past the inserted element.
         @param element the element to add
      */
      public void add(Reservation element)
      {  
         if (position == null)
         {
            addFirst(element);
            position = first;
         }
         else
         {  
            Node newNode = new Node();
            newNode.data = element;
            newNode.next = position.next;
            position.next = newNode;
            position = newNode;
         }

         isAfterNext = false;
      }
      
      /**
         Removes the last traversed element. This method may
         only be called after a call to the next() method.
      */
      public void remove()
      {  
         if (!isAfterNext) { throw new IllegalStateException(); }

         if (position == first)
         {
            removeFirst();
         }
         else 
         {  
            previous.next = position.next;
         }
         position = previous;
         isAfterNext = false;
      }

      /**
         Sets the last traversed element to a different value. 
         @param element the element to set
      */
      public void set(Reservation element)
      {
          if (!isAfterNext) { throw new IllegalStateException(); }
          position.data = element;
      }
      
    /**
     * Find the given reservation.
     * @param element to be found
     * @return found reservation
     */
     public boolean find(Reservation aReservation)
      {
          boolean found = false;
          position = null;
          Reservation aListReservation;
          
          while (hasNext() && !found)
          {
              aListReservation = next();
              
              if ((aListReservation.getFirstName().equals(aReservation.getFirstName())) &&
                   aListReservation.getLastName().equals(aReservation.getLastName()) &&
                   aListReservation.getReservationTime().equals(aReservation.getReservationTime()))
                  found = true;              
          }
                    
          return (found);        
      }
      
     /**
      * Replace a previous reservation with a new one.
      * @param oldOne reservation to be replaced
      * @param newOne reservation to be added
      */
      public void replaceReservation(Reservation oldOne, Reservation newOne)
      {
          if(find(oldOne))
          {  
              remove();
              makeReservation(newOne);
          }
          else
              System.out.println("No Reservation Found.\n");
      }
      
     /**
      * Make/add a reservation.
      * @param aRes reservation to be added
      */
      public void makeReservation(Reservation aRes)
      {
          boolean found = false;
          position = null;
          String a = aRes.getReservationTime();
          Reservation find;

          while (hasNext() && !found)
          {
              find = next();

              if (a.compareTo(find.getReservationTime()) < 0)
                   found = true;
          }
           
          if(found)
              position = previous;
              
          add(aRes);
      }

     /**
      * To print the list of reservations.
      * @return string to be printed
      */
      public String toString()
      {
          String string = "";
          position = null;
          Reservation find;
          
          while (hasNext())
          {
              find = next(); 
              string += find.toString() + "\n";
          }
          return string;
       }
      
     /**
      * Cancel/remove the reservation given.
      * @param cancelRes 
      */
      public void cancelReservation(Reservation cancelReservation)
      {
          if (find(cancelReservation))
              remove();
          else
              System.out.println("Reservation not found.");
      }
   }
}
