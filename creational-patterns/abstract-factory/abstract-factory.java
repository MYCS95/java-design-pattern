/**
 * Implémentation du design pattern abstract-factory
 */

/**
 * Une porte générique
 */
interface Porte {
    public void getDescription();
}

/**
 * Une porte en bois
 */
class PorteBois implements Porte {
    public void getDescription() {
        System.out.println("Je suis une porte en bois !");
    }
}

/**
 * Une porte en métal
 */
class PorteMetal implements Porte {
    public void getDescription() {
        System.out.println("Je suis une porte en métal !");
    }
}

/**
 * Un expert en fabrication de porte
 */
interface ExpertFabriquePorte {
    public void getDescription();
}

/**
 * Un expert en fabircation de porte en métal
 */
class Soudeur implements ExpertFabriquePorte {
    public void getDescription() {
        System.out.println("Je fabrique uniquement des portes en métal !");
    }
}

/**
 * Un expert en fabrication de porte en bois
 */
class Charpentier implements ExpertFabriquePorte {
    public void getDescription() {
        System.out.println("Je fabrique uniquement des portes en bois !");
    }
}

/**
 * Usine de fabrication de portes et d'experts
 */
interface PorteFactory {
    public Porte fabriquePorte();
    public ExpertFabriquePorte fabriqueExpertFabriquePorte();
}

/**
 * Usine de fabrication des portes en bois peut produire une porte en bois et un charpentier
 */
class PorteBoisFactory implements PorteFactory {
    public Porte fabriquePorte() {
        return new PorteBois();
    }

    public ExpertFabriquePorte fabriqueExpertFabriquePorte() {
        return new Charpentier();
    }
}

/**
 * Usine de fabrication de portes en métal et un soudeur
 */
class PorteMetalFactory {
    public Porte fabriquePorte() {
        return new PorteMetal();
    }

    public ExpertFabriquePorte fabriqueExpertFabriquePorte() {
        return new Soudeur();
    }
}

class Test {
    public static void main(String[] args) {
        PorteBoisFactory porteBoisFactory = new PorteBoisFactory();
        Porte porteBois = porteBoisFactory.fabriquePorte();
        ExpertFabriquePorte charpentier = porteBoisFactory.fabriqueExpertFabriquePorte();

        charpentier.getDescription();
        porteBois.getDescription();

        PorteMetalFactory porteMetalFactory = new PorteMetalFactory();
        Porte porteMetal = porteMetalFactory.fabriquePorte();
        ExpertFabriquePorte soudeur = porteMetalFactory.fabriqueExpertFabriquePorte();

        porteMetal.getDescription();
        soudeur.getDescription();
    }
}