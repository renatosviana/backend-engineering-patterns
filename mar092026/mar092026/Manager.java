package prepjavaafterselfevaluationon03mar2026.sevendays03marto09mar.mar092026;

public class Manager extends Employee {
    private int teamSize;

    public Manager(int id, String name, int salary, int teamSize) {
        super(id, name, salary);
        this.teamSize = teamSize;
    }
}
