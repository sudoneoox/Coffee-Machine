package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        ingredients();
		canYouMakeX();
		loading();
		storage();
    }
// uncomment this to see how much of each ingredient you will need in order to make coffee
    public static void ingredients() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need:");
        int cups = sc.nextInt();
        int water = cups * 200;
        int milk = cups * 50;
        int coffee = cups * 15;
        System.out.printf("For %d cups of coffee you will need:%n%d ml of water%n%d ml of milk%n%d g of coffee beans",
                cups, water, milk, coffee);

    }
	//checks if you have enough ingredients in order to make your cup of coffee
    public static void canYouMakeX() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" /n Write how many ml of water the coffee machine has:");
        int mLwater = sc.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int mLmilk = sc.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int gCoffee = sc.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int cupsN = sc.nextInt();

        int waterForNcups = mLwater / 200;
        int milkForNcups = mLmilk / 50;
        int coffeeForNcups = gCoffee / 15;
        int potentialCups = 0;

        int[] quantites = {waterForNcups, milkForNcups, coffeeForNcups};
        for (int i = 0; i < quantites.length; i++) {
            if (i == 0) {
                potentialCups = quantites[i];
            } else if (quantites[i] < potentialCups) {
                potentialCups = quantites[i];
            }
        }
        if (potentialCups == cupsN) {
            System.out.print("Yes, I can make that amount of coffee");
        } else if (potentialCups > cupsN) {
            int difference = potentialCups - cupsN;
            System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)", difference);
        } else {
            System.out.printf("No, I can make only %d cup(s) of coffee", potentialCups);
        }

    }
	//simple loading to make it seem more responsive
    public static void loading() {
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");
    }
	// the most fun part choose from many differents options have fun
    public static void storage() {
        Scanner scn = new Scanner(System.in);
        int numberOfWaterMl = 400;
        int numberOfMilkMl = 540;
        int numberOfCoffeeGr = 120;
        int numberOfCups = 9;
        int amountOfMoney = 550;
        boolean exit = false;

        while (!exit) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            switch (scn.next()) {
                case "buy":
                    System.out.println();
                    String back = null;
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    switch (scn.next()) {
                        case "1":
                            if (numberOfWaterMl >= 250 && numberOfCoffeeGr >= 16 && numberOfCups >= 1) {
                                System.out.println("I have enough resources, making you a coffee!");
                                numberOfWaterMl -= 250;
                                numberOfCoffeeGr -= 16;
                                numberOfCups -= 1;
                                amountOfMoney += 4;
                            } else if (numberOfWaterMl < 250) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            } else if (numberOfCoffeeGr < 16) {
                                System.out.println("Sorry, not enough coffee beans!");
                                break;
                            } else if (numberOfCups == 0) {
                                System.out.println("Sorry, not enough cups!");
                                break;
                            }
                            System.out.println();
                            break;
                        case "2":
                            if (numberOfWaterMl >= 350 && numberOfMilkMl >= 75 && numberOfCoffeeGr >= 20 && numberOfCups >= 1) {
                                System.out.println("I have enough resources, making you a coffee!");
                                numberOfWaterMl -= 350;
                                numberOfMilkMl -= 75;
                                numberOfCoffeeGr -= 20;
                                numberOfCups -= 1;
                                amountOfMoney += 7;
                            } else if (numberOfWaterMl < 350) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            } else if (numberOfMilkMl < 75) {
                                System.out.println("Sorry, not enough milk!");
                                break;
                            } else if (numberOfCoffeeGr < 20) {
                                System.out.println("Sorry, not enough coffee beans!");
                                break;
                            } else if (numberOfCups == 0) {
                                System.out.println("Sorry, not enough cups!");
                                break;
                            }
                            System.out.println();
                            break;
                        case "3":
                            if (numberOfWaterMl >= 200 && numberOfMilkMl >= 100 && numberOfCoffeeGr >= 12 && numberOfCups >= 1) {
                                System.out.println("I have enough resources, making you a coffee!");
                                numberOfWaterMl -= 200;
                                numberOfMilkMl -= 100;
                                numberOfCoffeeGr -= 12;
                                numberOfCups -= 1;
                                amountOfMoney += 6;
                            } else if (numberOfWaterMl < 200) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            } else if (numberOfMilkMl < 100) {
                                System.out.println("Sorry, not enough milk!");
                                break;
                            } else if (numberOfCoffeeGr < 12) {
                                System.out.println("Sorry, not enough coffee beans!");
                                break;
                            } else if (numberOfCups == 0) {
                                System.out.println("Sorry, not enough cups!");
                                break;
                            }
                            System.out.println();
                            break;
                        case "back":
                            System.out.println();
                            break;
                        default:
                            System.out.println("That input is not a type of coffee!");
                            System.out.println();
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water do you want to add:");
                    numberOfWaterMl += scn.nextInt();
                    System.out.println("Write how many ml of milk do you want to add:");
                    numberOfMilkMl += scn.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    numberOfCoffeeGr += scn.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    numberOfCups += scn.nextInt();
                    System.out.println();
                    break;
                case "take":
                    System.out.println("I gave you $" + amountOfMoney);
                    amountOfMoney = 0;
                    System.out.println();
                    break;
                case "remaining":
                    System.out.println();
                    System.out.println("The coffee machine has:");
                    System.out.println(numberOfWaterMl + " of water");
                    System.out.println(numberOfMilkMl + " of milk");
                    System.out.println(numberOfCoffeeGr + " of coffee beans");
                    System.out.println(numberOfCups + " of disposable cups");
                    System.out.println("$" + amountOfMoney + " of money");
                    System.out.println();
                    break;
                case "exit":
                    exit = true;
                    break;
                default:
                    System.out.println("That is not a valid input!");
                    System.out.println();
            }
        }
    }
}