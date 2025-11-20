public class TestInc{
    public static void main(String[] args){
        
        int h = 1;
        int j = ++h; // h = 2, j = 2
        int k = h++; // h = 3, k = 2        
        System.out.println(h + j + k); //(3+2+2) = 7;
    }
}