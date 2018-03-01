public abstract class Employee {

    private String name;
    private String ni;
    private double salary;

    public Employee(String name, String ni, double salary) {
        this.name = name;
        this.ni = ni;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != "") {this.name = name;}
    }

    public String getNi() {
        return ni;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double raise) {
        if (raise > 0.00) {this.salary = salary += raise;}
    }

    public double payBonus() {
        return salary/100;
    }
}
