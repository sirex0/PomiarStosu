package cloud.krzysztofkin;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Mierniczy mierniczy;
        ArrayList<Stos> stosy;
        GeneratorStosow generator = new GeneratorStosow();
        stosy = generator.getStosy();
        System.out.println(stosy.size());

        for (Stos stos : stosy) {
            mierniczy = new MierniczyZRDLP(stos);
            System.out.print(stos.getMiazszosc());
            System.out.print(" ");
            System.out.println(mierniczy.getMiazszosc());
        }


    }
}
