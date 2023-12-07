// class EvenNumberThread extends Thread {
    
//     public void run() {
//         Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
//         System.out.println("Even Number Thread Status before execution: " + Thread.currentThread().getState());
        
//         for (int i = 0; i <= 100; i += 2) {
//             System.out.println("Even: " + i);
//         }
        
//         System.out.println("Even Number Thread Status after execution: " + Thread.currentThread().getState());
//     }
// }

// class FibonacciThread extends Thread {
    
//     public void run() {
//         Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
//         System.out.println("Fibonacci Thread Status before execution: " + Thread.currentThread().getState());

//         int n = 100;
//         int a = 0, b = 1;

//         System.out.println("Fibonacci: " + a);

//         while (b <= n) {
//             System.out.println("Fibonacci: " + b);
//             int temp = a + b;
//             a = b;
//             b = temp;
//         }

//         System.out.println("Fibonacci Thread Status after execution: " + Thread.currentThread().getState());
//     }
// }

class A extends Thread{
    public void run(){
        System.out.println("Thread state before execution" + Thread.currentThread().getState());
        for(int i=0;i<30;i++){
            System.out.println(i);
        }
    }
}

class B extends Thread{
    public void run(){
        System.out.println("Thread 2 stae before execution " + Thread.currentThread().getState());
        for(int i = 0; i<10;i++){
            System.out.println("Gojo");
        }
    }
}



public class Thread_minor {
    
    public static void main(String[] args) throws InterruptedException {
       
        // EvenNumberThread evenThread = new EvenNumberThread();
        // FibonacciThread fibonacciThread = new FibonacciThread();

        // System.out.println("Main Thread Status before execution: " + Thread.currentThread().getState());

        // evenThread.start();
        // fibonacciThread.start();
        // fibonacciThread.join();

        // // Ensure one thread waits for the other to finish
        // // evenThread.join();

        // System.out.println("Main Thread Status after execution: " + Thread.currentThread().getState());


        A obj = new A();
        B obj2 = new B();

        obj.setPriority(Thread.MAX_PRIORITY);
        obj.start();
        obj.join();
        obj2.join();
        obj2.start();


    }

}

// class Student{
//     String name;

//     Student(String name){
//         this.name = name;
//     }

//     String getStudName(){
//         return name;
//     }
// }

// class Batch{
//     String batchName;
//     List<Student> students;

//     Batch(String name){
//         batchName = name;
//         this.students = new ArrayList<>();
//     }
//     void addStudent(Student student){
//         students.add(student);
//     }

//     String getBatchName(){
//         return batchName;
//     }
// }

// class Department{
//     String departmentName;d
//     List<Batch> batches;

//     Department(String name){
//         departmentName = name;
//         this.batches = new ArrayList<>();
//     }

//     void addBatch(Batch batch){
//         batches.add(batch);
//     }

//     String getDepartmentName(){
//         return departmentName;
//     }
// }
