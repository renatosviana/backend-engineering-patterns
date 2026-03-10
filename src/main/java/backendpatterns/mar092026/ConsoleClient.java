package backendpatterns.mar092026;

import backendpatterns.mar092026.repository.impl.InMemoryEmployeeRepositoryImpl;
import backendpatterns.mar092026.repository.EmployeeRepository;
import backendpatterns.mar092026.service.EmployeeManagerService;

public class ConsoleClient {
    public static void main(String [] args) {
//        dependency is required
//
//        cannot accidentally be reassigned
//
//        safer for multithreading
//
//        easier to reason about

        EmployeeRepository repo = new InMemoryEmployeeRepositoryImpl();

        EmployeeManagerService service = new EmployeeManagerService(repo);

        Employee e1 = new Employee(1,"Josh",2000);
        Employee e2 = new Employee(2,"Simin",3000);
        Employee e3 = new Employee(3,"Johnzi",4000);
        Manager m1 = new Manager(4,"Mommy",6000,3);

        service.addEmployee(e1);
        service.addEmployee(e2);
        service.addEmployee(e3);
        service.addEmployee(m1);



    }
}
