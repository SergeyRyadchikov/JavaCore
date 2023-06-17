
public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Denis", "Novikov", "manager", 32, 500, 89521092535L);
        Employee employee2 = new Employee("Tom", "Djerev", "desintegrator pilyi", 30, 1500, 8953425435L);
        Employee employee3 = new Boss("Nick", "Kikov", "Boss", 31, 4000, 89521241535L);

        Employee[] employees = new Employee[] { employee1, employee2, employee3 };

        for (Employee employee : employees) {
            System.out.println(employee);
        }

                System.out.println();
        new AgeComparator().comparison(employee2, employee3);
        System.out.println();
        new SalaryComparator().comparison(employee1, employee3);

        System.out.println();

        Boss.salaryUp(employees);

        System.out.println();

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println();
        new AgeComparator().comparison(employee2, employee3);
        System.out.println();
        new SalaryComparator().comparison(employee1, employee3);

    }
}
