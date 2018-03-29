/**
 * Implémentation du design pattern singleton, avec le lazy loading
 */
final class President {
    private static President instance;

    private President() {
        // Cacher le constructeur
    }

    public static President getInstance() {
        if(!this.instance) {
            this.instance = instance;
        }
    }
}