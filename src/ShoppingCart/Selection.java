package ShoppingCart;

import Goods.Book;
import Goods.*;


public class Selection {

    public static Good good = new Good();

    //When the screen is opened and asked what the user wants, it brings the price catalog of the products.
    public static double getUnitPriceOfGood(int num){
        switch(num){
            case 1: case 6: case 7:
                good = new Food(num);
                return good.getUnitPrice();
            case 2:
                good = new Book();
                return good.getUnitPrice();
            case 3:
                good = new Medical();
                return good.getUnitPrice();
            case 4: case 8: case 9:
                good = new Cosmetic(num);
                return good.getUnitPrice();
            case 5:
                good = new Digital();
                return good.getUnitPrice();
            default:
                return 0;


        }





    }


}
