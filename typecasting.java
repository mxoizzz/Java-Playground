public class typecasting {
    public static void main(String[] args){
        // Widening
        // done automatically

        int a = 7;
        double b = a;

        System.out.println(a); //int
        System.out.println(b); //converted to double

        // Narrowing
        // must be done manually

        double x = 23.5;
        int y = (int) x;

        System.out.println(x);
        System.out.println(y);

    }
}
