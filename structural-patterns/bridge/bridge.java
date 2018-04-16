/**
 * Implémentation du design pattern Bridge (Pont)
 */

interface PageWeb {
    
    public String getTheme();
}

class APropos implements PageWeb {
    
    protected Theme theme;

    public APropos(Theme theme) {
        this.theme = theme;
    }

    public String getTheme() {
        
        return "Le theme de la page A Propos est " + this.theme.getCouleur();
    }
}

class Accueil implements PageWeb {
    
    protected Theme theme;

    public Accueil(Theme theme) {
        
        this.theme = theme;
    }

    public String getTheme() {
        
        return "La theme de la page Accueil est " + this.theme.getCouleur();
    }
}

// Implémentation des themes

interface Theme {
    public String getCouleur();
}

class ThemeSombre implements  Theme {
    
    public String getCouleur() {
        return "Noire Sombre";
    }
}

class ThemeClair {
    
    public String getCouleur() {
        return "Blanche";
    }
}

class ThemeAqua {
    
    public String getCouleur() {
        return "Bleue Ciel";
    }
}

class Test {
    
    public static void main(String[] args) {
        
        ThemeSombre themeSombre = new ThemeSombre();
        
        APropos aPropos = new APropos(themeSombre);
        Accueil accueil = new Accueil(themeSombre);

        System.out.println(aPropos.getTheme());
        System.out.println(accueil.getTheme());
    }
}