package Decorator;

import Decorator.Topping.Ketchup;
import Decorator.Topping.Patty;

public class Main {
    public static void main(String[] args){
        Hamburger hamburger = new Ketchup(new Patty(new Bread()));
        System.out.println(hamburger.getDescription());
    }
}
