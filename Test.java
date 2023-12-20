// import java.util.List;
// import java.util.ArrayList;

// class Student{
//     String name;

//     Student(String name){
//         this.name = name;
//     }

//     String getStudentName(){
//             return name;
//     }
// }

// class Batch{
//     List<Student> students;
//     String batchname;

//     Batch(String name){
//         batchname = name;
//         this.students = new ArrayList<>();
//     }

//     void addStudent(Student obj){
//         students.add(obj);
//     }

//     List<Student> getStudents(){
//         return students;
//     }

//     String batchname(){
//         return batchname;
//     }
// }

// class Department{
//     List<Batch> batches;
//     String Departmentname;

//     Department(String name){
//         Departmentname = name;
//         batches = new ArrayList<>();
//     }

//     void addbatches(Batch obj){
//         batches.add(obj);
//     }
//     String departmentname(){
//         return Departmentname;
//     }

// }

// class College{
//     List<Department> departments;
//     String Collegename;

//     College(String name){
//         Collegename = name;
//         this.departments = new ArrayList<>();
//     }

//     void addDepartment(Department obj){
//         departments.add(obj);
//     }

//     String getCollegename(){
//         return Collegename;
//     }
// }




public class Test {
    public static void main(String[] args) {
        // College obj = new College("SMVDU");
        // Department dept1=new Department("IT");
        // obj.addDepartment(dept1);
        
        // Batch batch1 = new Batch("CS01");
        // dept1.addbatches(batch1);

        // Student stuArr[] = new Student[2];
        // stuArr[0] = new Student("Gojo");
        // stuArr[1] = new Student("Maki");

        // batch1.addStudent(stuArr[0]);
        // batch1.addStudent(stuArr[1]);

        
        // System.out.println("College Name: " + obj.getCollegename());
        // System.out.println("Department Name: " + dept1.departmentname());
        // System.out.println("Batch Name: " + batch1.batchname());

        // System.out.println("Students of Batch are");
        // // System.out.println(batch1.getStudents());
        // for(Student student : batch1.getStudents()){
        //     System.out.println(student.getStudentName());
        // }

       
                try {
                    // Outer try block
                    System.out.println("Outer Try Block: Start");
        
                    // Some code that may throw an exception
                    int result = divideNumbers(10, 0); // Division by zero
        
                    System.out.println("Result: " + result);
        
                    // Inner try block within the outer try block
                    try {
                        System.out.println("Inner Try Block: Start");
        
                        // Some code that may throw another exception
                        String str = null;
                        int length = str.length(); // Null pointer exception
        
                        System.out.println("Inner Try Block: End");
                    } catch (NullPointerException innerException) {
                        System.out.println("Inner Catch Block: Caught NullPointerException");
                    }
        
                    System.out.println("Outer Try Block: End");
                } catch (ArithmeticException outerException) {
                    System.out.println("Outer Catch Block: Caught ArithmeticException");
                }
            }
        
            // A method that performs division
            private static int divideNumbers(int dividend, int divisor) {
                return dividend / divisor;
            
        
        

    }
}
