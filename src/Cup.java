public class Cup {
    String color;
    Integer volume;
    Double price;
    Integer fieldVolume = 0; // init value of liquids ib the cup
    Integer fieldAfterDrink;

    Cup() {
        color = "blue";
    }

    Cup(String costumColor, Integer costumVolume, Double customPrice) {
        this.color = costumColor;
        this.volume = costumVolume;
        this.price = customPrice;
    }

    Integer toFill (Integer waterAmount) {                                                  // method: to fill the cup with water
        this.fieldVolume = fieldVolume + waterAmount;
        if (fieldVolume > volume) {
            System.out.println("oppps, has gone water: " + (volume - fieldVolume));
            fieldVolume = volume;
        }
        return fieldVolume;
    }

    Integer toDrink (Integer drinkAmount) {                                                 // method: to drink from the cup and show how much water is in a cup
       fieldAfterDrink = fieldVolume - drinkAmount;
        if (fieldVolume < drinkAmount) {
            System.out.println("oppps, cup has only: " + (fieldVolume) + " litres");
            fieldAfterDrink = fieldVolume;
        }
        return fieldAfterDrink;
    }

}