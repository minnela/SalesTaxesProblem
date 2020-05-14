package ShoppingCart;

import Goods.Food;
import Goods.Good;

import java.util.Scanner;

public class ChoiceFromUser {

    public static ShoppingCart shoppingCart = new ShoppingCart();
    public static MakeReceipt makeReceipt = new MakeReceipt();
    public static Selection selection = new Selection();
    public static int choice;
    public static int amount;
    public static boolean isImported =false;
    public static Scanner input = new Scanner(System.in);
    public static Scanner input2 = new Scanner(System.in);



    //Takes shopping inputs from user.
    public static void makeChoice(){

        do{
            System.out.println("Please, select a number for the products, and 0 for exit:" + "\n" +
                    "1 - Chocolate at  " + selection.getUnitPriceOfGood(1) + "\n" +
                    "2 - Book at " + selection.getUnitPriceOfGood(2)+ "\n" +
                    "3 - Headache Pill at " + selection.getUnitPriceOfGood(3) + "\n" +
                    "4 - Perfume at " + selection.getUnitPriceOfGood(4)+ "\n" +
                    "5 - Music CD at " + selection.getUnitPriceOfGood(5) +"\n" +
                    "0 - Exit");
            choice = input.nextInt();
            if(choice!=0) {
                if(choice==1){
                    chocolatePage();
                }
                if(choice == 4){
                    perfumePage();
                }
                if(choice!=0) {
                    if(choice==10){
                        continue;
                    }else {
                        System.out.println("How much do you want the product? Please Enter");
                        amount = input.nextInt();
                        addToShoppingCart(choice, amount, isImported); //Creating shopping list with product choice, amount and if it is imported or no.
                    }
                }
            }
        }while(choice!=0);
    }

    //Adds products to shopping cart.
    public static void addToShoppingCart(int choice, int amount, boolean isImported){

            shoppingCart.addToShoppingCart(choice, amount, isImported);

    }

    //Gets Receipt.
    public static void getReceipt(){
        makeChoice();
        makeReceipt.getReceipt();

    }

    public static void chocolatePage(){

            System.out.println("Please, select a number for the preferred chocolate, Or enter 10 for Go Back and 0 for exit:" + "\n" +
                    "1 - Chocolate Bar at " + selection.getUnitPriceOfGood(1) + "\n" +
                    "6 - Imported Box Of Chocolates at " + selection.getUnitPriceOfGood(6)+ "\n" +
                    "7 - A box contains imported chocolates at " + selection.getUnitPriceOfGood(7)+ "\n" +
                    "10 - Go Back" + "\n" +
                    "0 - Exit");
            choice= input2.nextInt();
            if(choice!=1 && choice!=6 && choice!=7 && choice!=10){
                System.out.println("Please enter 1 - 6 or 7 for chocolate. Or enter 10 for Go Back");

            }else{
                if(choice==6||choice==7){
                    isImported=true;
                }else{
                    isImported=false;
                }
            }

    }
    public static void perfumePage(){
            System.out.println("Please, select a number for the preferred perfume, Or enter 10 for Go Back and 0 for exit:" + "\n" +
                    "4 - Bottle of Perfume at " + selection.getUnitPriceOfGood(4) + "\n" +
                    "8 - Imported Bottle of Perfume at " + selection.getUnitPriceOfGood(8)+ "\n" +
                    "9 - Imported Bottle of Perfume at " + selection.getUnitPriceOfGood(9) +"\n" +
                    "10 - Go Back" + "\n" +
                    "0 - Exit");

            choice= input.nextInt();

        if(choice!=4 && choice!=8 && choice!=9 && choice!=10) {
            System.out.println("Please enter 4 - 8 or 9 for perfume. Or enter 10 for Go Back");
        } else  if(choice==8||choice==9){
                isImported=true;
            }else{
                isImported=false;
            }

    }

}
