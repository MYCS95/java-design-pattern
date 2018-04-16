/**
 * Implémentation du design pattern singleton
 * Implémentation avec l'approche du lazy initialization
 */
final class President {
    private static President president;

    private President() {
        // Cacher le constructeur
    }

    public static President getPresident() {
        if(president == null)
            president = new President();
        return president;
    }
}