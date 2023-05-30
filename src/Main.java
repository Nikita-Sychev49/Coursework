public class Main {
    public static void PrintSeparator() {
        System.out.println("---------------------------------------------");
    }

    public static void PrintEmlpoyees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);

        }
    }

    public static int SumOnMonth(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = employees[i].getSalary() + sum;
        }
        return sum;
    }

    public static void MinSalary(Employee[] employees) {
        int minSum = 10000000;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSum) {
                minSum = employees[i].getSalary();
            }
        }
        for (int i = 0; i < employees.length; i++) {
            if (minSum == employees[i].getSalary()) {
                System.out.println("Сотрудник с минимальной зарплатой - " + employees[i].getFirstName() + " " + employees[i].getMiddleName() + " " + employees[i].getLastName());
            }
        }
    }

    public static void MaxSalary(Employee[] employees) {
        int maxSum = -1;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSum) {
                maxSum = employees[i].getSalary();
            }
        }
        for (int i = 0; i < employees.length; i++) {
            if (maxSum == employees[i].getSalary()) {
                System.out.println("Сотрудник с максимальной зарплатой - " + employees[i].getFirstName() + " " + employees[i].getMiddleName() + " " + employees[i].getLastName());
            }
        }
    }

    public static void main(String[] args) {
        Employee[] repositoryOfEmployee = new Employee[5];
        repositoryOfEmployee[0] = new Employee("Иванов", "Геннадий", "Павлович", 1, 15000);
        repositoryOfEmployee[1] = new Employee("Петров", "Сергей", "Игоревич", 2, 9000);
        repositoryOfEmployee[2] = new Employee("Горелов", "Кирилл", "Сергеевич", 3, 18500);
        repositoryOfEmployee[3] = new Employee("Сидоров", "Иван", "Васильевич", 4, 13400);
        repositoryOfEmployee[4] = new Employee("Васильева", "Алла", "Антоновна", 5, 17300);
        PrintEmlpoyees(repositoryOfEmployee);
        System.out.println("Сумма затрат зарплаты на месяц " + SumOnMonth(repositoryOfEmployee));
        MinSalary(repositoryOfEmployee);
        MaxSalary(repositoryOfEmployee);

    }
}