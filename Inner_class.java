class Outer{
    void hello(){
        System.out.println("Inside Outer class");
    }

    class Inner{
        void inner(){
            System.out.println("Inside Inner class");
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
    }
}
