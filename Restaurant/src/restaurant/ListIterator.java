/*
 * Jonathan Blanco
 * version 1.0
 * The program represents list iterator for a linked list.
 * Concepts being applied are LinkedList and ListIterator.
 */

package restaurant;

/**
   A list iterator allows access of a position in a linked list.    
   This interface contains a subset of the methods of the 
   standard java.util.ListIterator interface. The methods for
   backward traversal are not included.
*/
public interface ListIterator
{  
   /**
      Moves the iterator past the next element.
      @return the traversed element
   */
   Object next();
      
   /**
      Tests if there is an element after the iterator position.
      @return true if there is an element after the iterator position
   */
   boolean hasNext();
      
   /**
      Adds an element before the iterator position
      and moves the iterator past the inserted element.
      @param element the element to add
   */
   void add(Reservation element);
      
   /**
      Removes the last traversed element. This method may
      only be called after a call to the next() method.
   */
   void remove();

   /**
      Sets the last traversed element to a different value. 
      @param element the element to set
   */
   void set(Reservation element);
   
   /**
    * Find the given reservation.
    * @param element to be found
    * @return found reservation
    */
   boolean find(Reservation element);
   
   /**
    * Replace a previous reservation with a new one.
    * @param oldOne reservation to be replaced
    * @param newOne reservation to be added
    */
   void replaceReservation(Reservation oldOne, Reservation newOne);
   
   /**
    * Cancel/remove the reservation given.
    * @param cancelRes 
    */
   void cancelReservation(Reservation cancelRes);
   
   /**
    * Print the list of reservations.
    * @return string to be printed
    */
   String toString();
   
   /**
    * Make/add a reservation.
    * @param aRes reservation to be added
    */
   public void makeReservation(Reservation aRes);
}
