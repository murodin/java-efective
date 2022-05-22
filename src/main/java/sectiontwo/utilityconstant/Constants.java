package sectiontwo.utilityconstant;

public enum Constants {
    // Avogadro's number (1/mol)
    AVOGADROS_NUMBER(6.02214199e23),

    // Boltzmann constant (J/K)
   BOLTZMANN_CONSTANT(1.3806503e-23),

    // Mass of the electron (kg)
   ELECTRON_MASS(9.10938188e-31);

    final double value;

    Constants(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public static void main(String[] args) {
        System.out.println(Constants.AVOGADROS_NUMBER.getValue());
    }
}
