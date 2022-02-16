package com.company;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Dinner {

    public static void main(String[] args) {
	// write your code here
        Italian myDish = new Italian();
        Mexican myDish2 = new Mexican();


        String [] italianFood = {"Bolognese", "Fettuccini", "Spaghetti", "Lasagna", "Chicken Parmesan" };
        String [] mexicanFood = {"Tacos", "Nachos", "Chili Relleno", "Enchiladas", "Fajitas"};


        italianFood[0].setCaloriesOfDish(297);
        italianFood[1].setCaloriesOfDish(415);
        italianFood[2].setCaloriesOfDish(670);
        italianFood[3].setCaloriesOfDish(450);
        italianFood[4].setCaloriesOfDish(567);

        italianFood[0].setIsGlutenFree(false);
        italianFood[1].setIsGlutenFree(false);
        italianFood[2].setIsGlutenFree(false);
        italianFood[3].setIsGlutenFree(false);
        italianFood[4].setIsGlutenFree(false);

        mexicanFood[0].setCaloriesOfDish(226);
        mexicanFood[1].setCaloriesOfDish(479);
        mexicanFood[2].setCaloriesOfDish(350);
        mexicanFood[3].setCaloriesOfDish(286);
        mexicanFood[4].setCaloriesOfDish(431);

        mexicanFood[0].setIsGlutenFree(true);
        mexicanFood[1].setIsGlutenFree(true);
        mexicanFood[2].setIsGlutenFree(false);
        mexicanFood[3].setIsGlutenFree(false);
        mexicanFood[4].setIsGlutenFree(true);
    }
}
