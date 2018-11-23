import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        //single line comment

        /*
         multiline comment

         */


        Cup myCup = new Cup(); //myCup is link to the first Cup in Cup class (we create a new object), it is blue
        Cup myCupA = myCup; //myCupA is a copy of the link myCup, it is also blue

        System.out.println("My Cup is " + myCup.color); // print: My Cup is blue
        System.out.println("My CupA is " + myCupA.color); // print: My CupA is blue

        myCupA.color = "red"; //now myCup & myCupA are red instead of blue

        System.out.println("My Cup is " + myCup.color); // print: My Cup is red
        System.out.println("My CupA is " + myCupA.color); // print: My CupA is red


        Cup myCup2 = new Cup("red",2,1.5); // myCup2 is link to the second Cup in Cup class
        System.out.println("The color of my Cup is " + myCup2.color + ", its volume is " + myCup2.volume + " liters" + ", the price is " + myCup2.price + " rubles"); // print: The color of my Cup is red, its volume is 2 liters, the price is 1.5 rubles
        System.out.println("My Cup2 has " + myCup2.fieldVolume + " litres");

        myCup2.toFill(3);
        System.out.println("My Cup2 has " + myCup2.fieldVolume + " litres");

        myCup2.toDrink(2);
        System.out.println("My Cup2 after trying to drink has " + myCup2.toDrink(2) + " litres");



        Cup myCup3 = new Cup("green",5,5.4); // myCup3 is link to the second Cup in Cup class
        System.out.println("My Cup3 has " + myCup3.fieldVolume + " litres"); // print: My Cup3 has 0 litres

        myCup3.toFill(4); // call the function toFill = 0 + 4
        System.out.println("My Cup3 has " + myCup3.fieldVolume + " litres"); // print: My Cup3 has 4 litres

        myCup3.toFill(2); // call the function toFill = 4 + 2 > 5 => call condition if
        System.out.println("My Cup3 has " + myCup3.fieldVolume  + " litres"); // print: oppps, has gone water: -1, My Cup3 has 5 litres

        myCup3.toDrink(2); // call the function toDrink = 5 - 2
        System.out.println("My Cup3 after trying to drink has " + myCup3.toDrink(2) + " litres"); // print: "After drinking my Cup3 has 3 litres"








    }
}
