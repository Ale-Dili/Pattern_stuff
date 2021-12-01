package chain.responsability;

public class Check1 implements ChainResponsability{
   private ChainResponsability nextInChain;

    public Check1(ChainResponsability nextInChain) {
        this.nextInChain = nextInChain;
    }

    @Override
    public void goNext(ChainResponsability nextInChain) {
        this.nextInChain=nextInChain;
    }

    @Override
    public int process(int[] array) {
        int cont=0;
        for (int n: array){
            if (n==1){
                cont++;
            }
        }
        if(cont >=3){
            return 1;
        }
        return nextInChain.process(array);
    }
}
