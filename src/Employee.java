public class Employee {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private int department;
    private int salary;
    private final int id;
    private static int idCounter = 0;

    public Employee(String firstName, String middleName, String lastName, int department, int salary) {
        if (department < 1 || department > 5) {
            throw new IllegalStateException("У нас отделы от 1 до 5!=)");
        }
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        this.id = ++idCounter;

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

        return id;
    }

    public void setDepartment(int department) {
        if (department < 1 || department > 5) {
            this.department = department;
        } else {
            throw new IllegalStateException("У нас отделы только от 1 до 5!=)");
        }
    }

    public void setSalary(int salary) {

        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Id - " + id + "\n" + "Ф.И.О сотрудника - " + firstName + " " + middleName + " " + lastName + "\n" + "Отдел - " + department + "\n" +
                "Заработная плата - " + salary;
    }

}
