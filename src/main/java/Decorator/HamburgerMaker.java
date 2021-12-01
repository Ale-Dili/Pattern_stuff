package Decorator;

public abstract class HamburgerMaker implements Hamburger {

    protected Hamburger hamburger;

    public HamburgerMaker(Hamburger hamburger) {
        this.hamburger = hamburger;
    }

    @Override
    public float getPrice() {
        return hamburger.getPrice();
    }

    @Override
    public String getDescription() {
        return hamburger.getDescription();
    }
}
