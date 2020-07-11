package eh223im_assign3;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("John","Los Angeles","0123456789","john@wwe.com");
        Student student = new Student("Cena","New York","0518123456","cena@newyork.edu","freshmen");
        Employee employee = new Employee("Simeon","Los Angeles","0123456789","simeon@pms.com","20130917",150000000);
        Staff staff = new Staff("Franklin","Los Angeles","0123456789","franklin@pms.com","20130917",10000000,"CEO");
        Faculty faculty = new Faculty("Lamar","Los Angeles","0123456789","lamar@pms.com","20130917",150000,"Vice President","0800-1700");
        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(staff.toString());
        System.out.println(faculty.toString());
    }
}
