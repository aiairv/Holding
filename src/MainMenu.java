import java.sql.SQLOutput;
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Holding holding = new Holding();
        Company[] companies = new Company[10];
        Company company1 = new Company("XTechnology", 1000000, "Harry Potter");
        Company company2 = new Company("FormulaTechnology", 750000, "Jay Park");
        Company company3 = new Company("YEntertainment", 650000, "Nancy Smith");
        Company company4 = new Company("JoyEnt", 500000, "Joy Ret");


        Scanner in = new Scanner(System.in);
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
                System.out.println("....................");
                holding.calculateTotalBudget();
               //Реализуйте подсчет бюджета всех компаний в холдинге

            } else if (command == 4) {
                System.out.println("....................");
                //Реализуйте добавление компании в холдинг
                //P.S. метод уже есть нужно всего лишь заполнить информацию о компании
                holding.addCompany(new Company("JoyEnt", 500000, "Joy Ret"));
                holding.addCompany(company1);
                holding.addCompany(company2);
                holding.addCompany(company3);

            } else if (command == 5) {
                System.out.println("....................");
                //Реализуйте удаление компании из холдинга
                //P.S метода нет пишите сами в классе holding ;)
                holding.deleteCompany(company1);
            } else if (command == 6) {
                System.out.println("....................");
                holding.getCompanyByName();
                //Реализуйте поиск компании по имени
                //P.S. метод getCompanyByName() пустой нужно его заполнить
                Company foundCompany = holding.getCompanyByName();

            } else if (command == 0) {
                break;
            } else {
                System.out.println("Ошибка! Введите пункт из меню");
            }
        }
    }
}

