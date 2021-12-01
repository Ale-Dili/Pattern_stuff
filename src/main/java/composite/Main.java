package composite;

public class Main {
    public void main(){
        MultiDeck multiDeck = new MultiDeck();
        Deck d1 = new Deck();
        Deck d2 = new Deck();

        multiDeck.add(d1);
        multiDeck.add(d2);
    }
}
