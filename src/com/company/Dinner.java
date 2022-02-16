package com.company;

import java.util.Random;
import java.util.Scanner;

public class Dinner {

    public static void main(String[] args) {
        // write your code here
        Italian bolognese = new Italian();
        Italian fettuccini = new Italian();
        Italian spaghetti = new Italian();
        Italian lasagna = new Italian();
        Italian chickenParmesan = new Italian();
        Mexican tacos = new Mexican();
        Mexican nachos = new Mexican();
        Mexican chiliRelleno = new Mexican();
        Mexican enchiladas = new Mexican();
        Mexican fajitas = new Mexican();


        Italian[] italianFood = {bolognese, fettuccini, spaghetti, lasagna, chickenParmesan};
        Mexican[] mexicanFood = {tacos, nachos, chiliRelleno, enchiladas, fajitas};

        italianFood[0].setNameOfDish("bolognese");
        italianFood[1].setNameOfDish("fettuccini");
        italianFood[2].setNameOfDish("spaghetti");
        italianFood[3].setNameOfDish("lasagna");
        italianFood[4].setNameOfDish("chickenParmesan");

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


        // Adding Scanner to ask question
        Scanner userInput = new Scanner(System.in);

        System.out.println("What type of food would you like to make? Please choose between Italian and Mexican");
        String userAnswer = userInput.nextLine();
        Random random = new Random(System.currentTimeMillis());

        for (int i = 0; i < italianFood.length || i < mexicanFood.length; ) {

            if (userAnswer.equals("Italian")) {
                System.out.print("You should make: " + italianFood[random.nextInt(5)].getNameOfDish());
                break;
            } else if (userAnswer.equals("Mexican")) {
                System.out.println("You should make: " + mexicanFood[random.nextInt(5)]);
                break;
            } else {
                System.out.println("Not an option");
            }
        }
    }
}
