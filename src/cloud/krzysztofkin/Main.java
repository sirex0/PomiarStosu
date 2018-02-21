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

        java.io.PrintWriter writer = new java.io.PrintWriter("stosUMS.csv", "UTF-8");
        writer.println("a;b;c;h;v0;v1");
        for (Stos stos : stosy) {
            mierniczy = new MierniczyUMS(stos);
            writer.print(stos.pokazStos());
            writer.print(";");
            writer.print(String.format("%.2f",stos.getMiazszosc()));
            writer.print(";");
            writer.println(String.format("%.2f",mierniczy.getMiazszosc()));
        }
        writer.close();

    }
}
