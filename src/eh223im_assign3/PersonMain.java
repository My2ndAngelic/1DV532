package eh223im_assign3;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("Donald"," 1600 Pennsylvania Avenue NW, Washington, DC 20500","+1 202-456-1111","trump@whitehouse.gov");
        Student student = new Student("John","New York","0518123456","john@newyork.edu","freshmen");
        Employee employee = new Employee("Simeon","Los Santos","0123456789","sy@pms.com","20130917",150000000);
        Staff staff = new Staff("Franklin","Los Santos","0123456789","franklin@pms.com","20130917",10000000,"CEO");
        Faculty faculty = new Faculty("Lamar","Los Santos","0123456789","lamar@pms.com","20130917",150000,"Vice President","0800-0900");
        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(staff.toString());
        System.out.println(faculty.toString());
    }
}
