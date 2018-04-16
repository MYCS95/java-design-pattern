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

class Test {
    public static void main(String[] args) {
        President president1 = President.getPresident();
        President president2 = President.getPresident();
        System.out.println(president1.hashCode());
        System.out.println(president2.hashCode());
    }
}