import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        int age;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your Age: "); 
        age = s.nextInt();

        if(age>18){
            System.out.println("Adult\n");
        }
        else{
            System.out.println("Not an Adult");
        }

        int button =1;

        switch(button){

            case 1:
                System.out.println("Hello!");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour!");
                break;
        }

    }
}
