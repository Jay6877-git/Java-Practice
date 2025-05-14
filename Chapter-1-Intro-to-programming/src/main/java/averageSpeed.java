/**
 *
 * @author jayp1
 */
public class averageSpeed {
    public static double minToHour(int min, int sec){
        double secInMin = sec / 60.0;
        double hour = (min + secInMin) / 60.0;
        return hour;
    }
    
    public static void main(String[] args) {
        System.out.println("Runner runs: 14km in 45 mins 30 sec.");
        double distanceCovered = 14;
        double timeTaken = minToHour(45,30);
        double distanceInHour = distanceCovered / timeTaken;
        System.out.println("Average speed of runner in miles is " + distanceInHour * 1.6);
    }
}
