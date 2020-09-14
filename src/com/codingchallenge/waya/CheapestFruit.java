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
      listOfFruitStands.add(new FruitStand(i,2*i,3*i,i));
    }

    //This computes the cheapest place to buy cherries and peaches along the way (The basic task asked for).
    double cheapestPriceOfCheeriesAndPeaches = Double.MAX_VALUE;
    FruitStand cheapestFruitStand = new FruitStand(-1,-1,-1,-1); //Negative numbers for ease of debugging.
    for (FruitStand fruitStand:listOfFruitStands) {
      double fruitStandTotalPrice = computePriceOfCherriesAndPeaches(fruitStand);
      if (fruitStandTotalPrice < cheapestPriceOfCheeriesAndPeaches) {
        cheapestFruitStand = fruitStand;
        cheapestPriceOfCheeriesAndPeaches = fruitStandTotalPrice;
      }
    }

    //This computes the price of pears and the cheapest other fruit at
    // the first available fruit stand (taken to mean index(0) of the list.
    FruitStand firstFruitStand = listOfFruitStands.get(0);
    double priceOfPearsAndCheapestFruit;
    if (firstFruitStand.getPriceOfPeaches() > firstFruitStand.getPriceOfCherys()) {
      priceOfPearsAndCheapestFruit = firstFruitStand.getPriceOfPeaches() + firstFruitStand.getPriceOfPears();
    }
    else {
      priceOfPearsAndCheapestFruit = firstFruitStand.getPriceOfCherys() + firstFruitStand.getPriceOfPears();
    }


    //Output the results
    //The first basic task:
    System.out.println(createOutputStringBasicTask(cheapestPriceOfCheeriesAndPeaches, cheapestFruitStand.getNumber()));

    //Expanded Taks 1:
    System.out.println(createOutputStringExtension1(priceOfPearsAndCheapestFruit));

  }

  private static String createOutputStringBasicTask(double price, int number) {
    String priceString = String.format("%.2f", price);
    String outputString = "Den billigaste persikorna och körsbären kostar " + priceString +
                          " kr och finns vid fruktstånd nummer: " + number + ".";

    return outputString;
  }

  private static String createOutputStringExtension1(double price) {
    String priceString = String.format("%.2f", price);
    String outputString = "Vid första fruktsåndet så kostar päron och den billigaste andra frukten " + priceString +
                          " kr.";

    return outputString;
  }



  private static double computePriceOfCherriesAndPeaches(FruitStand fruitStand) {
    return fruitStand.getPriceOfCherys() + fruitStand.getPriceOfPeaches();
  }


}
