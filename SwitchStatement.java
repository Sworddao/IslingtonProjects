public class SwitchStatement {

    enum Animal {
        DOG, CAT, PIG, SHEEP
    }

    public static void main(String[] args) {
        int a = 4;

        switch(a){
            case 1:
                System.out.println("Number is 1");
                break;
            case 2:
                System.out.println("Number is 2");
                break;
            case 4:
                System.out.println("Number is 4");
                break; 
            default:
                System.out.println("None of them match so default");
        }

        Animal b = Animal.CAT;
        switch(b){
            case SHEEP:
                System.out.println("Animal is SHEEP");
                break;
            case DOG:
                System.out.println("Animal is DOG");
                break;
            case PIG:
                System.out.println("Animal is PIG");
                break;
            case CAT:
                System.out.println("Animal is CAT");
                break;
            default:
                System.out.println("Default case.");
        }
    }
}
