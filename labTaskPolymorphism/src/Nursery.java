public class Nursery extends Students{

    private String gender;
    private int age;

    public Nursery(String firstName, String lastName, int studentId, int grade, String gender, int age) {
        super(firstName, lastName, studentId, grade);
        this.gender = gender;
        this.age = age;
    }

    public void study() {
        System.out.println("Children " + getFirstName() + " " + getLastName() + " is studying.");
    }
}
