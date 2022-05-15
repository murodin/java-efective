package sectionone.builder.gooddesign;

public class Serum {
    private final int water; // req.
    private final int sodiumIon; // req.
    private final int mag; // opt.
    private final int creatine; // opt.
    private final int globulin; // opt.
    private final int carbohydrate; // opt.

    public static Builder builder(int water, int sodiumIon) {
        return new Builder(water, sodiumIon);
    }

    private static class Builder {
        private final int water; // req.
        private final int sodiumIon; // req.

        private int mag; // opt.
        private int creatine; // opt.
        private int globulin; // opt.
        private int carbohydrate; // opt.

        public Builder(int water, int sodiumIon) {
            this.water = water;
            this.sodiumIon = sodiumIon;
        }

        public Builder mag(int val) {
            this.mag = val;
            return this;
        }

        public Builder creatine(int val) {
            this.creatine = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            this.carbohydrate = val;
            return this;
        }

        public Serum build() {
            return new Serum(this);
        }
    }

    private Serum(Builder builder) {
        water = builder.water;
        sodiumIon = builder.sodiumIon;
        creatine = builder.creatine;
        mag = builder.mag;
        globulin = builder.globulin;
        carbohydrate = builder.carbohydrate;
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
        Serum serum = Serum.builder(240, 5)
                .carbohydrate(75)
                .mag(100)
                .creatine(35)
                .build();

        System.out.println(serum);
    }
}
