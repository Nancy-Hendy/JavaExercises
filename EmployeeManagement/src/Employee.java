public class Employee {
    //attributes
    protected String firstName;
    protected String lastName;
    protected String department;
    protected int employeeId;
    protected int age;

    //constructor
    public Employee(String empFName, String empLName, String dept, int id, int empAge) {
        firstName = empFName;
        lastName = empLName;
        department = dept;
        employeeId = id;
        age = empAge;
    }
    public Employee(String fname, int age){
        this.firstName = fname;
        this.age = age;
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }

    public void introduction(){
        System.out.println("Full name: " + getFullName());
        System.out.println("Department: " + department);
        System.out.println("Id: " + employeeId);
        System.out.println("Age: " + age);
    }

    public String toString() {
        return "Name is " + firstName +" & age is "+ age;
    }

    //    public String introduction(){
//        return "Full name: \n" + getFullName() + " ,Department: " + department +" ,Id: " + employeeId +" ,Age: " + age;
//
//}
    public void incAge(){
        if(age<65){
            age++;
        }
    }

    //getter
    public int getAge() {
        return age;
    }
}