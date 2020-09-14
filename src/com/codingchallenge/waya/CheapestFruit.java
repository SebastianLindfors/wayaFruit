package com.codingchallenge.waya;

import java.util.ArrayList;
import java.util.List;

public class CheapestFruit {

  public static void main(String[] args) {

    // ----- SETUP VARIABLES ----- //

    int numberOfFruitStands = 10; //This is how many fruit stands exists along the road.

    // ----- Main Code ------ //

    //Create a list of all fruitstands that exists along the way.
    //In this version the first one is cheapest and they become more and more expensive.
    List<FruitStand> listOfFruitStands = new ArrayList<>();
    for (int i = 1; i < numberOfFruitStands + 1; i++) {
      listOfFruitStands.add(new FruitStand(i,i,i));
    }

    double cheapestPrice = Double.MAX_VALUE;
    FruitStand cheapestFruitStand = new FruitStand(-1,-1,-1); //Negative numbers for ease of debugging.
    for (FruitStand fruitStand:listOfFruitStands) {
      double fruitStandTotalPrice = computePriceOfCherriesAndPeaches(fruitStand);
      if (fruitStandTotalPrice < cheapestPrice) {
        cheapestFruitStand = fruitStand;
        cheapestPrice = fruitStandTotalPrice;
      }

    }


    System.out.println(createOutputString(cheapestPrice, cheapestFruitStand.getNumber()));





  }

  private static String createOutputString(double price, int number) {
    String priceString = String.format("%.2f", price);
    String outputString = "Den billigaste frukten kostar " + priceString +
                          " kr och finns vid fruktstånd nummer: " + number + ".";

    return outputString;
  }

  private static double computePriceOfCherriesAndPeaches(FruitStand fruitStand) {
    return fruitStand.getPriceOfCherys() + fruitStand.getPriceOfPeaches();
  }


}
