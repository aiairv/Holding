public abstract class Developer extends Employee {
    String[] technologyStack = new String[3];
    String typeOfTechnologyStack;

    public Developer(String[] technologyStack, String typeOfTechnologyStack) {
        this.technologyStack = technologyStack;
        this.typeOfTechnologyStack = typeOfTechnologyStack;
    }

    public Developer(String name, int salary, String position, String[] technologyStack, String typeOfTechnologyStack) {
        super(name, salary, position);
        this.technologyStack = technologyStack;
        this.typeOfTechnologyStack = typeOfTechnologyStack;
    }

    public String[] getTechnologyStack() {
        return technologyStack;
    }

    public void setTechnologyStack(String[] technologyStack) {
        this.technologyStack = technologyStack;
    }

    public String getTypeOfTechnologyStack() {
        return typeOfTechnologyStack;
    }

    public void setTypeOfTechnologyStack(String typeOfTechnologyStack) {
        this.typeOfTechnologyStack = typeOfTechnologyStack;
    }
}
