class Parent{
    public void show(){
        System.out.println("Parent class");
    }
}

class Child extends Parent{
    public void child_fun(){
        System.out.println("Child class");
    }
}

public class Get_Class {
    public static void main(String[] args) {
        Parent obj = new Parent();
        System.out.println(obj instanceof Parent);
        System.out.println(obj instanceof Child);
        System.out.println(obj.getClass());

        Child obj2 = new Child();
        System.out.println("Checking whether child class obj is an instance of parent class or not");
        System.out.println(obj2 instanceof Parent);
    }
}
