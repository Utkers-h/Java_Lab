import java.util.Arrays;

class Student implements Comparable<Student> {
    private String name;
    private int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }



    public int compareTo(Student other) {
        // Compare students based on their roll numbers
        if(this.rollNumber < other.rollNumber)
            return -1;
        else    
            return 1;
    }


    public String toString() {
        return "rollNo=" + rollNumber + ", name='" + name + '\'' ;
    }
}


public class Compareable_interface {
    public static void main(String[] args) {
        // Sorting an array of Student objects
        Student[] students = {
            new Student("Gojo", 5),
            new Student("Yuji", 7),
            new Student("Maki", 1)
        };

        Arrays.sort(students);

        System.out.println("Sorted Students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
