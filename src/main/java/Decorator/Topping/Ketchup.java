package Decorator.Topping;

import Decorator.Bread;
import Decorator.Hamburger;
import Decorator.HamburgerMaker;

public class Ketchup extends HamburgerMaker {


    public Ketchup(Hamburger hamburger) {
        super(hamburger);
    }

    public float getPrice(){
        //bread si riferisce al parametro di HamburgerMaker
        return (float) (hamburger.getPrice()+0.5);
    }

    public String getDescription(){
        return hamburger.getDescription()+" + ketchup";
    }
}
