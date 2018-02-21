package cloud.krzysztofkin;

public class MierniczyUMS extends Mierniczy {
    float szerokosc;
    float trzyWalki = 0.4f;

    public MierniczyUMS(Stos stos) {
        super(stos);
        szerokosc = stos.getSzerokosc();
    }

    @Override
    public float getMiazszosc() {
        float odstep;
        float pozycja;
        float przesuniecie;
        float suma;
        float miazszosc;
        int ilosc;

        if (szerokosc < 6) {
            odstep = 1;
            przesuniecie = 0;
        } else {
            odstep = 1;
            przesuniecie = 0;
        }

        ilosc = 0;
        suma = 0;

        pozycja = trzyWalki;
        while (pozycja < (szerokosc - 0.001f)) {
            ilosc++;
            suma = suma + stos.getWysokosc(pozycja);
            pozycja = pozycja + odstep;
        }
        if (ilosc != 0){
            miazszosc = (suma / ilosc)*szerokosc;
            return miazszosc;
        }
        else{
            return 0;
        }
    }
}
