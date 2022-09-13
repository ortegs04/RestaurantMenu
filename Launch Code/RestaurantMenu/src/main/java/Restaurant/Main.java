package Restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("in main");
        MenuItem itemOne = new MenuItem(14.99, "hamburger", "Entree");


        MenuItem itemTwo = new MenuItem(5.99, "taco", "Entree");


        Menu restaurantMenuOne = new Menu();
        System.out.println(restaurantMenuOne);
        System.out.println(restaurantMenuOne.getLastUpdated());
        System.out.println(restaurantMenuOne.getMenuItems());

        Menu restaurantMenuTwo = new Menu(new ArrayList<MenuItem>(Arrays.asList(itemOne, itemTwo)));
        System.out.println(restaurantMenuTwo);
        System.out.println(restaurantMenuTwo.getLastUpdated());
        System.out.println(restaurantMenuTwo.getMenuItems());


    }
}