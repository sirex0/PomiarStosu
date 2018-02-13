package cloud.krzysztofkin;

import java.util.ArrayList;

public class GeneratorStosow {

    ArrayList<Stos> stosy;

    public ArrayList<Stos> getStosy() {
        return stosy;
    }

    public GeneratorStosow() {
        this.stosy = new ArrayList<Stos>();
        for (float b = 1; b <= 15; b = b + 1)
            for (float a = 1; a <= 2.01; a = a + 0.10f)
                for (float c = 1; c <= 2.01; c = c + 0.10f) {
                    //System.out.println(a + " "+b+" "+ c);
                    //System.out.println(c + " "+b+" " + a);
                    stosy.add(new Stos(a,b,c));
                    stosy.add(new Stos(c,b,a));
                }


    }


}
