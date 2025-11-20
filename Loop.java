public class Loop{
    public static void main(String[] args){
         
        int a  = 0 ;
        
        while(a < 10){
            System.out.println(a);
            a++;
        }
        System.out.println("loop exited");
        
        for(int b = 0; b <= 10; b++){
          System.out.println("error");  
        }
        System.out.println("Force Stopped");
        
        int c = 0;
        do{
            System.out.println("GGS");
            c++;
        } while(c < 10);
    }
}