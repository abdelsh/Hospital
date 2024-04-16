package hospital;

public class Staff extends Human{
    private int id;
    private double salary, dedications;

    public Staff() {
    }

    @Override
    public String toString() {
        return "Staff{" + "id=" + id + ", salary=" + salary + ", dedications=" + dedications + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getDedications() {
        return dedications;
    }

    public void setDedications(double dedications) {
        this.dedications = dedications;
    }

    public Staff(int id, double salary, double dedications, String name, String gender, double weight, double height, int age) {
        super(name, gender, weight, height, age);
        this.id = id;
        this.salary = salary;
        this.dedications = dedications;
    }
}
