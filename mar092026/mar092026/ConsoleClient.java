package prepjavaafterselfevaluationon03mar2026.sevendays03marto09mar.mar092026;

import prepjavaafterselfevaluationon03mar2026.sevendays03marto09mar.mar092026.repository.EmployeeRepository;
import prepjavaafterselfevaluationon03mar2026.sevendays03marto09mar.mar092026.repository.impl.InMemoryEmployeeRepositoryImpl;
import prepjavaafterselfevaluationon03mar2026.sevendays03marto09mar.mar092026.service.EmployeeManagerService;

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

        prepjavaafterselfevaluationon03mar2026.sevendays03marto09mar.mar092026.Employee e1 = new prepjavaafterselfevaluationon03mar2026.sevendays03marto09mar.mar092026.Employee(1,"Josh",2000);
        prepjavaafterselfevaluationon03mar2026.sevendays03marto09mar.mar092026.Employee e2 = new prepjavaafterselfevaluationon03mar2026.sevendays03marto09mar.mar092026.Employee(2,"Simin",3000);
        prepjavaafterselfevaluationon03mar2026.sevendays03marto09mar.mar092026.Employee e3 = new prepjavaafterselfevaluationon03mar2026.sevendays03marto09mar.mar092026.Employee(3,"Johnzi",4000);
        prepjavaafterselfevaluationon03mar2026.sevendays03marto09mar.mar092026.Manager m1 = new prepjavaafterselfevaluationon03mar2026.sevendays03marto09mar.mar092026.Manager(4,"Mommy",6000,3);

        service.addEmployee(e1);
        service.addEmployee(e2);
        service.addEmployee(e3);
        service.addEmployee(m1);



    }
}
