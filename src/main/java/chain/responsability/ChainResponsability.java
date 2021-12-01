package chain.responsability;

interface ChainResponsability {
    void goNext(ChainResponsability nextInChain); //metodo invia la richiesta all'altro handler

    int process(int[] array);
}
