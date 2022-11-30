import java.util.Scanner;

public class Holding {
    private Company[] companies;
    private Employee[] employees;

    public Holding() {
        companies = new Company[10];
        employees = new Employee[20];
    }

    public Holding(Company[] companies) {
        this.companies = companies;
    }

    public Company[] getCompanies() {
        return companies;
    }

    public void setCompanies(Company[] companies) {
        this.companies = companies;
    }

    public Employee[] getEmployees() {
        return employees;
    }


     public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public boolean addCompany(Company company) {
        for (int i = 0; i < companies.length; i++) {
            if (companies[i] == null) {
                companies[i] = company;
                System.out.println(companies[i].getName() + " добавлен в Холдинг");
                return true;
            }
        }
        return false;
    }

    public boolean deleteCompany() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название компании, которую хотите удалить: ");
        String companyName = scanner.nextLine();
        for (int i = 0; i < companies.length; i++) {
            if (companies[i] != null && companies[i].getName().equals(companyName)) {
                System.out.println(companyName + " удален из Холдинга");
                companies[i] = null;
                return true;
            }
        }
        return false;
    }

    public void showCompanies() {
        Company[] companies = this.companies;
        System.out.println("Список компаний:");
        for (Company company : companies) {
            if (company != null) {
                System.out.println(company.getName() + " | " + company.getBudget() + " | "
                        + company.getGeneralDirector());
            }
        }
    }


    public void showCompaniesWithWorkplace() {
        Company[] companies = this.companies;
        Employee[] employees = this.employees;
        System.out.println("Список компаний:");
        for (Company company : companies) {

            int count = 0;
            for (int i = count; i < employees.length; i++) {
                if (employees[i] != null) {
                    count++ ;
                }
            }
                if (company != null && employees != null) {
                    System.out.println(company.getName() + " | " + "Количество рабочих мест: " + employees.length);
                }
            }
        }


    public void calculateTotalBudget() {
        Company[] companies = this.companies;
        double count = 0;
        for (int i = 0; i < companies.length; i++) {
            if (companies[i] != null)
                count = count + companies[i].getBudget();
        }
        System.out.println("Бюджет Холдинга составляет: " + count + " $");
    }

    //Метод для MainMenu
    public Company getCompanyByName() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название компании для поиска:");
        String companyName = in.nextLine();
        for (int i = 0; i < companies.length; i++) {
            if (companies[i] != null) {
                if (companies[i].getName().equals(companyName)) {
                    System.out.println("Информация о компании: ");
                    System.out.println(companies[i].getName() + " | " + companies[i].getBudget() +
                            " | " + companies[i].getGeneralDirector());
                }

            }

        }
        return null;
    }
    //Метод для EmployeeMenu
    public void addEmployee(Employee employee) {
        for (int i = 0; i < this.employees.length; i++) {
            if (this.employees[i] == null) {
                this.employees[i] = employee;
                return;
            }
        }
        System.out.println("К сожалению, вакантных мест в Холдинге нет");
    }
    //Метод для EmployeeMenu
    public Employee getEmployeeByName() {
        Employee[] employees = this.employees;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя сотрудника: ");
        String employeeName = in.nextLine();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getName().equals(employeeName)) {
                    System.out.println(employees[i].getName() + " | " +
                            employees[i].getSalary() + " | " + employees[i].getPosition());

                }
            }
        }
        return null;
    }
}

