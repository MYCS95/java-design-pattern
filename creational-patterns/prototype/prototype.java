class Mouton implements Cloneable {
    protected String nom;
    protected String categorie;

    public Mouton(String nom, String categorie) {
        this.nom = nom;
        this.categorie = categorie;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getNom() {
        return this.nom;
    }

    public String getCategorie() {
        return this.categorie;
    }

    public Object clone() {
        Object o = null;
        try {
            // On récupère l'instance à renvoyer par l'appel de la méthode super.clone()
            o = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace(System.err);
        }
        // On renvoie le clone
        return o;
    }
}

class Test {
    public static void main(String[] args) {
        Mouton original = new Mouton("Jolly", "Mouton des montagnes");
        System.out.println(original.getNom());
        System.out.println(original.getCategorie());

        // Clone and modify what is required
        Mouton clone = (Mouton)original.clone();
        clone.setNom("Dolly");

        System.out.println(clone.getNom());
        System.out.println(clone.getCategorie());
    }
}