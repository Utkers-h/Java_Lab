class Parent {
    Parent demo() {
        System.out.println("Parent demo");
        return new Parent();
    }
}

class Child extends Parent {
    // Overriding the demo method with a return type that is a subtype of the return type in the Parent class
    Child demo() {
        System.out.println("Child demo");
        return new Child();
    }
}


public class Method_overriding_2 {
    public static void main(String[] args) {
        // Creating an object of the Child class
        Child childObj = new Child();

        Parent obj = new Child();

        // Parent res = obj.demo();
        // Calling the overridden demo method in the Child class
        Child result = childObj.demo();
    }
}
