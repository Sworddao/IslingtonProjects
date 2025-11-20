public class DefaultValues{

    byte myByte;
    short myShort;
    int myInt;
    long myLong;
    float myFloat;
    double myDouble;
    char myChar;
    boolean myBoolean;

    public static void main(String[] args){

        DefaultValues intial = new DefaultValues();

        System.out.println(intial.myByte);
        System.out.println(intial.myShort);
        System.out.println(intial.myInt);
        System.out.println(intial.myLong);
        System.out.println(intial.myFloat);
        System.out.println(intial.myDouble);
        System.out.println(intial.myChar); 
        System.out.println(intial.myBoolean);
    }
}