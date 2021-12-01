package Decorator.Topping;

import Decorator.Bread;
import Decorator.Hamburger;
import Decorator.HamburgerMaker;

public class Patty extends HamburgerMaker {

    public Patty(Hamburger hamburger) {
        super(hamburger);
    }


    public float getPrice(){
        //bread si riferisce al parametro di HamburgerMaker
        return hamburger.getPrice()+2;
    }

    public String getDescription(){
        return hamburger.getDescription()+" + gustoso patty";
    }


}
