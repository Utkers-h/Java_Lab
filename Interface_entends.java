interface Music {
    void music();
}

interface Car extends Music{
    void drive();
}


class Audi implements Car{
        public void music(){
            System.out.println("It can play music");
        }

        public void drive(){
            System.out.println("Smooth drive");
        }
}

public class Interface_entends {
    public static void main(String[] args) {
        Car audi = new Audi();
        audi.music(); 
    }
}
