public class Main {

    private static Employee[] repositoryOfEmployee = new Employee[10];

    public static void printSeparator() {
        System.out.println("---------------------------------------------");
    }

    public static void printEmlpoyees() {
        for (int i = 0; i < repositoryOfEmployee.length; i++) {
            System.out.println(repositoryOfEmployee[i]);
            printSeparator();
        }

    }


    public static int sumOnMonth() {
        int sum = 0;
        for (int i = 0; i < repositoryOfEmployee.length; i++) {
            sum = repositoryOfEmployee[i].getSalary() + sum;
        }
        return sum;
    }

    public static void minSalary() {
        int minSum = 2000000000;
        for (int i = 0; i < repositoryOfEmployee.length; i++) {
            if (repositoryOfEmployee[i].getSalary() < minSum) {
                minSum = repositoryOfEmployee[i].getSalary();
            }
        }
        for (int i = 0; i < repositoryOfEmployee.length; i++) {
            if (minSum == repositoryOfEmployee[i].getSalary()) {
                System.out.println("Сотрудник с минимальной зарплатой - " + repositoryOfEmployee[i].getFirstName() + " " + repositoryOfEmployee[i].getMiddleName() + " " + repositoryOfEmployee[i].getLastName());
            }
        }
    }

    public static void maxSalary() {
        int maxSum = -1;
        for (int i = 0; i < repositoryOfEmployee.length; i++) {
            if (repositoryOfEmployee[i].getSalary() > maxSum) {
                maxSum = repositoryOfEmployee[i].getSalary();
            }
        }
        for (int i = 0; i < repositoryOfEmployee.length; i++) {
            if (maxSum == repositoryOfEmployee[i].getSalary()) {
                System.out.println("Сотрудник с максимальной зарплатой - " + repositoryOfEmployee[i].getFirstName() + " " + repositoryOfEmployee[i].getMiddleName() + " " + repositoryOfEmployee[i].getLastName());
            }
        }
    }

    public static int averageSalary() {
        return sumOnMonth() / repositoryOfEmployee.length;
    }

    public static void printNamesEmpployees() {
        for (int i = 0; i < repositoryOfEmployee.length; i++) {
            System.out.println("Ф.И.О сотрудника - " + repositoryOfEmployee[i].getFirstName() + " " + repositoryOfEmployee[i].getMiddleName() + " " + repositoryOfEmployee[i].getLastName());
        }
    }

    static void indexSalary(double percent) {

        for (int i = 0; i < repositoryOfEmployee.length; i++) {
            double newSalary = repositoryOfEmployee[i].getSalary() * percent;
            repositoryOfEmployee[i].setSalary((int) newSalary);
        }
    }

    public static void minSalaryInDepartment(int department) {
        int minSum = 2000000000;
        for (int i = 0; i < repositoryOfEmployee.length; i++) {
            if (repositoryOfEmployee[i].getSalary() < minSum && repositoryOfEmployee[i].getDepartment() == department) {
                minSum = repositoryOfEmployee[i].getSalary();
            }
        }
        for (int i = 0; i < repositoryOfEmployee.length; i++) {
            if (minSum == repositoryOfEmployee[i].getSalary() && repositoryOfEmployee[i].getDepartment() == department) {
                System.out.println("Сотрудник с минимальной зарплатой в отделе " + repositoryOfEmployee[i].getDepartment() + " " + repositoryOfEmployee[i].getFirstName() + " " + repositoryOfEmployee[i].getMiddleName() + " " + repositoryOfEmployee[i].getLastName());
            }
        }
    }

    public static void maxSalaryInDepartment(int department) {
        int maxSum = -1;
        for (int i = 0; i < repositoryOfEmployee.length; i++) {
            if (repositoryOfEmployee[i].getSalary() > maxSum && repositoryOfEmployee[i].getDepartment() == department) {
                maxSum = repositoryOfEmployee[i].getSalary();
            }
        }
        for (int i = 0; i < repositoryOfEmployee.length; i++) {
            if (maxSum == repositoryOfEmployee[i].getSalary() && repositoryOfEmployee[i].getDepartment() == department) {
                System.out.println("Сотрудник с максимальной зарплатой в отделе " + repositoryOfEmployee[i].getDepartment() + " " + repositoryOfEmployee[i].getFirstName() + " " + repositoryOfEmployee[i].getMiddleName() + " " + repositoryOfEmployee[i].getLastName());
            }
        }
    }

