package prepjavaafterselfevaluationon03mar2026.sevendays03marto09mar.mar092026.service;

import prepjavaafterselfevaluationon03mar2026.sevendays03marto09mar.mar092026.Employee;
import prepjavaafterselfevaluationon03mar2026.sevendays03marto09mar.mar092026.repository.EmployeeRepository;

import java.util.Map;
import java.util.HashMap;

public class EmployeeManagerService {
    Map<Integer, Integer> map = new HashMap<>();

    private final EmployeeRepository employeeRepository;

    public EmployeeManagerService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void addEmployee(Employee e) {
      employeeRepository.addEmployee(e);
    }

}
