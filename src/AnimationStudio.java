public abstract class AnimationStudio extends Company {
    int youtubeIncome;
    private int technologyExpenses;
    private int officeExpenses;
    private int salaryExpenses;

    public AnimationStudio(int youtubeIncome, int technologyExpenses, int officeExpenses, int salaryExpenses) {
        this.youtubeIncome = youtubeIncome;
        this.technologyExpenses = technologyExpenses;
        this.officeExpenses = officeExpenses;
        this.salaryExpenses = salaryExpenses;
    }

    public AnimationStudio(String name, int budget, String generalDirector, int youtubeIncome, int technologyExpenses, int officeExpenses, int salaryExpenses) {
        super(name, budget, generalDirector);
        this.youtubeIncome = youtubeIncome;
        this.technologyExpenses = technologyExpenses;
        this.officeExpenses = officeExpenses;
        this.salaryExpenses = salaryExpenses;
    }

    public int getYoutubeIncome() {
        return youtubeIncome;
    }

    public void setYoutubeIncome(int youtubeIncome) {
        this.youtubeIncome = youtubeIncome;
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
