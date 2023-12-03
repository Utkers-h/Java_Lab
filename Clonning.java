class Student implements Cloneable{
    int id;
    String name;

    Student(int id,String name){
        this.id=id;
        this.name=name;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}



public class Clonning {
    public static void main(String[] args) {
        Student obj1 = new Student(2, "Yuji");
        try{
            Student obj2=(Student)obj1.clone();
            System.out.println("Cloning is successful!");
            System.out.println("Parent object: " + obj1.id+ " : " + obj1.name);
            obj2.id = 3 ;
            obj2.name ="Saturo Gojo";
            System.out.println("Cloned object: " + obj2.id+ " : " + obj2.name);
            System.out.println("After updating object clone , there will be no change in primitive values of obj1");
            System.out.println("Parent object: " + obj1.id+ " : " + obj1.name);


        }catch(CloneNotSupportedException e){
            System.out.println("Erorr: "+ e);
        };
    }
}
