/**
 * This is the class file is for the Bike Class.
 *
 * @author  Marlon Poddalgoda
 * @version 1.0
 * @since 2021-05-28
 */

public class Bike extends Vehicle {
    // Class for bike

    // fields
    /**
    * Cadence (rpm).
    */
    private double cadence;

    // constructor
    /**
    * This contructor creates a base bike.
    */
    public Bike() {
        super();
        this.cadence = 0;
    }

    // methods
    /**
    * This method calculates the bike cadence.
    * @return cadenceInt This is the candece.
    */
    public int calcCadence() {
        // converts km/h into rpm for a standard 24 inch bike wheel
        // formula derived from online

        this.cadence = (25 / (3 * Math.PI * 0.305) * getSpeed()) / 2;
        int cadenceInt = (int) cadence;
        return cadenceInt;
    }

    /**
    * This method rings the bell.
    */
    public void ringBell() {
        // prints out to the console
        System.out.println("Ding!");
    }
}
