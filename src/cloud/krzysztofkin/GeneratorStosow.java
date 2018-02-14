package cloud.krzysztofkin;

import java.util.ArrayList;

public class GeneratorStosow {

    ArrayList<Stos> stosy;


    public GeneratorStosow() {
        float da=0.3f;
        float db=0.3f;
        float dc=0.3f;
        float dh=0.3f;

        this.stosy = new ArrayList<Stos>();
        for (float h = 1; h < 4.01f; h = h + dh)
            for (float b = 1; b < 30.01f; b = b + db)
                for (float a = h; a < 2f*h; a = a + da)
                    for (float c = h; c < 2.0f*h; c = c + dc) {
                        //System.out.println(a + " "+b+" "+ c);
                        //System.out.println(c + " "+b+" " + a);
                        stosy.add(new Stos(a, b, c, h));
                        stosy.add(new Stos(c, b, a, h));
                    }


    }

    /**
     * Zwraca wygenerowaną ArrayList stosów
     * @return
     */
    public ArrayList<Stos> getStosy() {
        return stosy;
    }

}
