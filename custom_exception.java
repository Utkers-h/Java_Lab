class My_exception extends Exception{

    public My_exception(String str){
        super(str);
    }
}



public class custom_exception {
    
        static  void validate(int age) throws My_exception{
            if (age<18) throw new My_exception("You are not eligible");
            else{
                System.out.println("Congratulation you are eligible for voting");
            }
        }
    
    public static void main(String[] args) {
        try{
            validate(12);
        }catch(My_exception e){
            System.out.println(e);
        }
    }
}
