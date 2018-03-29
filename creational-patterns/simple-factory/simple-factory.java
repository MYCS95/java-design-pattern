/**
 * Implémentation du design pattern simple-factory*/

 /**
  * Une porte générique
  */
interface Porte {
    float getHauteur();
    float getLargeur();
}

/**
 * Une porte en bois
 */
class PorteBois implements Porte {
    protected float hauteur;
    protected float largeur;

    PorteBois(float hauteur, float largeur) {
        this.hauteur = hauteur;
        this.largeur = largeur;
    }

    public float getHauteur() {
        return this.hauteur;
    }

    public float getLargeur() {
        return this.largeur;
    }
}

/**
 * Usine de fabrication de porte en bois
 */
class PorteFactory {
    public static Porte fabriquePorte(float hauteur, float largeur) {
        return new PorteBois(hauteur, largeur);
    }
}

class Test {
    public static void main(String[] args) {
        Porte p = PorteFactory.fabriquePorte(100, 200);
        System.out.println("Hauteur porte : " + p.getHauteur());
        System.out.println("Largeur porte : " + p.getLargeur());
    }
}