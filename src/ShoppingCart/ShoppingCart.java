package ShoppingCart;

import Goods.*;
import Main.Context;
import Main.Strategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    public static Context context;
    public static ArrayList<Integer> goodAmountsList = new ArrayList<>();
    public static ArrayList<String> goodNamesList = new ArrayList<>();
    public static ArrayList<Double> unitCostsList = new ArrayList<>();
    public static ArrayList<Double> costLists = new ArrayList<>();
    public static ArrayList<Double> taxCostsList = new ArrayList<>();
    public static ArrayList<Boolean> isImportedList = new ArrayList<>();
    public static Good good;
    public static String goodName;
    public static double unitcost;
    public static double  cost =0;
    public static double  taxCost =0;

    public ShoppingCart(){
    }

    //Creates Shopping Cart looking choosen product name and choosen product type (imported or domestic).
    public static void addToShoppingCart(int choice, int amount, boolean isImported){
        switch (choice){
            case 1: case 6: case 7: good = new Food(choice);
                context =  new Context(new Food(choice));
                goodName = good.getGoodName();
                unitcost = good.getUnitPrice();
                cost = context.executePriceStrategy(amount);
                taxCost = context.executeTaxStrategy(amount,isImported);
                break;
            case 2:
                good = new Book();
                context =  new Context(new Book());
                goodName = good.getGoodName();
                unitcost = good.getUnitPrice();
                cost = context.executePriceStrategy(amount);
                taxCost = context.executeTaxStrategy(amount,isImported);
                break;
            case 3:
                good = new Medical();
                context =  new Context(new Medical());
                goodName = good.getGoodName();
                unitcost = good.getUnitPrice();
                cost = context.executePriceStrategy(amount);
                taxCost = context.executeTaxStrategy(amount,isImported);
                break;
            case 4: case 8: case 9:
                good = new Cosmetic(choice);
                context =  new Context(new Cosmetic(choice));
                goodName = good.getGoodName();
                unitcost = good.getUnitPrice();
                cost = context.executePriceStrategy(amount);
                taxCost = context.executeTaxStrategy(amount,isImported);
                break;
            case 5:
                good = new Digital();
                context =  new Context(new Digital());
                goodName = good.getGoodName();
                unitcost = good.getUnitPrice();
                cost = context.executePriceStrategy(amount);
                taxCost = context.executeTaxStrategy(amount,isImported);
                break;
            default:
                System.out.println("Wrong choice.. Please enter a valid number :)");
                break;
        }

        goodNamesList.add(goodName);
        goodAmountsList.add(amount);
        unitCostsList.add(unitcost);
        costLists.add(cost);
        taxCostsList.add(taxCost);
        isImportedList.add(isImported);

    }

}



