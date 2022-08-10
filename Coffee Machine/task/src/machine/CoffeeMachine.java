package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static Scanner scanner = new Scanner(System.in);

    public static void remaining() {
        System.out.println(InTheCoffeeMachine.water + " ml of water");
        System.out.println(InTheCoffeeMachine.milk + " ml of milk");
        System.out.println(InTheCoffeeMachine.coffeeBeans + " grams of coffee beans");
        System.out.println(InTheCoffeeMachine.disposableCups + " disposable cups");
        System.out.println("$" + InTheCoffeeMachine.money + " of money");
    }

    public static void buy() {
        while (true) {
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
            Input.kindOfCoffee = scanner.nextLine().toLowerCase();

            switch (Input.kindOfCoffee) {
                case "back":
                    return;
                case "1":
                    if (InTheCoffeeMachine.water < Ingredients.ForEspresso.water) {
                        System.out.println("Sorry, not enough water!");
                    } else if (InTheCoffeeMachine.coffeeBeans < Ingredients.ForEspresso.coffeeBeans) {
                        System.out.println("Sorry, not enough coffee beans!");
                    } else if (InTheCoffeeMachine.disposableCups < 1) {
                        System.out.println("Sorry, not enough disposable cups!");
                    } else {
                        System.out.println("I have enough resources, making you a coffee!");
                        InTheCoffeeMachine.water -= Ingredients.ForEspresso.water;
                        InTheCoffeeMachine.coffeeBeans -= Ingredients.ForEspresso.coffeeBeans;
                        InTheCoffeeMachine.disposableCups -= 1;
                        InTheCoffeeMachine.money += Ingredients.ForEspresso.money;
                    }
                    return;
                case "2":
                    if (InTheCoffeeMachine.water < Ingredients.ForLatte.water) {
                        System.out.println("Sorry, not enough water!");
                    } else if (InTheCoffeeMachine.milk < Ingredients.ForLatte.milk) {
                        System.out.println("Sorry, not enough milk!");
                    } else if (InTheCoffeeMachine.coffeeBeans < Ingredients.ForLatte.coffeeBeans) {
                        System.out.println("Sorry, not enough coffee beans!");
                    } else if (InTheCoffeeMachine.disposableCups < 1) {
                        System.out.println("Sorry, not enough disposable cups!");
                    } else {
                        System.out.println("I have enough resources, making you a coffee!");
                        InTheCoffeeMachine.water -= Ingredients.ForLatte.water;
                        InTheCoffeeMachine.milk -= Ingredients.ForLatte.milk;
                        InTheCoffeeMachine.coffeeBeans -= Ingredients.ForLatte.coffeeBeans;
                        InTheCoffeeMachine.disposableCups -= 1;
                        InTheCoffeeMachine.money += Ingredients.ForLatte.money;
                    }
                    return;
                case "3":
                    if (InTheCoffeeMachine.water < Ingredients.ForCappuccino.water) {
                        System.out.println("Sorry, not enough water!");
                    } else if (InTheCoffeeMachine.milk < Ingredients.ForCappuccino.milk) {
                        System.out.println("Sorry, not enough milk!");
                    } else if (InTheCoffeeMachine.coffeeBeans < Ingredients.ForCappuccino.coffeeBeans) {
                        System.out.println("Sorry, not enough coffee beans!");
                    } else if (InTheCoffeeMachine.disposableCups < 1) {
                        System.out.println("Sorry, not enough disposable cups!");
                    } else {
                        System.out.println("I have enough resources, making you a coffee!");
                        InTheCoffeeMachine.water -= Ingredients.ForCappuccino.water;
                        InTheCoffeeMachine.milk -= Ingredients.ForCappuccino.milk;
                        InTheCoffeeMachine.coffeeBeans -= Ingredients.ForCappuccino.coffeeBeans;
                        InTheCoffeeMachine.disposableCups -= 1;
                        InTheCoffeeMachine.money += Ingredients.ForCappuccino.money;
                    }
                    return;
            }
        }
    }

    public static void fill() {
        System.out.println("Write how many ml of water you want to add:");
        int addWater = scanner.nextInt();
        InTheCoffeeMachine.water += addWater;
        System.out.println("Write how many ml of milk you want to add:");
        int addMilk = scanner.nextInt();
        InTheCoffeeMachine.milk += addMilk;
        System.out.println("Write how many grams of coffee beans you want to add:");
        int addCoffeeBeans = scanner.nextInt();
        InTheCoffeeMachine.coffeeBeans += addCoffeeBeans;
        System.out.println("Write how many disposable cups of coffee you want to add:");
        int addDisposableCups = scanner.nextInt();
        InTheCoffeeMachine.disposableCups += addDisposableCups;
    }

    public static void take() {
        System.out.println("I gave you $" + InTheCoffeeMachine.money);
        InTheCoffeeMachine.money = 0;
    }

    public static void actions() {
        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            Input.action = scanner.nextLine().toLowerCase();
            switch (Input.action) {
                case "buy":
                    buy();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    remaining();
                    break;
                case "exit":
                    return;
            }
        }
    }
}