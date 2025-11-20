public class TypeCasting{
    public static void main(String[] args){
        // Widening Casting
        int myInt = 2;
        double myDouble = myInt;
        
        System.out.println(myInt);
        System.out.println(myDouble);
        
        // Narrowing Casting
        
        double myDouble1 = 22.2;
        int myInt1 = (int) myDouble1;
        
        System.out.println(myDouble1);
        System.out.println(myInt1);
        
        //real world example
        
        int maxScore = 500;
        int userScore = 423;
        
        float percentage = (float) userScore/maxScore * 100.0f;
        
        System.out.println("User score percentage is " + percentage);
    }
}