interface JJk{

    String name="Gojo"; // final,static and public
    void display(); // by default it is abstract and public

}

interface Curse{

    void show();
}

class Jujustu_High implements JJk,Curse{ // multiple interfaces to replicate multiple inheritance

    public void display(){
        System.out.println("Welcome to Jujustu High..");
    }

    public void show(){
        System.out.println("Gambare, gambare. - Sukuna Ryomen");
    }

}


public class Interfaces {

    public static void main(String[] args) {
        JJk obj = new Jujustu_High();
        obj.display();
        System.out.println(obj.name);

        // Jujustu_High.name ="Saturo Gojo"; // The final field JJk.name cannot be reassigned , hence will return an error
        Curse curse=new Jujustu_High();
        // curse.show();

        Jujustu_High s1 = new Jujustu_High();
        s1.display();
        s1.show();
        
    }
}
