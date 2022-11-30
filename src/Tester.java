public abstract class Tester extends Employee{
    String typeOfTest;

    public Tester(String typeOfTest) {
        this.typeOfTest = typeOfTest;
    }

    public Tester(String name, int salary, String position, String typeOfTest) {
        super(name, salary, position);
        this.typeOfTest = typeOfTest;
    }
}
