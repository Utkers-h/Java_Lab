class Dog{
    public String name;
    public int age;

    public void Bark(){
        System.out.println("Ruff!! Ruff!!");
    }
    public void details(){
        System.out.println("Name of Dog is: "+ name);
        System.out.println("Age of Dog is: "+ age);
    }
}

public class Objects_classes {
    //creating objects
    public static void main(String[] args) {
        Dog mydog = new Dog();
        mydog.name = "jack";
        mydog.age= 4;
        mydog.details();
        mydog.Bark();
    }
    
}
