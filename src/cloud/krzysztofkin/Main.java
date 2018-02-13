package cloud.krzysztofkin;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

        Mierniczy mierniczy;
        ArrayList<Stos> stosy;
        GeneratorStosow generator = new GeneratorStosow();
        stosy = generator.getStosy();
        System.out.println(stosy.size());

        java.io.PrintWriter writer = new java.io.PrintWriter("stos.csv", "UTF-8");


        for (Stos stos : stosy) {

            mierniczy = new MierniczyZRDLP(stos);
            writer.print(stos.getMiazszosc());
            writer.print(";");
            writer.println(mierniczy.getMiazszosc());
        }
        writer.close();

    }
}
