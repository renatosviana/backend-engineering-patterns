package backendpatterns.mar092026;

import backendpatterns.mar092026.repository.EmployeeRepository;
import backendpatterns.mar092026.repository.impl.InMemoryEmployeeRepositoryImpl;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadTest {
    public static void main(String[] args) throws Exception {
//        Map<Integer, Employee> map = new HashMap<>();
        Map<Integer, Integer> map = new ConcurrentHashMap<>();

        EmployeeRepository repo = new InMemoryEmployeeRepositoryImpl();

        int threads = 10;
        int itemsPerThread = 1000;

        ExecutorService executor = Executors.newFixedThreadPool(threads);

        for (int t = 0; t < threads; t++) {
            final int threadId = t;
            executor.submit(() -> {
                for (int i = 0; i < itemsPerThread; i++) {
                    int key = threadId * itemsPerThread + i;
                    Employee e = new Employee(key, "Emp" + key, 1000 + key);
                    repo.addEmployee(e);
                }
            });
        }

        executor.shutdown();
        executor.awaitTermination(5, TimeUnit.SECONDS);

        System.out.println("Expected: " + (threads * itemsPerThread));
        System.out.println("Actual:   " + repo.countEmployee());
    }
}
