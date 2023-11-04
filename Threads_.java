class A extends Thread{
    public void run(){
        for(int i=0;i<30;i++){
            System.out.println("Gojo");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("Something went wrong");
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0;i<30;i++){
            System.out.println("Saturo");

        }
    }
}


public class Threads_ {
    public static void main(String[] args) {
        
        A obj = new A();
        B obj2 = new B();

        // for setting priority of the thread 
        obj2.setPriority(Thread.MAX_PRIORITY);

        obj.start();
        obj2.start();
    }
}
