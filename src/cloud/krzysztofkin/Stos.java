package cloud.krzysztofkin;

public class Stos {
    float a;
    float b;
    float c;

    public Stos(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String pokazStos() {
        String opis = (a + " " + b + " " + c);
        return opis;
    }

    public float getSzerokosc() {
        return a + b + c;
    }

    public float getMiazszosc() {
        float miazszosc = a / 2 + b + c / 2;
        return miazszosc;
    }

    public float getWysokosc(float pozycja) {
        if (pozycja < a) {
            return pozycja / a;
        } else if (pozycja > a + b) {
            return (getSzerokosc()-pozycja)/a;
        } else {
            return 1.0f;
        }
    }
}
