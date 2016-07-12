/*
 * Jonathan Blanco
 * version 1.0
 * The program represents a walk-in at a restaurant.
 * Concepts being applied are LinkedList(as Queues).
 */

package restaurant;

/**
 * A class to represent a walk-in at a restaurant.
 */
public class WalkIn
{
    private String lastName;        //last name of the person
    private String firstName;       //first name of the person
    private String reservationTime; //time at which the person reserved
    
    /**
     * Constructs a walk-in object.
     * @param lN last name
     * @param fN first name
     * @param rT reservation time
     */
    public WalkIn(String lN, String fN, String rT)
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
     * To print the walk-in information. 
     * @return walk-in to be printed
     */
    public String toString()
    {
        return lastName + ", " + firstName + " at " + reservationTime;
    }
}
