/*
 * Jonathan Blanco
 * version 1.0
 * The program represents a reservation at a restaurant.
 * Concepts being applied are LinkedList and ListIterator.
 */

package restaurant;

/**
 * A class to represent a reservation at a restaurant.
 */
public class Reservation 
{
    private String lastName;        //last name of the person
    private String firstName;       //first name of the person
    private String reservationTime; //time at which the person reserved
    
    /**
     * Constructs a reservation object.
     * @param lN last name
     * @param fN first name
     * @param rT reservation time
     */
    public Reservation(String lN, String fN, String rT)
    {
        lastName = lN;
        firstName = fN;
        reservationTime = rT;
    }
    
    /**
     * Get the last name of the person.
     * @return last name 
     */
    public String getLastName()
    {
        return lastName;
    }
    
    /**
     * Get the first name of the person.
     * @return first name 
     */
    public String getFirstName()
    {
        return firstName;
    }
    
    /**
     * Get the reservation time of the person.
     * @return reservation time 
     */
    public String getReservationTime()
    {
        return reservationTime;
    }
    
    /**
     * To print the reservation information. 
     * @return reservation to be printed
     */
    public String toString()
    {
        return lastName + ", " + firstName + " at " + reservationTime;
    }
}
