package ShoppingCart;

import java.text.DecimalFormat;

public class MakeReceipt {

    public static ShoppingCart shoppingCart = new ShoppingCart();
    ChoiceFromUser choice = new ChoiceFromUser();
    public static String isImported;
    public static double taxCosts =0;
    public static double totalCost=0;


    //Prepares Receipt Details to print them to Console.
    public static void getReceipt(){

        System.out.println("Your Shopping Receipt" + "\n"
                           + "-----------------------------");

        for (int i = 0; i < shoppingCart.goodNamesList.size(); i++) {

            taxCosts += shoppingCart.taxCostsList.get(i);
            totalCost += shoppingCart.costLists.get(i) + shoppingCart.taxCostsList.get(i) ;

            System.out.println(shoppingCart.goodAmountsList.get(i)  + " " + shoppingCart.goodNamesList.get(i) + " at "
                    + shoppingCart.unitCostsList.get(i) + " = " + (shoppingCart.costLists.get(i) +  shoppingCart.taxCostsList.get(i)));
        }



        String taxcost= String.format("%.2f",taxCosts);
        String totalCosts= String.format("%.2f",totalCost);

        System.out.println("Sales Taxes: " + taxcost);
        System.out.println("Total: " + totalCosts);

    }


}
