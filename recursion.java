public class recursion {

    public static int sum(int n){
        if(n>0){
            return n+ sum(n-1);
        }
        else{
            return 0;
        }
    }

    public static int factorial(int n){
        if(n>0){
            return n*factorial(n-1);
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println("Sum: "+sum(10));
        System.out.println("Factorial: "+factorial(5));
    }
}
