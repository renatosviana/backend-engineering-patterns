package prepjavaafterselfevaluationon03mar2026.sevendays03marto09mar.mar092026;

public class Employee {
    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getSalary() {
        return this.salary;
    }

    public String toString() {
        return this.id+" "+this.name+" "+this.salary;
    }
}
