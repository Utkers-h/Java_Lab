class A extends Thread{
    public void run(){
        System.out.println("Current state" + Thread.currentThread().getState());
        System.out.println("Name: " + Thread.currentThread().getName());
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
        System.out.println("Current state" + Thread.currentThread().getState());
        for(int i=0;i<30;i++){
            System.out.println("Saturo");

        }
    }
}


public class Threads_ {
    public static void main(String[] args) throws
     InterruptedException{
        
        A obj = new A();
        B obj2 = new B();

        // for setting priority of the thread 
        obj2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(obj.getPriority());
        
        obj.start();
        // obj2.join();
        obj2.start();
    }
}
