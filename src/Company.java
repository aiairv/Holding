import java.util.Scanner;

public class Company {
    private String name;
    private int numberOfWorkPositions;
    private Employee[] employees = new Employee[20];
    //Нужно добавить:
    //Бюджет холдинга
    //Руководителя компании
    private int budget;
    private String generalDirector;

//    private String foundName = MainMenu.get;

    public Company() {
    }

    public Company(String name, int budget, String generalDirector) {
        this.name = name;
        this.budget = budget;
        this.generalDirector = generalDirector;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getGeneralDirector() {
        return generalDirector;
    }

    public void setGeneralDirector(String headOfTheCompany) {
        this.generalDirector = generalDirector;
    }
    public void showEmployees() {
        Employee[] employees = this.employees;
        System.out.println("Список сотрудников:");
        for (Employee employee : employees) {
            if (employees != null) {
                System.out.println(employee.getName() + " | " + employee.getSalary() + " | " + employee.getPosition());
            }
        }
    }


    public boolean addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }

    public boolean deleteEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == employee) {
                employees[i] = null;
                return false;
            }
        }
        return true;
    }

    public void replaceGeneralDirector(Employee replacedGeneralDirector) {
//        Company[] companies = this.companies;
        Employee[] employees = this.employees;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().equals(replacedGeneralDirector)) {
                employees[i] = replacedGeneralDirector;
            }
        }
    }


    public void calculateTotalSalaryExpenses() {

        Employee[] employee = this.employees;
        double count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null)
                count = count + employees[i].getSalary();
        }
        System.out.println("Расходы компании на заработную плату составляют: " + count + " $");
    }

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