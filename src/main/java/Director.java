public class Director extends Manager {

    private double budget;
    private double salary;

    public Director(String name, String ni, double salary, String deptName, double budget) {
        super(name, ni, salary, deptName);
        this.budget = budget;
        this.salary = salary;

    }

    public double getBudget() {
        return budget;
    }

    public double payBonus() {
        return salary/50;
    }
}
