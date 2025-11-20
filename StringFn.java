public class StringFn{
    public static void main(String[] args){
        
        String message = "Hello, World!";
        message = message.concat("dawg it aint that deep fr");
        message = message.toUpperCase();
        System.out.println(message);
        message = message.replace('o','0');
        char[] characters = message.toCharArray();
        for(char c : characters){
            System.out.println(c);
        }
        
    }
}