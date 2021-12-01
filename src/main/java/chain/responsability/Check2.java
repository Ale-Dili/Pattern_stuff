package chain.responsability;

public class Check2 implements ChainResponsability {
    private ChainResponsability nextInChain;

    public Check2(ChainResponsability nextInChain) {
        this.nextInChain = nextInChain;
    }

    @Override
    public void goNext(ChainResponsability nextInChain) {
        this.nextInChain = nextInChain;
    }

    @Override
    public int process(int[] array) {

        int cont = 0;
        for (int n : array) {
            if (n == 2) {
                cont++;
            }
        }
        if (cont >= 3) {
            return 2;
        }
        return nextInChain.process(array);
    }
}
