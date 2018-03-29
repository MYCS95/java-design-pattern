/**
 * Implémentation du pattern Builder
 */

/**
 * Un burger avec différentes options : taille, fromage, pepperoni, salade, tomate
 */
class Burger {
    protected int taille;

    protected boolean fromage = false;
    protected boolean pepperoni = false;
    protected boolean salade = false;
    protected boolean tomate = false;

    public Burger(BurgerBuilder builder) {
        this.taille = builder.taille;
        this.fromage = builder.fromage;
        this.salade = builder.salade;
        this.pepperoni = builder.pepperoni;
        this.salade = builder.salade;
    }
}

class BurgerBuilder {
    public int taille;

    public boolean fromage = false;
    public boolean pepperoni = false;
    public boolean salade = false;
    public boolean tomate = false;

    public BurgerBuilder(int taille) {
        this.taille = taille;
    }

    public BurgerBuilder ajouterPepperoni() {
        this.pepperoni = true;
        return this;
    }

    public BurgerBuilder ajouterFromage() {
        this.fromage = true;
        return this;
    }

    public BurgerBuilder ajouterSalade() {
        this.salade = true;
        return this;
    }

    public BurgerBuilder ajouterTomate() {
        this.tomate = true;
        return this;
    }

    public Burger cuisiner() {
        return new Burger(this);
    }
}

class Test {
    public static void main(String[] args) {
        Burger burger = (new BurgerBuilder(14)).ajouterFromage()
                                            .ajouterPepperoni()
                                            .ajouterSalade()
                                            .ajouterSalade()
                                            .cuisiner();
    }
}

