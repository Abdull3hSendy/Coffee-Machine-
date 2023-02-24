package org.example;

public class Print  extends CoffeeMachine{
    public void printIntroduction(){
        System.out.println("================================================== ");
        System.out.println("Welcome to the Sendian Coffey!");
        System.out.println("do you want to Order ? :> \n 1. Yes \n 2.No");
        System.out.println("================================================== ");
    }
    public void printMainMenu(){
        System.out.println("================================================== ");
        System.out.println("Please make a selection from the following menu:");
        System.out.println("1. Coffee");
        System.out.println("2. IceCoffee");
        System.out.println("3. Sandwich");
        System.out.println("4. Dessert");
        System.out.println("5. Quit");
        System.out.println("================================================== ");
    }
    public void printMenuCoffee(){
        System.out.println("================================================== ");
        System.out.println("You have selected Coffee. Please make a selection from the following menu:");
        System.out.println("1. Amricano Coffee");
        System.out.println("2. Cappuccino");
        System.out.println("3. Espresso");
        System.out.println("4. Latte");
        System.out.println("5. Frappuccino");
        System.out.println("6. Quit");
        System.out.println("================================================== ");

    }
    public void printMenuIceCoffee(){
        System.out.println("================================================== ");
        System.out.println("You have selected Ice Coffee. Please make a selection from the following menu:");
        System.out.println("1. Ice Amricano");
        System.out.println("2. Ice Latte");
        System.out.println("3. Ice White Mhoca");
        System.out.println("4. ice caramel macchiato");
        System.out.println("5. Ice V60");
        System.out.println("6. Quit");
        System.out.println("================================================== ");
    }
    public void printMenuSandwich(){
        System.out.println("================================================== ");
        System.out.println("You have selected Sandwich. Please make a selection from the following menu:");
        System.out.println("1. Egg Sandwich");
        System.out.println("2. Chese Sandwich");
        System.out.println("3. Tuna Sandwich");
        System.out.println("4. chiken Sandwich");
        System.out.println("5. Peanut Butter Sandwich ");
        System.out.println("6. Quit");
        System.out.println("================================================== ");
    }

    public void printMenuDessert(){
        System.out.println("================================================== ");
        System.out.println("You have selected Dessert. Please make a selection from the following menu:");
        System.out.println("1. Brownie");
        System.out.println("2. Cake");
        System.out.println("3. Cheesecake");
        System.out.println("4. Ice Cream");
        System.out.println("5. Cookies");
        System.out.println("6. Quit");
        System.out.println("================================================== ");
    }
    public void printMenuQuit(){
        System.out.println("================================================== ");
        System.out.println("Your Order is:" + TheOrder);
        System.out.println("Do you want any thing else ? :>");
        System.out.println("1. Yes ");
        System.out.println("2. NO ");
        System.out.println("================================================== ");
    }
    public void printAgine(){
        System.out.println("================================================== ");
        System.out.println("The number dosen't exist D: !!.\n try again ");
        System.out.println("Do you want any thing else ? :>\n 1. Yes \n 2. NO");
        System.out.println("================================================== ");
    }

}
