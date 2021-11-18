public class Teachers extends Employees{
    private String subject;

    public Teachers(String firstName, String lastName, int id, String jobTitle, int salary, String subject) {
        super(firstName, lastName, id, jobTitle, salary);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void teach(){
        System.out.println(getFirstName() + " " + getLastName() + " is teaching " + subject);
    }

    public void teach(Students student){
        System.out.println(getFirstName() + " " + getLastName() + " is teaching "+ student.getFirstName() + " the subject " + subject);
    }

    @Override
    public void startWork(){
        System.out.print(getFirstName() + " " + getLastName());
        super.startWork();
    }

    @Override
    public String toString() {
        return "Teachers{" + getFirstName()+" " + getLastName() +
               "subject='" + subject + '\'' +
               '}';
    }
}
