import java.util.Scanner;
import java.util.Random;

public class BeginGame{
    public static void main(String[] args){
        
        //system objects
        
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        
        //Game variables
        
        String[] enemies = {"Goblin", "Ogre"};
        int maxEnemyHealth = 20;
        int enemyAttackDamage = 4;
        
        // Player variables
        
        int health = 50;
        int attackDamage = 7;
        int numRegenPots = 2;
        int regenPotsHealAmount = 10;
        int regenPotsDropChance = 50; //percentage
        
        boolean running = true;
        
        System.out.println("Welcome to the Gate");
        
        GAME:
        while(running){
            System.out.println("------------------------------------");
            
            int enemyHealth = rand.nextInt(maxEnemyHealth);
            String enemy = enemies[rand.nextInt(enemies.length)];
            System.out.println("\t# " + enemy + " appeared! #\n");
            
            
        }
        
        
        
        
    }
}