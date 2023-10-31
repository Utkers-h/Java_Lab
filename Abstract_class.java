abstract class Car{
    abstract public void drive();

    void play_music(){
        System.out.println("Play Music");
    }
}

class Audi extends Car{
    // it becomes necessary for the Audi class to implement the abstract method
    public void drive(){
        System.out.println("It can drive");
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
