package com.company;
package machine;

import java.util.*;
public class CoffeeMachine
{
    static void CurrentValue(int water,int beans,int milk,int money,int cups){
        int waterIn = water;
        int beansIn=beans;
        int milkIn = milk;
        int moneyIn = money;
        int cupsIn = cups;
        System.out.println("The coffee machine has:");
        System.out.println(waterIn + " " + "of water");
        System.out.println(milkIn + " " + " of milk");
        System.out.println(beansIn + " " + "of coffee beans");
        System.out.println(cupsIn + " " + "of disposable cups");
        System.out.println("$"+moneyIn + " " + "of money");
    }

    public static void main(String[] args) {
        int waterIn = 400;
        int beansIn=120;
        int milkIn = 540;
        int moneyIn = 550;
        int cupsIn = 9;
        HashMap<String,Integer> machine = new HashMap<String, Integer>();

        machine.put("Water",waterIn);
        machine.put("Beans",beansIn);
        machine.put("Milk",milkIn);
        machine.put("Money",moneyIn);
        machine.put("Cups",cupsIn);
        int water = machine.get("Water");
        int beans = machine.get("Beans");
        int cups = machine.get("Cups");
        int milk = machine.get("Milk");
        int money = machine.get("Money");
        Scanner scanner = new Scanner(System.in);
        String buyingOption = " ";
        String action = " ";
        while(!action.equals("exit")){
            System.out.println("Write action (buy, fill, take, remaining , exit): ");
            action = scanner.next();

            if(action.equals("remaining")){
                CurrentValue(water,beans,milk,money,cups);

            }
            else if(action.equals("buy")){

                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                buyingOption = scanner.next();
                if(buyingOption.equals("1")){

                    if(water < 250){
                        System.out.println("Sorry, not enough water!");
                    }
                    else if (beans<16){
                        System.out.println("Sorry, not enough coffee beans!");
                    }else if (cups<1){
                        System.out.println("Sorry, not enough disposable cups!");
                    }
                    else{
                        water -=250;
                        beans -=16;
                        cups -=1;
                        money+=4;
                        System.out.println("I have enough resources, making you a coffee!");
                    }

                }else if(buyingOption.equals("2")){
                    if(water < 350){
                        System.out.println("Sorry, not enough water!");
                    }
                    else if (beans<20){
                        System.out.println("Sorry, not enough coffee beans!");
                    }else if (cups<1){
                        System.out.println("Sorry, not enough disposable cups!");
                    }else if (milk<75){
                        System.out.println("Sorry, not enough milk!");
                    }
                    else{
                        water -=350;
                        beans -=20;
                        cups -=1;
                        milk -= 75;
                        money+=7;
                        System.out.println("I have enough resources, making you a coffee!");
                    }

                }else if(buyingOption.equals("3")){


                    if(water < 200){
                        System.out.println("Sorry, not enough water!");
                    }
                    else if (beans<12){
                        System.out.println("Sorry, not enough coffee beans!");
                    }else if (cups<1){
                        System.out.println("Sorry, not enough disposable cups!");
                    }else if (milk<100){
                        System.out.println("Sorry, not enough milk!");
                    }
                    else{
                        water -=200;
                        beans -=12;
                        cups -=1;
                        milk -= 100;
                        money+=6;
                        System.out.println("I have enough resources, making you a coffee!");
                    }


                }else if (buyingOption.equals("back")){

                }
            }else if(action.equals("exit")){
                System.exit(0);
            }else if(action.equals("fill")){
                System.out.println("Write how many ml of water do you want to add: ");
                water += scanner.nextInt();
                System.out.println("Write how many ml of milk do you want to add: ");
                milk += scanner.nextInt();
                System.out.println("Write how many grams of coffee beans do you want to add: ");
                beans += scanner.nextInt();
                System.out.println("Write how many disposable cups of coffee do you want to add: ");
                cups += scanner.nextInt();
            }else if (action.equals("take")){
                System.out.println("i gave you $"+money);
                money =0;
            }
        }
    }
}