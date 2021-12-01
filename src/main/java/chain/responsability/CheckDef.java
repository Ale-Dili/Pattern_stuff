package chain.responsability;

public class CheckDef implements ChainResponsability {
    private ChainResponsability nextInChain;


    @Override
    public void goNext(ChainResponsability nextInChain) {
        this.nextInChain = nextInChain;
    }

    @Override
    public int process(int[] array) {
        return 4;
    }
}
