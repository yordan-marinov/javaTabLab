public class Seniors extends Students{
    private String gender;
    private int age;


    public Seniors(String firstName, String lastName, int studentId, int grade, String gender, int age) {
        super(firstName, lastName, studentId, grade);
        this.gender = gender;
        this.age = age;
    }

    public void study() {
        System.out.println("Child " + getFirstName() + " " + getLastName() + " " + age + "years ols is studying.");
    }
}
