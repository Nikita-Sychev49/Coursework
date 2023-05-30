public class Employee {
    private String firstName;
    private String middleName;
    private String lastName;
    private int department;
    private int salary;
    private int id;

    public Employee(String firstName, String middleName, String lastName, int department, int salary) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return this.id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Ф.И.О сотрудника - " + firstName + " " + middleName + " " + lastName + "\n" + "Отдел - " + department + "\n" +
                "Заработная плата - " + salary;
    }
}
