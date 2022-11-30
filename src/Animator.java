public abstract class Animator extends Employee {
    String[] skills = new String[3];

    public Animator(String[] skills) {
        this.skills = skills;
    }

    public Animator(String name, int salary, String position, String[] skills) {
        super(name, salary, position);
        this.skills = skills;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }
}
