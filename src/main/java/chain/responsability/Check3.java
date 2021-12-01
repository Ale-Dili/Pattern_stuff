package chain.responsability;

public class Check3 implements ChainResponsability {
    private ChainResponsability nextInChain;

    public Check3(ChainResponsability nextInChain) {
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
            if (n == 3) {
                cont++;
            }
        }
        if (cont >= 3) {
            return 3;
        }
        return nextInChain.process(array);


    }
}
