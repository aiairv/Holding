public abstract class ITcompany extends Company{
    private int outsourcingIncome;
    private int outstaffingIncome;
    private int technologyExpenses;
    private int officeExpenses;
    private int salaryExpenses;


    public ITcompany(String name, int budget, String generalDirector, int outsourcingIncome, int outstaffingIncome, int technologyExpenses, int officeExpenses, int salaryExpenses) {
        super(name, budget, generalDirector);
        this.outsourcingIncome = outsourcingIncome;
        this.outstaffingIncome = outstaffingIncome;
        this.technologyExpenses = technologyExpenses;
        this.officeExpenses = officeExpenses;
        this.salaryExpenses = salaryExpenses;
    }

    public int getOutsourcingIncome() {
        return outsourcingIncome;
    }

    public void setOutsourcingIncome(int outsourcingIncome) {
        this.outsourcingIncome = outsourcingIncome;
    }

    public int getOutstaffingIncome() {
        return outstaffingIncome;
    }

    public void setOutstaffingIncome(int outstaffingIncome) {
        this.outstaffingIncome = outstaffingIncome;
    }

    public int getTechnologyExpenses() {
        return technologyExpenses;
    }

    public void setTechnologyExpenses(int technologyExpenses) {
        this.technologyExpenses = technologyExpenses;
    }

    public int getOfficeExpenses() {
        return officeExpenses;
    }

    public void setOfficeExpenses(int officeExpenses) {
        this.officeExpenses = officeExpenses;
    }

    public int getSalaryExpenses() {
        return salaryExpenses;
    }

    public void setSalaryExpenses(int salaryExpenses) {
        this.salaryExpenses = salaryExpenses;
    }

}
