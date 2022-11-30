import java.util.Scanner;

public class EmployeeMenu {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            Holding holding = new Holding();

            Employee employee1 = new Employee("Joice Byers", 50000, "FinanceDirector");
            Employee employee2 = new Employee("Jim Hooper", 32000, "SalesManager");
            Employee employee3 = new Employee("Mike Wheeler", 25000, "SalesSupervisor" );
            Employee employee4 = new Employee("Dustin Henderson", 15000, "SalesSpecialist");
            Employee employee5 = new Employee("Lucas Sinclair", 15000, "SalesSpecialist");
            Employee employee6 = new Employee("Filiph Tikhonov", 30000, "FinanceDirector");
            Employee employee7 = new Employee("Erik Vasilev", 25000, "ProjectManager");
            Employee employee8 = new Employee("Vladimir Filatov", 20000, "ProjectManager");
            Employee employee9 = new Employee("Griffin Lewis", 28000, "FinanceDirector");
            Employee employee10 = new Employee("Thomas McDowel", 30000, "ProjectManager");
            Employee employee11 = new Employee("Ruth Banks", 15000, "Supervisor");
            Employee employee12 = new Employee("Aylin Hill", 35000, "FinanceDirector");
            Employee employee13 = new Employee("Wendy Stewart", 35000, "ProjectManager");

            holding.addEmployee(employee1);
            holding.addEmployee(employee2);
            holding.addEmployee(employee3);
            holding.addEmployee(employee4);
            holding.addEmployee(employee5);
            holding.addEmployee(employee6);
            holding.addEmployee(employee7);
            holding.addEmployee(employee8);
            holding.addEmployee(employee9);
            holding.addEmployee(employee10);
            holding.addEmployee(employee11);
            holding.addEmployee(employee12);
            holding.addEmployee(employee13);

        while (true) {
                System.out.println("1) Вывод информации о сотруднике");
                System.out.println("0) Выход из главного меню");
                int command = in.nextInt();
                if (command == 1) {
                    System.out.println("______________________________________");
                    //Реализуйте вывод информации о сотруднике
                    holding.getEmployeeByName();
                    break;
                } else if (command == 0) {
                    break;
                } else {
                    System.out.println("Ошибка! Введите пункт из меню");
                }
            }
        }
    }
