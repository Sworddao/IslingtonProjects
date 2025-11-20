public class WaterLevelMonitor{
    public static void main(String[] args){
        
        int waterLevel = 1200;
        int maxCapacity = 1000;
        
        System.out.println("Current Water Level: " + waterLevel + "L ");
        
        if(waterLevel >= maxCapacity){
            System.out.println("WARNING: Water level has reached 1000L or more!");
        }
        else{
            System.out.println("Status: Normal");
        }
        
    }
}