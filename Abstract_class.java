abstract class Car{
    public abstract void drive();

    void play_music(){
        System.out.println("Play Music");
    }
}

class Audi extends Car{
    // it becomes necessary for the Audi class to implement the abstract method
    public void drive(){
        System.out.println("It can drive");
    }
    void Automate(){
        System.out.println("Automatic Transmission");
    }
}

public class Abstract_class {
    public static void main(String[] args) {

        // referencing abstract class variable to subclass
        Car obj = new Audi();
        obj.drive();
        obj.play_music();
        

    }
}
