package cloud.krzysztofkin;

public class Mierniczy {
    Stos stos;

    public Mierniczy(Stos stos) {
        this.stos = stos;
    }

    public float getMiazszosc(){
        return stos.getMiazszosc();
    }

    public float getSzerokosc(){
        return stos.getSzerokosc();
    }

    public float getWysokoscSrednia(){
        return stos.getMiazszosc()/stos.getSzerokosc();
    }
}
