public class Captalise_even_odd {
    public static void main(String[] args){
        String a = "eren yeager";
        StringBuilder aEven = new StringBuilder("");
        System.out.println("Converting first letter of string to uppercase");
        String first = a.substring(0, 1).toUpperCase();
        System.out.println(first + a.substring(1));
        System.out.println("Even Uppercases:");
        for (int i=0; i<a.length();i++){
            if(i%2==0){
                aEven.append(Character.toUpperCase(a.charAt(i)));
            }
            else{
                aEven.append(a.charAt(i));
            }
        }
        System.out.println(aEven);
    }
}
