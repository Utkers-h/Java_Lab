class Student{
    public int id;
    public String name;

    void getdetails(int id, String name){
        this.id = id;
        this.name = name;

    }

    void display_details(){
        System.out.println("Student name: "+name+" and Student id is: "+id);
    }

}


public class Array_of_obj {
    public static void main(String[] args) {
        // creating array of objects of student class
        Student stuArr[] = new Student[2];

        // Declartion of  the objects 
        stuArr[0] = new Student();
        stuArr[1] = new Student();

        // filling the details of objects
        stuArr[0].getdetails(1, "Gojo Saturo");
        stuArr[1].getdetails(2, "Yuji Itadori");

        System.out.println("Welcome to Jujustu High");
            // using loop for iterating the objects
               for (int i= 0 ; i<stuArr.length ; ++i ){
                    stuArr[i].display_details();
               }
    }

}
