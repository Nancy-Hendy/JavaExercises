public class Manager extends Employee{

        private final Employee[] manages; //// WHY FINAL ////
        private int tracker;


        public Manager(String fname, int age) {
            super(fname, age);
            manages = new Employee[100];
            tracker=0;
        }

        public void addEmployee(Employee employee){
            manages[tracker] = employee;
            tracker++;
        }

        public String getEmployeesNames(){
            StringBuilder empNames = new StringBuilder();

            for (int i = 0; i< tracker;i++)
                 empNames.append(" ").append(manages[i].getFullName());

            return empNames.toString(); ////   WHY HERE ////

        }

        public String toString(){
            return super.toString() + " manages: " + getEmployeesNames();
        }





//    public Manager(String firstName, String lastName, String dept, int id, int age){
//        super(firstName,lastName,"IT",123,age);


    }
