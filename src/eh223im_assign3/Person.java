package eh223im_assign3;

import java.util.ArrayList;

public class Person {
    private String name;
    private String address;
    private String phonenumber;
    private String emailaddress;

    public Person(String name, String address, String phonenumber, String emailaddress) {
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
        this.emailaddress = emailaddress;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    ArrayList callMeWhenYouNeedSomeHelp() {
        ArrayList al = new ArrayList();
        al.add(getName());
        al.add(getAddress());
        al.add(getPhonenumber());
        al.add(getEmailaddress());
        return al;
    }

    public String toString() {
        return callMeWhenYouNeedSomeHelp().toString();
    }
}

class Student extends Person {
    private String classStatus;

    public Student (String name, String address, String phonenumber, String emailaddress, String classStatus) {
        super(name, address, phonenumber, emailaddress);
        this.classStatus = classStatus;
    }

    public Student() {

    }

    public String getClassStatus() {
        return classStatus;
    }

    public void setClassStatus(String classStatus) {
        this.classStatus = classStatus;
    }

    public String toString() {
        ArrayList<String> al = callMeWhenYouNeedSomeHelp();
        al.add(classStatus);
        return al.toString();
    }
}

class Employee extends Person {
    private String dateHired;
    private int salary;

    public Employee (String name, String address, String phonenumber, String emailaddress, String dateHired, int salary) {
        super (name, address, phonenumber, emailaddress);
        this.dateHired = dateHired;
        this.salary = salary;
    }

    public Employee() {

    }

    public String getDateHired() {
        return dateHired;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    ArrayList callMeWhenYouNeedSomeMoreHelp() {
        ArrayList al = callMeWhenYouNeedSomeHelp();
        al.add(getDateHired());
        al.add(getSalary());
        return al;
    }

    public String toString() {
        ArrayList al = callMeWhenYouNeedSomeMoreHelp();
        return al.toString();
    }
}

class Faculty extends Employee {
    private String rank;
    private String officeHour;

    public Faculty(String name, String address, String phonenumber, String emailaddress, String dateHired, int salary, String rank, String officeHour) {
        super(name, address, phonenumber, emailaddress, dateHired, salary);
        this.rank = rank;
        this.officeHour = officeHour;
    }

    public Faculty() {

    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getOfficeHour() {
        return officeHour;
    }

    public void setOfficeHour(String officeHour) {
        this.officeHour = officeHour;
    }

    public String toString() {
        ArrayList al = callMeWhenYouNeedSomeMoreHelp();
        al.add(rank);
        al.add(officeHour);
        return al.toString();
    }
}

class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phonenumber, String emailaddress, String dateHired, int salary, String title) {
        super(name, address, phonenumber, emailaddress, dateHired, salary);
        this.title = title;
    }

    public Staff() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        ArrayList al = callMeWhenYouNeedSomeMoreHelp();
        al.add(title);
        return al.toString();
    }
}