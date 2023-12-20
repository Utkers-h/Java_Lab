
class A{
    public A(){
        // this(3);
        System.out.println("In default constructor of A");
    }

    public A(int n){
        System.out.println("In parameterized constructor of A");
    }

}

class B extends A {
    public B(){
        // By default it will call the constructor of parent class , using super 
        // But if we want to call paramterized constructor of A , then we have to specify parameter to super
        super(7);
        System.out.println("In default constructor of B");
    }

    public B(int n){
        // if we want to call both constructor using one object then , we can use this keyword
        this();
        System.out.println("In parametrized constructor of B");
    }
}



public class super_in_java {
    public static void main(String[] args) {

        B obj = new B(7); 
    }
}
