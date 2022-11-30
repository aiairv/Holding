public abstract class Regisseur extends Employee {
    String[] animationProducts = new String[2];

    public Regisseur(String[] animationProducts) {
        this.animationProducts = animationProducts;
    }

    public Regisseur(String name, int salary, String position, String[] animationProducts) {
        super(name, salary, position);
        this.animationProducts = animationProducts;
    }

    public String[] getAnimationProducts() {
        return animationProducts;
    }

    public void setAnimationProducts(String[] animationProducts) {
        this.animationProducts = animationProducts;
    }
}
