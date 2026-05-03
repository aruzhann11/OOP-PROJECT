public abstract class Employee extends User{
      private double salary;

    public Employee(Long id, String name, String surname, String email, String password, double salary) {
        super(id, name, surname, email, password);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " | Employee";
    }
}
