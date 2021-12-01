package chain.responsability;

/**
 * PROGRAMMA CHE RITORNA UN NUMERO A SECONDA DI QUESTE CONDIZIONI
 * si risolve andando a cascata.
 * 1) CI SONO TRE 1 NELL'ARRAY
 * 2) CI SONO TRE 2 NELL'ARRAY
 * 3) CI SONO TRE 3 NELL'ARRAY
 * 4) NESSUNA DELLA PRECEDENTI E' RISPETTATA
 **/
public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 2, 2, 4};
        ChainResponsability chain = new Check1(new Check2(new Check3(new CheckDef())));
        System.out.println(chain.process(array));

    }
}
