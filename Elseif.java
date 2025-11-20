public class Elseif{
    public static void main(String[] arg){
        
        // AND &&
        // OR ||
        
        /*boolean a = (10 - 1 == 8) || (true);
        System.out.println(a);
        a = (10 -2 == 8) || (true);
        System.out.println(a);
        a = (10 - 1 == 8) && (false) || ((false) && (false));
        System.out.println(a); */
        boolean a = false;
        boolean b = false;
        
        if(b){
            System.out.println("b iS true");
        }
        else if(a && b){
            System.out.println("a AND b are true");
        }  
        else if(a || b){
            System.out.println("a OR b are true");
        }
        else {
            System.out.println("a AND b are all false");
        }
        
    }
}