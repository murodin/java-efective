package sectionfive;

public enum Bordro {

    PAZARTESİ(OdemeTipi.HAFTA_ICI), SALI(OdemeTipi.HAFTA_ICI), ÇARŞAMBA(OdemeTipi.HAFTA_ICI),
    PERŞEMBE(OdemeTipi.HAFTA_ICI), CUMA(OdemeTipi.HAFTA_ICI), CUMARTESİ(OdemeTipi.HAFTA_SONU),
    PAZAR(OdemeTipi.HAFTA_SONU);

    private final OdemeTipi odemeTipi;

    Bordro(OdemeTipi odemeTipi) {
        this.odemeTipi = odemeTipi;
    }

    double tutarHesapla(double calistigiSaat, double oran) { return odemeTipi.odemeYap(calistigiSaat, oran);}

    // Strategy enum type
    private enum OdemeTipi {
        HAFTA_ICI {
            double tutarHesapla(double saat, double oran) { return saat * oran * 2 ;}
        },
        HAFTA_SONU {
            double tutarHesapla(double saat, double oran) { return saat * oran / 2 ;}
        };

        abstract double tutarHesapla(double saat, double oran);

        double odemeYap(double calistigiSaat, double oran) {
            double bazTutar = calistigiSaat * oran ;
            return bazTutar + tutarHesapla(calistigiSaat, oran);
        }
    }

    public static void main(String[] args) {
        double fazlaMesaiUcreti = Bordro.SALI.tutarHesapla(4, 100);
        System.out.println(fazlaMesaiUcreti);
    }
}
