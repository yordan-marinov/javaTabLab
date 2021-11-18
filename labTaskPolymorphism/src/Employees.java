public class Employees extends SchoolManagementSystem {
    private int id;
    private String jobTitle;
    private int salary;

    public Employees(String firstName, String lastName, int id, String jobTitle, int salary) {
        super(firstName, lastName);
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void startWork(){
        System.out.println(" employee starts working");
    }

}
