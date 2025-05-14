/**
 * This program projects the US population for the next 5 years
 * based on birth, death, and immigration rates.
 * 
 * Assumptions:
 * - One birth every 7 seconds
 * - One death every 13 seconds
 * - One immigrant every 45 seconds
 * - 365 days in a year
 * 
 * @author jayp1
 */

public class populationProjection {
    /**
     * Calculate sec in day
     * @return 
     */
    public static int secInDay(){
        return 60 * 60 * 24;
    }
    
    /**
     * Calculate births per day
     * @param birthPerSecs
     * @return 
     */
    public static double birthInDay(double birthPerSecs){
        return secInDay() / birthPerSecs;
    }
    
    /**
     * Calculate deaths per day
     * @param deathPerSecs
     * @return 
     */
    public static double deathInDay(double deathPerSecs){
        return secInDay()/ deathPerSecs;
    }
    
    /**
     * Calculate new immigrants per day
     * @param immigrantPerSecs
     * @return 
     */
    public static double immigrantInDay(double immigrantPerSecs){
        return secInDay()/ immigrantPerSecs;
    }
    
    public static void main(String[] args) {
        System.out.println("The current Population of US is 312032486.");
        System.out.println("If One birth every 7 Sec, death every 13 sec and new immigrant every 45 sec.");
        
        double population = 312032486;
        int birthEverySec = 7, deathEverySec = 13, immigrantEverySec = 45;
        
        // Calculate yearly change
        double increaseInYear = (birthInDay(birthEverySec) * 365) - (deathInDay(deathEverySec) * 365) + (immigrantInDay(immigrantEverySec) * 365);
        
        population = population + (increaseInYear * 5);
        System.out.println("Population in 5 year is " + (long)population);
    }
}
