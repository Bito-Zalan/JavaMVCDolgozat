package nezet;

public abstract class KonzolNezet extends CuiNezet{

    @Override
    public void bekeres() {
        megjelenit("Bemutatkozas");
    }

    @Override
    public void megjelenit(String uzenet) {
        System.out.print(uzenet);
    }
}
