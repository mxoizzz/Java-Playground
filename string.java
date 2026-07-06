public class string {
    public static void main(String[] args) {
        String txt = "Java is not Python. It is Java.";
        System.out.println(txt);

        System.out.println(txt.length());
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        
        
        System.out.println(txt.indexOf("is"));
        System.out.println(txt.charAt(6));

        String str1 = "abc", str2 = "abc";
        System.out.println(str1.equals(str2));

        String text = "     Hello       ";
        System.out.println(text);
        System.out.println(text.trim());
    }
}
