/**
 * Implémentation du design pattern adapter
 */

interface Lion {
    public void rugir();
}

class LionAfricain implements Lion {
    public void rugir() {
        // Mettre quelque chose ici
    }
}

class LionAsiatique implements Lion {
    public void rugir() {
        // Mettre quelque chose ici
    }
}

class Chasseur {
    public void chasser(Lion lion) {
        // Mettre quelque chose ici
    }
}

// On veut que le chasseur puisse chasser des chien sauvage
class ChienSauvage {
    public void aboie () {
        // Mettre quelque chose ici
    }
}

// Implémentation de l'adapteur pour assurer la compatiilité
class ChienSauvageAdapter implements Lion {
    protected ChienSauvage chien;

    public ChienSauvageAdapter(ChienSauvage chien) {
        this.chien = chien;
    }

    public void rugir() {
        this.chien.aboie();
    }
}

class Test {
    public static void main(String[] args) {
        
        ChienSauvage chien = new ChienSauvage();
        ChienSauvageAdapter chienSauvageAdapter = new ChienSauvageAdapter(chien);

        Chasseur chasseur = new Chasseur();
        chasseur.chasser(chienSauvageAdapter);
    }
}