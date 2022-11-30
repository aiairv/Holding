import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Holding holding = new Holding();

//        Company[] companies = new Company[10];
        Company company1 = new Company("XTechnology", 1000000, "Harry Potter");
        Company company2 = new Company("FormulaTechnology", 750000, "Jay Park");
        Company company3 = new Company("YEntertainment", 650000, "Nancy Smith");
        Company company4 = new Company("JoyEnt", 500000, "Joy Ret");
        Company company5 = new Company("Netflix", 500000, "Eleven");

//        Employee[] employees = new Employee[13];
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

        holding.addCompany(company1);
        holding.addCompany(company2);
        holding.addCompany(company3);

        company1.addEmployee(employee4);
        company1.addEmployee(employee5);
        company2.addEmployee(employee8);
        company3.addEmployee(employee9);
        company3.addEmployee(employee10);
        company3.addEmployee(employee11);
        company4.addEmployee(employee12);
        company4.addEmployee(employee13);


        while (true) {
            System.out.println("....................");
            System.out.println("Главное меню для работы с холдингом: ");
            System.out.println("1) Вывод списка компаний в холдинге");
            System.out.println("2) Вывод общего бюджета холдинга");
            System.out.println("3) Вывод списка компаний в холдинге с количеством рабочих мест и уже работающих сотрудников");
            System.out.println("4) Добавление компании в холдинг");
            System.out.println("5) Удаление компании из холдинга");
            System.out.println("6) Меню для работы с компанией");
            System.out.println("0) Выход из главного меню");
            int command = in.nextInt();

            if (command == 1) {
                System.out.println("....................");
                holding.showCompanies();

            } else if (command == 2) {
                //Реализуйте подсчет бюджета всех компаний в холдинге
                System.out.println("....................");
                holding.calculateTotalBudget();

            } else if (command == 3){
                System.out.println("....................");
                holding.showCompaniesWithWorkplace();


            } else if (command == 4) {
                System.out.println("....................");
                //Реализуйте добавление компании в холдинг
                //P.S. метод уже есть нужно всего лишь заполнить информацию о компании
                holding.addCompany(company4);
                holding.addCompany(company5);


            } else if (command == 5) {
                System.out.println("....................");
                //Реализуйте удаление компании из холдинга
                //P.S метода нет пишите сами в классе holding ;)
                holding.deleteCompany();


                //как переходить на другое меню?
            } else if (command == 6) {
                System.out.println("....................");
                holding.getCompanyByName();
                //Реализуйте поиск компании по имени
                //P.S. метод getCompanyByName() пустой нужно его заполнить
//                Company foundCompany = holding.getCompanyByName();
//                CompanyMenu.main(foundCompany);
            } else if (command == 0) {
                break;
            } else {
                System.out.println("Ошибка! Введите пункт из меню");
            }
        }
    }
}

