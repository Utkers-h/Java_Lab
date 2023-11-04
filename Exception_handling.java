public class Exception_handling {

    static  void validate(int age) {
        if (age<18) {
            // used to throw a single exception
            throw new ArithmeticException("You are not eligible for vote") ;
        }
        else{
            System.out.println("Congratulation you are eligible for voting");
        }
    }


    // it is used to tell the programmer that there can be an exception in the method hence it will throw the error , 
    // that will be catched by try , catch block
    static void throws_example() throws ArithmeticException{
        int result = 21/0;
    }

    public static void main(String[] args) {
        // for throw keyword
        // try{
        //     validate(10);
        // }catch(ArithmeticException e){
        //     System.out.println(e);
        // }catch(Exception e){
        //     System.out.println("Some other exception occurred "+e);
        // }finally{
        //     System.out.println("This will always be exceuted ");
        // }


        // for throws 
        try{
            throws_example();
        }catch(ArithmeticException e){
            System.out.println(e);
        }finally{
            System.out.println("This will always be executed");
        }
        

    }
}
