

final class A{
    final int speed = 400;
    final public void show(){
        // will throw an error 
        // speed = 200;
        System.out.println("speed is "+speed);
    }
}


// class B extends A{
//     // Cannot override the final method from A
//     public void show(){
//         System.out.println("Error");
//     }
// }




public class Final_class_method {
    public static void main(String[] args) {
        A objA = new A();
    }
}
