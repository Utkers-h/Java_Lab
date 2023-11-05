public class Non_static_static {

    String name;
    static String school;
    // static block
    static{
        // this block only will be called once at the time of class loading , hence will be executed before constructor.
        school = "Jujustu High";
        System.out.println("Welcome to Jujustu High");
    }

    {
        System.out.println("Hello");
    }

    void display(){
        System.out.println("Name: "+name+ " Student of "+ school);
    }

    Non_static_static(){
        System.out.println("1st year students of  Jujustu High Tokyo region");
    }

    Non_static_static(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        
        Non_static_static obj1 = new Non_static_static("Saturo Gojo");
        Non_static_static obj2 = new Non_static_static("Suguru Geto");

        Non_static_static obj3 = new Non_static_static();

        obj1.display();
        obj2.display();
    }
}
