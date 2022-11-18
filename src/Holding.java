import java.util.Scanner;

public class Holding {
    private Company[] companies;

    public Holding() {
        companies = new Company[2];
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

    public boolean addCompany(Company company) {
        for (int i = 0; i < companies.length; i++) {
            if (companies[i] == null) {
                companies[i] = company;
                return true;
            }
        }
        return false;
    }

    public boolean deleteCompany(Company company) {
        for (int i = 0; i < companies.length; i++) {
            if (companies[i] == company) {
                companies[i] = null;
                return false;
            }
        }
        return true;
}
    public void showCompanies () {
        Company[] companies = this.companies;
        System.out.println("Список компаний:");
        for (Company company : companies) {
            if (company != null) {
                System.out.println(company.getName() + " | " +  company.getBudget() + " | " + company.getGeneralDirector());
            }
        }
    }
    //Реализуйте поиск компании по наименованию

    public void calculateTotalBudget() {
            Company[] companies = this.companies;
            double count = 0;
            for (int i = 0; i < companies.length; i++) {
                if (companies[i] != null)
                    count = count + companies[i].getBudget();
            }
            System.out.println("Бюджет Холдинга составляет: " + count + " $");
       } public Company getCompanyByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название компании для поиска:");
        String companyName = scanner.nextLine();
        for (int i = 0; i < companies.length; i++) {
            if (companies[i] != null) {
                if (companies[i].equals(companyName)) {
                    System.out.println("Информация о компании: ");
                    System.out.println(companies[i].getName() + " | " +  companies[i].getBudget() + " | " + companies[i].getGeneralDirector());
                }

            }

        }
        return null;
    }
}


