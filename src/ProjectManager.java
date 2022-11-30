public abstract class ProjectManager extends Employee {
String[] projects = new String[3];

    public ProjectManager(String name, int salary, String position) {
        super(name, salary, position);
    }

    public String[] getProjects() {
        return projects;
    }

    public void setProjects(String[] projects) {
        this.projects = projects;
    }
}
