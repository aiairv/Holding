public abstract class ScreenWriter extends Employee {
    String[] genre = new String[3];

    public ScreenWriter(String[] genre) {
        this.genre = genre;
    }

    public ScreenWriter(String name, int salary, String position, String[] genre) {
        super(name, salary, position);
        this.genre = genre;
    }

    public String[] getGenre() {
        return genre;
    }

    public void setGenre(String[] genre) {
        this.genre = genre;
    }
}
