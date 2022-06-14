import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class EmpTest {

    @Test

    public void EmpNames() {
        Employee emp1 = new Employee("Zeyad", "Farahat", "Senior", 1001, 6);
        Manager manager1 = new Manager("Blablabla", 25);
        Assertions.assertEquals("Zeyad Farahat", emp1.getFullName());
    }
//@Test
//    public void ArraySize() {
//        List<Employee> employee = new ArrayList<>();
//        Manager manager = new Manager("Nancy", 33);
//        Employee emp1 = new Employee("Zeyad", "Farahat", "Senior", 1001, 6);
//        Employee emp2 = new Employee("Zeyad", "Farahat", "Senior", 1001, 6);
//        Employee emp3 = new Employee("Zeyad", "Farahat", "Senior", 1001, 6);
//        Employee emp4 = new Employee("Zeyad", "Farahat", "Senior", 1001, 6);
//        Employee emp5 = new Employee("Zeyad", "Farahat", "Senior", 1001, 6);
//        Employee emp6 = new Employee("Zeyad", "Farahat", "Senior", 1001, 6);
//        Collections.addAll(employee, emp1, emp3, emp2, emp4, emp5, emp6);
//        for (Employee items : employee) {
//            manager.addEmployee(items);
////        }
//        Assertions.assertEquals(6,manager.manages.size());


    }
