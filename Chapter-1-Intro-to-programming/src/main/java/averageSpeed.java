/**
 *
 * This program calculates the average speed of a runner in miles per hour.
 * The runner covers a given distance in kilometers within a specific time (minutes and seconds).
 * 
 * Note:
 * 1 mile = 1.6 kilometers
 * 
 * Problem Statement:
 * A runner runs 14 kilometers in 45 minutes and 30 seconds.
 * Display the average speed in miles per hour.
 * @author jayp1
 */
public class averageSpeed {
    /**
     * Converts time given in minutes and seconds to hours.
     * 
     * @param min Minutes component of the time.
     * @param sec Seconds component of the time.
     * @return Time in hours.
     */
    public static double minToHour(int min, int sec){
        double secInMin = sec / 60.0;
        double hour = (min + secInMin) / 60.0;
        return hour;
    }
    
    public static void main(String[] args) {
        System.out.println("Runner runs: 14km in 45 mins 30 sec.");
        
        double distanceCovered = 14; // Distance covered in kilometers
        double timeTaken = minToHour(45,30);// Time taken in hours
        
        double speedKmPerHour = distanceCovered / timeTaken;// Average speed in km/h
        double speedMilesPerHour = speedKmPerHour / 1.6;            // Convert km/h to miles/h
        System.out.println("Average speed of runner in miles is " + speedMilesPerHour * 1.6);
    }
}