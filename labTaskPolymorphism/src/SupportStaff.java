public class SupportStaff extends Employees{
    private String responsibilitys;

    public SupportStaff(String firstName, String lastName, int id, String jobTitle, int salary, String responsibilitys) {
        super(firstName, lastName, id, jobTitle, salary);
        this.responsibilitys = responsibilitys;
    }

    public void startWork(){
        System.out.print("Worker " + getFirstName() + " " + getLastName() + " is doing " + responsibilitys);
        super.startWork();
    }
}
