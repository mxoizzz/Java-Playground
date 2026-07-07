public class methods {
    public static void welcomeMessage(){
        System.out.println("Welcome to Java!");
    }

    public static void printName(String name){
        System.out.println("Name: "+name);
    }

    public static int sum(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        welcomeMessage();
        printName("Moiz");
        int res = sum(10,10);
        System.out.println(res);
    }
}
