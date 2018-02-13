package cloud.krzysztofkin;

public class MierniczyZRDLP extends Mierniczy{
    public MierniczyZRDLP(Stos stos) {
        super(stos);
    }

    @Override
    public float getMiazszosc() {
        return super.getMiazszosc()-1;
    }

}
