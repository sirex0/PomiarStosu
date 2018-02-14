package cloud.krzysztofkin;

public class MierniczyZRDLP extends Mierniczy {
    float szerokosc;

    public MierniczyZRDLP(Stos stos) {
        super(stos);
        szerokosc = stos.getSzerokosc();
    }

    @Override
    public float getMiazszosc() {
        float reszta = szerokosc %2;
        float srednia;
        int licznik=0;
        float suma=0;
        for(float pozycja = reszta/2; pozycja<=szerokosc;pozycja=pozycja+2){

            suma = suma + stos.getWysokosc(pozycja);
            licznik++;
        }
        srednia = suma / licznik;
        return srednia * szerokosc;
    }


}
