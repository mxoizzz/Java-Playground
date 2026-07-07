public class nestedTernary {
    public static void main(String[] args) {
        int time = 10;
        String msg = ( time < 12 )? "Good Morning" : ( time < 18 )? "Good Afternoon" : "Good Evening";
        System.out.println(msg); 
    }
}
