package sectionsix;

class Soda {
    static String markaBuilder() {
        return "soda";
    }
}

class SparklingSoda extends Soda {
    //@Override -> Use for catching error and weird behaviours
    static String markaBuilder() {
        return "sparkling soda";
    }
}

class UludagGazoz extends Soda {
    static String markaBuilder() {
        return "Gazoz Olma Efsane Ol!";
    }
}
public class Overriding {
    public static void main(String[] args) {
        Soda[] sodas = {new Soda(), new SparklingSoda(), new UludagGazoz()};
        for (Soda soda:sodas)
            System.out.println(soda.markaBuilder());
    }
}
