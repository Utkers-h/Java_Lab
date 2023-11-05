class Outer{
    public  String name;

    public void hello(){
        System.out.println("Inside Outer class");
    }

    class Inner{
        void inner(){
            System.out.println("Inside Inner class");
            // A non static inner class has full access to members of the Outer class
            System.out.println("A non static inner class has full access to members of the Outer class");
            name="Gojo";
            hello();
        }
        
    }

    static class Inner_class_nested{
        void display(){
            System.out.println("Displaying from Static Nested Class");

            // to access the non static methods of the Outer class in static inner class, we have to create objected of it
            // Outer obj3 = new Outer();
            // obj3.hello();
        }
        
    }
}




public class Inner_class {
    public static void main(String[] args) {
        
        Outer obj = new Outer();
        obj.hello();

        // creating obj of inner class

        // first specify to which class it belongs to, and then we need object of outer class to create object of inner class

        Outer.Inner inObj = obj.new Inner();
        inObj.inner();
        
        

        //creating object of static nested class
        Outer.Inner_class_nested obj2 = new Outer.Inner_class_nested();
        obj2.display();

    }
}