    public static int sumInDepartment(int department) {
        int sum = 0;
        for (int i = 0; i < repositoryOfEmployee.length; i++) {
            if (repositoryOfEmployee[i].getDepartment() == department) {
                sum = repositoryOfEmployee[i].getSalary() + sum;
            }
        }
        return sum;
    }

    public static int averageInDepartment(int department) {
        int length = 0;
        int sum = 0;
        for (int i = 0; i < repositoryOfEmployee.length; i++) {
            if (repositoryOfEmployee[i].getDepartment() == department) {
                sum = repositoryOfEmployee[i].getSalary() + sum;
                length++;
            }
        }
        return sum / length;
    }

    public static void printNamesEmployeesInDepartment(int department) {
        for (int i = 0; i < repositoryOfEmployee.length; i++) {
            if (repositoryOfEmployee[i].getDepartment() == department) {
                System.out.println("Ф.И.О сотрудника - " + repositoryOfEmployee[i].getFirstName() + " " + repositoryOfEmployee[i].getMiddleName() + " " + repositoryOfEmployee[i].getLastName() + "\n"+
                "Id - " + repositoryOfEmployee[i].getId() + "\n" + "Зарплата - " + repositoryOfEmployee[i].getSalary());
            }
        }
    }

    public static void printSalaryLittle(int number) {
        for (int i = 0; i < repositoryOfEmployee.length; i++) {
            if (repositoryOfEmployee[i].getSalary() < number) {
                System.out.println("Id - " + repositoryOfEmployee[i].getId() + "\n" + "Ф.И.О - " + repositoryOfEmployee[i].getFirstName() + " " +
                        repositoryOfEmployee[i].getMiddleName() + " " + repositoryOfEmployee[i].getLastName() + "\n" + "Зарплата - " + repositoryOfEmployee[i].getSalary());
            }
        }
    }

    public static void printSalaryMore(int number) {
        for (int i = 0; i < repositoryOfEmployee.length; i++) {
            if (repositoryOfEmployee[i].getSalary() >= number) {
                System.out.println("Id - " + repositoryOfEmployee[i].getId() + "\n" + "Ф.И.О - " + repositoryOfEmployee[i].getFirstName() + " " +
                        repositoryOfEmployee[i].getMiddleName() + " " + repositoryOfEmployee[i].getLastName() + "\n" + "Зарплата - " + repositoryOfEmployee[i].getSalary());
            }
        }
    }

    public static void main(String[] args) {
        repositoryOfEmployee[0] = new Employee("Иванов", "Геннадий", "Павлович", 1, 15000);
        repositoryOfEmployee[1] = new Employee("Петров", "Сергей", "Игоревич", 2, 9000);
        repositoryOfEmployee[2] = new Employee("Горелов", "Кирилл", "Сергеевич", 3, 18500);
        repositoryOfEmployee[3] = new Employee("Сидоров", "Иван", "Васильевич", 4, 13400);
        repositoryOfEmployee[4] = new Employee("Васильева", "Алла", "Антоновна", 5, 17300);
        repositoryOfEmployee[5] = new Employee("Антонова", "Валентина", "Георгиевна", 2, 12300);
        repositoryOfEmployee[6] = new Employee("Бойко", "Олег", "Петрович", 5, 27250);
        repositoryOfEmployee[7] = new Employee("Гудков", "Николай", "Иванович", 1, 14000);
        repositoryOfEmployee[8] = new Employee("Пожарова", "Ольга", "Андреевна", 3, 32000);
        repositoryOfEmployee[9] = new Employee("Сивцов", "Дмитрий", "Сергеевич", 4, 20000);
        printEmlpoyees();
        printSeparator();
        System.out.println("Сумма затрат зарплат за месяц - " + sumOnMonth());
        minSalary();
        maxSalary();
        System.out.println("Среднее значение зарплат - " + averageSalary());
        printNamesEmpployees();
        printSeparator();


        System.out.println("Повышенная сложность:");
        indexSalary(1.10);
        printEmlpoyees();
        minSalaryInDepartment(1);
        maxSalaryInDepartment(5);

        System.out.println("Сумма зарплат в отделе " + repositoryOfEmployee[0].getDepartment() + " - " + sumInDepartment(repositoryOfEmployee[0].getDepartment()));
        System.out.println("Среднее значение зарплат в отделе " + repositoryOfEmployee[2].getDepartment() + " - " + averageInDepartment(repositoryOfEmployee[2].getDepartment()));
        indexSalary(1.5);
        printSeparator();
        printNamesEmployeesInDepartment(1);
        printSeparator();
        printSalaryLittle(30000);
        printSalaryMore(20000);

    }
}