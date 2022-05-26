package sectionthree.generics;


import java.util.ArrayList;
import java.util.List;


class Arac extends Object{}
class Araba extends Arac {}
class SporAraba extends Araba {}
class AileArabasi extends Araba {}


public class TypeShowCase {

    List<? extends Arac> aracListesi;
    List<? super Araba> arabaListesi;

    {

        aracListesi = new ArrayList<Araba>(); // Evet
        aracListesi = new ArrayList<SporAraba>(); // Evet
        aracListesi = new ArrayList<AileArabasi>(); // Evet


        arabaListesi = new ArrayList<Arac>(); // Evet
        //arabaListesi = new ArrayList<AileArabasi>(); // Hayır

        //someMethod(aracListesi);

    }

    public void someMethod(List<? extends Araba> lb) {
        Araba araba = lb.get(0); // Evet
       // lb.add(new Araba()); // Hayır
    }

    public void otherMethod(List<? super Araba> lb) {
        //Araba araba = lb.get(0);  // Hayır
        lb.add(new Araba()); // Evet
    }

}

