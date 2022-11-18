import java.util.Scanner;

public class EmployeeMenu {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Company company1 = new Company("Netflix", 500000, "Eleven");

            Employee[] employees = new Employee[30];
            Employee employee1  = new Employee("Joice Byers", 50000, "FinanceDirector");
            Employee employee2  = new Employee("Jim Hooper", 32000, "SalesManager");
            Employee employee3  = new Employee("Mike Wheeler", 25000, "SalesSupervisor" );
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



        while (true) {
                System.out.println("1) Вывод информации о сотруднике");
                System.out.println("0) Выход из главного меню");
                int command = in.nextInt();
                if (command == 1) {
                    System.out.println("______________________________________");

                    company1.getEmployeeByName();
                        //Реализуйте вывод информации о сотруднике

                    break;
                } else if (command == 0) {
                    break;
                } else {
                    System.out.println("Ошибка! Введите пункт из меню");
                }
            }
        }
    }
