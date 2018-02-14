package cloud.krzysztofkin;

public class Stos {
    float h;
    float a;
    float b;
    float c;

    public Stos(float a, float b, float c, float h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    public String pokazStos() {
        String opis = (String.format("%.2f",a) + ";" + String.format("%.2f",b) + ";" + String.format("%.2f",c)+";"+String.format("%.2f",h));
        return opis;
    }

    public float getSzerokosc() {
        return a + b + c;
    }

    public float getMiazszosc() {
        float miazszosc = h*a / 2 + b*h + h*c / 2;
        return miazszosc;
    }

    public float getWysokosc(float pozycja) {
        if (pozycja < a) {
            return (pozycja / a)*h;
        } else if (pozycja > a + b) {
            return ((getSzerokosc()-pozycja)/c)*h;
        } else {
            return h;
        }
    }
}
