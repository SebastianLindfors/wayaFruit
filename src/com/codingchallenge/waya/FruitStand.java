package com.codingchallenge.waya;

public class FruitStand {


  private double priceOfPeaches;
  private double priceOfCherys;

  private int number;

  // ----- Constructors ----- //

  //Argless constructor for simplicity
  public FruitStand() {}

  public FruitStand(double priceOfPeaches, double priceOfCherys, int number) {
    this.priceOfCherys = priceOfCherys;
    this.priceOfPeaches = priceOfPeaches;
    this.number = number;
  }

  // ----- Getters and Setters ----- //

  public double getPriceOfPeaches() {
    return priceOfPeaches;
  }

  public void setPriceOfPeaches(double priceOfPeaches) {
    this.priceOfPeaches = priceOfPeaches;
  }

  public double getPriceOfCherys() {
    return priceOfCherys;
  }

  public void setPriceOfCherys(double priceOfCherys) {
    this.priceOfCherys = priceOfCherys;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }






}
