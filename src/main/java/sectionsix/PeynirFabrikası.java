package sectionsix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PeynirFabrikası {
    private final static List<Peynir> stok = new ArrayList<>();

    static {
        stok.add(Peynir.EZINE);
    }

    public static List<Peynir> getir() {
        // Ignored the null return
        if(stok.isEmpty()) return Collections.emptyList();
        return stok;
    }

    public static void main(String[] args) {
        List<Peynir> peynirs = PeynirFabrikası.getir();
        if(peynirs.contains(Peynir.EZINE))
            System.out.println("Peynir Budur!");
    }
}
