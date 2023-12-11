import java.util.Set;
import java.util.HashSet;
import java.util.Objects;

class Student {
    String name;
    int rollNo;

    Student(String name,int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    public String toString(){
        return "Name : "+this.name+" Roll No: "+this.rollNo;
    }

    // Overriding equals and hashcode method so that objects added are unique.
    public boolean equals(Student obj){
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student student = (Student) obj;
        return rollNo == student.rollNo;
    }

    public int hashCode(){
        return Objects.hash(rollNo);
    }

}

public class Hashset {
    public static void main(String[] args) {
        // Set<Integer> s = new HashSet<>();
        // s.add(21);
        // s.add(13);
        // s.add(10);
        // s.add(9);
        // s.add(1);

        // System.out.println(s.contains(21));
        // System.out.println(s);
        // System.out.println(s.size());
        // s.remove(9);
        // // s.clear();
        // System.out.println(s);


        // Making non primitive type Set 
        Set <Student> set=new HashSet<>();
        set.add(new Student("Gojo",15));
        set.add(new Student("Yuji", 8));
        set.add(new Student("Toji", 10));
        set.add(new Student("Toji", 10));

        System.out.println(set);

    }
}
