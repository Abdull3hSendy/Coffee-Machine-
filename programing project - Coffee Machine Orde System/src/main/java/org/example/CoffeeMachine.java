package org.example;

import java.util.Scanner;
import java.util.Vector;

public class CoffeeMachine {
    static Vector TheOrder = new Vector<>();

    public static void main(String[] args) {
        int selection3;
        do {
            String input = "";
            Scanner out = new Scanner(System.in);
            Help help = new Help();
            help.printIntroduction();
            selection3 = help.orderNumber();

            // switch ========================================

            switch (selection3) {


                // while Loop =============================================
                case 1 -> {
                    while (selection3 == 1) {

                        // MAIN MENU // ====================================

                        help.printMainMenu();
                        int selection = help.orderNumber();
                        int selection2;

                        if (selection == 1) {

                            help.printMenuCoffee();

                            //Coffee MENU // ====================================

                            selection = out.nextInt();
                            switch (selection) {
                                case 1 -> {
                                    input = "Amricano Coffee";
                                }
                                case 2 -> {
                                    input = "Cappuccino";
                                }
                                case 3 -> {
                                    input = "Espresso";
                                }
                                case 4 -> {
                                    input = "Latte";
                                }
                                case 5 -> {
                                    input = "Frappuccino";
                                }
                                case 6 -> {
                                }
                            }
                            TheOrder.add(input);

                        }

                        // ICE COFFEE MENU // =====================================

                        else if (selection == 2) {

                            help.printMenuIceCoffee();

                            selection2 = out.nextInt();
                            switch (selection2) {
                                case 1 -> {
                                    input = "Ice Amricano";
                                }
                                case 2 -> {
                                    input = "Ice Latte";
                                }
                                case 3 -> {
                                    input = "Ice White Mhoca";
                                }
                                case 4 -> {
                                    input = "ice caramel macchiato";
                                }
                                case 5 -> {
                                    input = "Ice V60";
                                }
                                case 6 -> {
                                }
                            }
                            TheOrder.add(input);

                        }

                        // Sandwichs  MENU // =====================================

                        else if (selection == 3) {

                            help.printMenuSandwich();

                            selection2 = help.orderNumber();
                            switch (selection2) {
                                case 1 -> {
                                    input = "Egg Sandwich";
                                }
                                case 2 -> {
                                    input = "Chese Sandwich";
                                }
                                case 3 -> {
                                    input = "Tuna Sandwich";
                                }
                                case 4 -> {
                                    input = "chiken Sandwich";
                                }
                                case 5 -> {
                                    input = "Peanut Butter Sandwich";
                                }
                                case 6 -> {
                                }
                            }
                            TheOrder.add(input);

                        }

                        // Dessert MENU // =====================================

                        else if (selection == 4) {

                            help.printMenuDessert();

                            selection2 = help.orderNumber();
                            switch (selection2) {
                                case 1 -> {
                                    input = "Brownie";
                                }
                                case 2 -> {
                                    input = "Cake";
                                }
                                case 3 -> {
                                    input = "Cheesecake";
                                }
                                case 4 -> {
                                    input = "Ice Cream";
                                }
                                case 5 -> {
                                    input = "Cookies";
                                }
                                case 6 -> {
                                }
                            }
                            TheOrder.add(input);

                        } else {

                            System.out.println("The number dosen't exist!. ");
                        }
                        help.printMenuQuit();

                        selection3 = help.orderNumber();
                        if (selection3 != 1 & selection3 != 2) {
                            help.printAgine();
                            selection3 = help.orderNumber();

                        }
                    }
                    System.out.println("Your Order is:" + TheOrder);
                    System.out.println("thank you for your visit and we hope you will come back again");

                }
                case 2 -> {
                    System.out.println("Your Order is:" + TheOrder);
                    System.out.println("thank you for your visit and we hope you will come back again");
                }
                default -> {
                    System.out.println("The number dosen't exist!. ");
                }
            }
        } while (selection3 != 2);

    }
}