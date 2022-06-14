public class EmployeeApplication {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Martina", "Yusuf", "HR", 1001, 21);
        Employee emp2 = new Employee("John", "Doe", "IT", 1002, 25);
        Manager manager = new Manager("Nancy",33);

//        emp1.introduction();
//        emp2.introduction();
//        emp3.introduction();

        Employee[] employee = {emp1,emp2,manager};
//
//        for (int i =0; i< employee.length; i++){
//            employee[i].introduction();
//        }

        manager.addEmployee(emp1);
        manager.addEmployee(emp2);

        for (Employee value : employee) {
            System.out.println(value);
        }

        //see the output, the age is not incremented past 65
//        for(int i=0; i<70; i++ ){
//            emp1.incAge();
//            System.out.println(emp1.getAge());
//        }
    }
}