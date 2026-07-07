public class methodOverloading {

    public static String typeCheck(int num){
        return "Integer";
    }

    public static String typeCheck(double num){
        return "Double";
    }
    public static void main(String[] args) {
        System.out.println(typeCheck(1.4));
        System.out.println(typeCheck(7));
    }
}
