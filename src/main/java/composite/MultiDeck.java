package composite;

import java.util.ArrayList;
import java.util.List;

//questo è il component
public class MultiDeck implements Drawable{

    //questo è il composite
    private List<Drawable> decks = new ArrayList<>();

    @Override
    public void draw() {
        for (Drawable deck : decks) {
            deck.draw();
        }
    }

    public void add(Drawable deck){
        decks.add(deck);
    }

    public void remove(Drawable deck){
        decks.remove(deck);
    }
}
