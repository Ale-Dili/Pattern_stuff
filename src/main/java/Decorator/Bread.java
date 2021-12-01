package Decorator;

//è l'oggetto base su cui aggiungo i vari topper
public class Bread implements Hamburger {

    @Override
    public float getPrice() {
        return 3;
    }

    @Override
    public String getDescription() {
        return "Croccante panino";
    }
}
