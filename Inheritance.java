// Base class
class Engineer{
    public void display(){
        System.out.println("Ha Bhai, Mil gya IIt!!");
    }
}

class Cse extends Engineer{
    public void expectation(){
        System.out.println("Ab to Google me placement pakka!");
    }

    public void reality(){
        System.out.println("Bhai yahan pr kya ho rha hai .. kaha fas gya bhai mai");
    }
}


public class Inheritance  {

    public static void main(String[] args) {
        Cse obj = new Cse();
        obj.display();
        obj.expectation();
        obj.reality();

    }
}
