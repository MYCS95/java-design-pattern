/**
 * Implémentation du design pattern factory method
 */

/**
 * Un interviwer générique qui pose des questions
 */
interface Interviewer {
    void poserQuestions();
}

/**
 * Un développeur est un inteviewer qui pose des questions sur le développement
 */
class Developpeur implements Interviewer {
    public void poserQuestions() {
        System.out.println("Poser des questions sur le développement");
    }
}

/**
 * Un comptable est un interviewer qui pose des questions sur la comptabilité
 */
class Comptable implements Interviewer {
    public void poserQuestions() {
        System.out.println("Poser des questions sur la comptabilité");
    }
}

/**
 * Pour embaucher un directeur, il faut un interviewer pour faire l'entretien, mais on ne sait pas quel type d'interviwer
 */
abstract class EmbaucherDirecteur {
    // Factory method
    abstract protected Interviewer fabriqueInterviewer();

    public void entretenir() {
        Interviewer interviewer = this.fabriqueInterviewer();
        interviewer.poserQuestions();
    }
}

/**
 * Embaucher un directeur pour le développement, on crée un interviewer pour poser des questions
 */
class DirecteurDeveloppement extends EmbaucherDirecteur {
    protected Interviewer fabriqueInterviewer() {
        return new Developpeur();
    }
}

/**
 * Embaucher un directeur pour la comptébilité, on crée un interviwer pour poser des questions
 */
class DirecteurComptabilite extends EmbaucherDirecteur {
    protected Interviewer fabriqueInterviewer() {
        return new Comptable();
    }
}

class Test {
    public static void main(String[] args) {
        DirecteurDeveloppement directeurDeveloppement = new DirecteurDeveloppement();
        directeurDeveloppement.entretenir();

        DirecteurComptabilite directeurComptabilite = new DirecteurComptabilite();
        directeurComptabilite.entretenir();
    }
}