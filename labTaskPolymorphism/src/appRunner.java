public class appRunner {

    public static void main(String[] args) {
        Employees teacher = new Teachers("Joe", "Doe", 100, "Thacher", 250000, "Computer science");
        Employees admin = new Adminstration("Joan", "Alison", 231, "QR", 234442, "Administration");
        Employees technical = new SupportStaff("Andy", "Hawk", 881, "Engineer", 30000, "Maintenance");


        Students sussy = new Seniors("Sussy", "Smith", 123, 12, "Female", 23);
        Students johny = new Junior("Johnny", "Anderson", 234, 6, "Male", 12);
        Students dave = new Nursery("Dave", "Though", 267, 3, "Male", 5);

        Teachers t = (Teachers)teacher;
        t.teach();
        t.teach(johny);
        System.out.println();
        t.startWork();
        System.out.println();
        admin.startWork();
        System.out.println();
        technical.startWork();
        System.out.println();
        sussy.enroll("Math");
        sussy.enroll("English");
        sussy.printCourses();
        System.out.println();
        dave.enroll("Computer Science");
        dave.enroll("Java");
        dave.enroll("Python");
        dave.printCourses();

    }

}
