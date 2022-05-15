package sectionone.builder.baddesign;

public class Serum {
    private final int water; // req.
    private final int sodiumIon; // req.
    private final int mag; // opt.
    private final int creatine; // opt.
    private final int globulin; // opt.
    private final int carbohydrate; // opt.


    public Serum(int water, int sodiumIon) {
        this(water, sodiumIon, 0);
    }

    public Serum(int water, int sodiumIon, int mag) {
        this(water, sodiumIon, mag, 0);
    }

    public Serum(int water, int sodiumIon, int mag, int creatine) {
        this(water, sodiumIon, mag, creatine, 0);
    }

    public Serum(int water, int sodiumIon, int mag, int creatine, int globulin) {
        this(water, sodiumIon, mag, creatine, globulin, 0);
    }

    public Serum(int water, int sodiumIon, int mag, int creatine, int globulin, int carbohydrate) {
        this.water = water;
        this.sodiumIon = sodiumIon;
        this.mag = mag;
        this.creatine = creatine;
        this.globulin = globulin;
        this.carbohydrate = carbohydrate;
    }

    @Override
    public String toString() {
        return "Serum{" +
                "water=" + water +
                ", sodiumIon=" + sodiumIon +
                ", mag=" + mag +
                ", creatine=" + creatine +
                ", globulin=" + globulin +
                ", carbohydrate=" + carbohydrate +
                '}';
    }

    public static void main(String[] args) {
        // Readability not good, setters can be used but final modifiers lose(!!!)
        Serum serum = new Serum(240, 8, 100, 0, 35, 27);
        System.out.println(serum);
    }
}
