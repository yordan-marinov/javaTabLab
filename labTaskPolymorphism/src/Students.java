import java.util.ArrayList;
import java.util.List;

public class Students extends SchoolManagementSystem {
    private int studentId;
    private List<String> courses;
    private int grade;

    public Students(String firstName, String lastName, int studentId, int grade) {
        super(firstName, lastName);
        this.studentId = studentId;
        this.courses = new ArrayList<>();
        this.grade = grade;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void study(){
        System.out.println("The student is studying");
    }

    public void enroll(String course){
        courses.add(course);
    }

    public void printCourses(){
        System.out.println(getFirstName() + " " + getLastName()+ " is enrolled in:");
        for (String cours : courses) {
            System.out.println("\t"+cours);
        }
    }

}
