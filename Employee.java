public abstract class Employee extends User{
      private double salary;
      private AcademicTitle academicTitle;

    public Employee(Long id, String name, String surname, String email, String password, double salary, AcademicTitle academicTitle) {
        super(id, name, surname, email, password);
        this.salary = salary;
        this.academicTitle=academicTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }
    public AcademicTitle getAcademicTitle() {
        return academicTitle;
    }

    public void setAcademicTitle(AcademicTitle academicTitle) {
        this.academicTitle = academicTitle;
    }

    @Override
    public String toString() {
        return super.toString() + " | Employee";
    }
}
