import java.util.ArrayList;
import java.util.List;

class Student {
    private String studentName;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }
}

class Batch {
    private List<Student> students;
    private String batchName;

    public Batch(String batchName) {
        this.batchName = batchName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public String getBatchName() {
        return batchName;
    }
}

class Department {
    private List<Batch> batches;
    private String departmentName;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.batches = new ArrayList<>();
    }

    public void addBatch(Batch batch) {
        batches.add(batch);
    }

    public List<Batch> getBatches() {
        return batches;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}

class College {
    private List<Department> departments;
    private String collegeName;

    public College(String collegeName) {
        this.collegeName = collegeName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public String getCollegeName() {
        return collegeName;
    }
}

class University {
    private List<College> colleges;
    private String universityName;

    public University(String universityName) {
        this.universityName = universityName;
        this.colleges = new ArrayList<>();
    }

    public void addCollege(College college) {
        colleges.add(college);
    }

    public List<College> getColleges() {
        return colleges;
    }

    public String getUniversityName() {
        return universityName;
    }
}



public class University_composition {
    public static void main(String[] args) {
         University university = new University("Smvdu University");

        // Create a College
        College college = new College("Engineering College");
        university.addCollege(college);

        // Create a Department
        Department department = new Department("Computer Science");
        college.addDepartment(department);

        // Create a Batch
        Batch batch = new Batch("CS101");
        department.addBatch(batch);

        // Create Students and add them to the Batch
        Student student1 = new Student("Gojo");
        Student student2 = new Student("Sukuna");
        batch.addStudent(student1);
        batch.addStudent(student2);

        // Accessing information
        System.out.println("University Name: " + university.getUniversityName());
        System.out.println("College Name: " + college.getCollegeName());
        System.out.println("Department Name: " + department.getDepartmentName());
        System.out.println("Batch Name: " + batch.getBatchName());

        // Displaying students in the batch
        System.out.println("Students in Batch " + batch.getBatchName() + ":");
        for (Student student : batch.getStudents()) {
            System.out.println(student.getStudentName());
        }
    }
}
