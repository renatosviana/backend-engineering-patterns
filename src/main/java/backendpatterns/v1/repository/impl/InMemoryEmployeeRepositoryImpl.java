package backendpatterns.v1.repository.impl;

import backendpatterns.v1.Employee;
import backendpatterns.v1.repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class InMemoryEmployeeRepositoryImpl implements EmployeeRepository {
//    Map<Integer, Employee> map = new HashMap<>();
    private final Map<Integer, Employee> map = new java.util.concurrent.ConcurrentHashMap<>();


    public void addEmployee(Employee e) {
        map.put(e.getId(), e);
    }

    public List<Employee> findAll() {
        return new ArrayList<>(map.values());
    }

    public int countEmployee() {
        return map.size();
    }
}
