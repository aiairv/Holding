import java.awt.*;
import java.util.Scanner;

public class CompanyMenu {
    public static void main(String[] args) {

        Holding holding = new Holding();

        Company company1 = new Company("XTechnology", 1000000, "Harry Potter");
        Company company2 = new Company("FormulaTechnology", 750000, "Jay Park");
        Company company3 = new Company("YEntertainment", 650000, "Nancy Smith");
        Company company4 = new Company("JoyEnt", 500000, "Joy Ret");
        Company company5 = new Company("Netflix", 500000, "Eleven");

        holding.addCompany(company1);
        holding.addCompany(company2);
        holding.addCompany(company3);

        Employee employee1 = new Employee("Joice Byers", 50000, "FinanceDirector");
        Employee employee2 = new Employee("Jim Hooper", 32000, "SalesManager");
        Employee employee3 = new Employee("Mike Wheeler", 25000, "SalesSupervisor" );
        Employee employee4 = new Employee("Dustin Henderson", 15000, "SalesSpecialist");
        Employee employee5 = new Employee("Lucas Sinclair", 15000, "SalesSpecialist");
        company1.addEmployee(employee1);
        company1.addEmployee(employee2);
        company1.addEmployee(employee3);


        Employee employee6 = new Employee("Filiph Tikhonov", 30000, "FinanceDirector");
        Employee employee7 = new Employee("Erik Vasilev", 25000, "ProjectManager");
        Employee employee8 = new Employee("Vladimir Filatov", 20000, "ProjectManager");
        company2.addEmployee(employee6);
        company2.addEmployee(employee7);


        Employee employee9 = new Employee("Griffin Lewis", 28000, "FinanceDirector");
        Employee employee10 = new Employee("Thomas McDowel", 30000, "ProjectManager");
        Employee employee11 = new Employee("Ruth Banks", 15000, "Supervisor");


        Employee employee12 = new Employee("Aylin Hill", 35000, "FinanceDirector");
        Employee employee13 = new Employee("Wendy Stewart", 35000, "ProjectManager");


        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Меню для работы с компанией: ");
            System.out.println("1) Вывод информацию о компании");
            System.out.println("2) Вывод списока сотрудников компании");
            System.out.println("3) Вывод общих расходов на зарплаты сотрудников");
            System.out.println("4) Добавление сотрудника в компанию");
            System.out.println("5) Удаление сотрудника из компании");
            System.out.println("5) Поменять руководителя компании");
            System.out.println("6) Меню для работы с сотрудниками");
            System.out.println("0) Выход из главного меню");
            int command = in.nextInt();
            if (command == 1) {
//                MainMenu.main(holding.getCompanyByName());
                holding.getCompanyByName();
//                Реализуйте вывод информации об этой компании (кроме списка сотрудников)
            } else if (command == 2) {
                company1.showEmployees();
                //Реализуйте вывод списка сотрудников этой компании
            } else if (command == 3) {
                company1.calculateTotalSalaryExpenses();
//                //Реализуйте подсчет всех зароботных плат сотрудников
            } else if (command == 4) {
                //Реализуйте добавление компании в холдинг
                System.out.println("....................");
                company1.addEmployee(employee4);
                company1.addEmployee(employee5);
                company2.addEmployee(employee8);
                company3.addEmployee(employee9);
                company3.addEmployee(employee10);
                company3.addEmployee(employee11);
                company4.addEmployee(employee12);
                company4.addEmployee(employee13);

            } else if (command == 5) {
                System.out.println("....................");
                //Реализуйте удаление сотрудника из компании
                company1.deleteEmployee(employee1);
            } else if (command == 6) {
                //Реализуйте смену руководителя компании
            } else if (command == 7) {
                String employeeName = in.nextLine();
                company1.getEmployeeByName();
//                //Реализуйте поиск сотрудника по имени
//                //P.S. метод getEmployeeByName() пустой нужно его заполнить
//                Employee foundedEmployee = Company.getEmployeeByName(employeeName);
//                EmployeeMenu.main(foundedEmployee);
            } else if (command == 0) {
                break;
            } else {
                System.out.println("Ошибка! Введите пункт из меню");
            }

        }
    }
}


