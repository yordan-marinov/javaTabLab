public class Adminstration extends Employees{
    private String department;

    public Adminstration(String firstName, String lastName, int id, String jobTitle, int salary, String department) {
        super(firstName, lastName, id, jobTitle, salary);
        this.department = department;
    }
    public void startWork(){
        System.out.print("Administrator " + getFirstName() + " " + getLastName());
        super.startWork();
    }
}
