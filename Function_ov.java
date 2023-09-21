import java.util.Scanner;

public class Function_ov {

    // public static int factorial(int n){
    //     if(n<0){
    //             System.out.println("Factorial of negative number is not defined");
    //             return -1;
    //     }

    //     if(n == 0){
    //         return 1;
    //     }
    //     // using recursion
    //     return n*factorial(n-1);

    // }

    public static void print_my_name(){
               System.out.println("My name is Gojo");
    }

    // function overloading.
    public static void print_my_name(String name){
        System.out.println(name + " this side.");
    }
    public static void main(String[] args) {
        print_my_name("Gojo saturo,");
        print_my_name();

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int ans = factorial(n);
        // System.out.println("Factorial of "+ n + " is: "+ans);
        
    }
}
