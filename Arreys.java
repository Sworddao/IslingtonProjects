public class Arreys {
    public static void main(String[] args) {

        int[] ages = {17, 21, 18, 14};
        boolean[] student = new boolean[4];
        student[0] = false;
        student[1] = true;
        student[2] = true;
        student[3] = false;

        for (int i = 0; i < ages.length; i++) {
            System.out.println("Age: " + ages[i] + ", Student: " + student[i]);
        }
    }
}
