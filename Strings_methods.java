import java.util.Arrays;

public class Strings_methods {
    public static void main(String[] args) {
        // declaration of string using string literal
        // String name = "GOJO";

        // declartion of the string using new keyword
        String name = new String("GOJO");
        // System.out.println(name);



        // string methods
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        // BUT this doesn't change the original string , since string are immutable 
        System.out.println(name);
        // But if we explicitly assign it to the reference variable, it will refer to the original object.   
        name = name.concat(" Saturo");
        System.out.println(name);

        // System.out.println(name.substring(1, 8));
        // System.out.println(name.indexOf("S"));

        // String s = "GOJO Saturo";

        // System.out.println(name==s);
        // System.out.println(name.equals(s));

        // String str = new String(s); 
        // str = str.replace("S", "s");
        // System.out.println(str);

        // == operators simply compares location of the strings, hence will not give the desired output
        // System.out.println(str == s);

        String a = "Hello World";
        String b = "hello Gojo";
        System.out.println((a == b ) + "\n" + (a.equals(b)) + "\n" + (a.concat(b)) + "\n" + (a.equalsIgnoreCase(b)) + "\n" + Arrays.toString(a.split("")) + "\n" + a.hashCode() +"\n" + a.substring(2) + "\n" + a.indexOf("J") + "\n" + a.toUpperCase() + "\n" + a.toLowerCase());

        // Reversing a string 
        // StringBuilder   sb = new StringBuilder("Gojo Saturo");
        // for(int i=0;i<sb.length()/2; i++){

        //     char front = sb.charAt(i);
        //     char back = sb.charAt(sb.length()-i-1);

        //     sb.setCharAt(i, back);
        //     sb.setCharAt(sb.length()-i-1, front);
        // }
        // System.out.println("Reversed string is: "+ sb);

    }
}
