import java.util.*;

public class EmployeeNameComparator implements java.util.Comparator<Employee>{
    public int compare(Employee e1,Employee e2){
        String name1 = e1.getFullName();
        String name2 = e2.getFullName();
        return name1.compareTo(name2);
    }
//    List<Employee> employeeList = new ArrayList<>();
//    Set<Employee> employeeSet = new TreeSet<>(new EmployeeNameComparator());
//    Collections.sort(employeeList,EmployeeNameComparator);


}
