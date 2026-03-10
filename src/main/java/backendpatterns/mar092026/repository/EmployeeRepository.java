package backendpatterns.mar092026.repository;

import backendpatterns.mar092026.Employee;

import java.util.List;

public interface EmployeeRepository {
    public void addEmployee(Employee e);

    public List<Employee> findAll();


//    public Employee getEmployeeById(int id);
//    public void removeEmployeeById(int id);
//    public List<Employee> getAllEmployees();
    public int countEmployee();
//    public Employee getMaxSalary();
}
