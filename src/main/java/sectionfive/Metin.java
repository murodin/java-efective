package sectionfive;

import java.util.EnumSet;
import java.util.Set;

public class Metin {

    private enum Stiller {
        BOLD, ITALIC, UNDERLINE;
    }

    public void uygulaStil(Set<Stiller> stiller) {
    }

    public static void main(String[] args) {
        Metin metin = new Metin();
        metin.uygulaStil(EnumSet.of(Stiller.BOLD, Stiller.BOLD, Stiller.UNDERLINE));
    }
}
