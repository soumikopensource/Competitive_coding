/*
Author: Shivangi Pandey                                                        Date:19 Sept,2020
*/


//The specs I need in my class to implement
abstract class TradingInfo {
    ShortPrice shortPrice;
    LongPrice longPrice;

    //constructor
    public TradingInfo(ShortPrice shortPrice, LongPrice longPrice) {
        this.shortPrice = shortPrice;
        this.longPrice = longPrice;
    }

    // methods that I need
    public void call() {
        System.out.println("Call  the price");
    }

    public void put() {
        System.out.println("Put the price");
    }
    // updating everytime the short and long price by setting it

    public void setShortPrice(ShortPrice shortPrice) {
        this.shortPrice = shortPrice;
    }

    public void setLongPrice(LongPrice longPrice) {
        this.longPrice = longPrice;
    }

    public abstract void show();
}
//Using Encapsulation to encapsulate the behaviours

    interface LongPrice{
        public void call();
        public void put();
    }
    interface ShortPrice{
        public void call();
        public void put();
    }

    class FirstMember implements LongPrice{
        public void call(){
            System.out.println("My price is....");
        }
        public void put(){
        System.out.println("Put the price");
        }

    }

class SecondMember implements LongPrice{
    public void call(){
        System.out.println("My price is....");
    }
    public void put(){
        System.out.println("Put the price");
    }

}

 class Admin implements ShortPrice{
    public void call(){
        //int callPrice=0;
        System.out.println("Reached the limit");
    }
    public void put(){
        //int putPrice=0;
        System.out.println("Put this price");
    }

}

//characters
class Billgates extends TradingInfo{
    public Billgates(ShortPrice shortPrice,LongPrice longPrice){
        super(shortPrice,longPrice);

    }

    public void show(){
        System.out.println("Billgates");
    }
}


//Put the orders simultaneously

class PlaceOrders extends Thread{
    public void order(){
        try{
            int price=0;

            System.out.println ("Thread " + Thread.currentThread().getId() + " is running");

        }
        catch(Exception e){
            //Throwing an exception
            System.out.println("Exception is there");
        }
    }


}


public class Trade {
    public static void main(String[] args) {

        System.out.println("*****************My Trading****************");

        //Let's make some behaviour
        LongPrice price1=new FirstMember() ;
        LongPrice price2=new SecondMember();
        ShortPrice price3=new Admin();
        ShortPrice price4=new Admin();

        //Make a person
        TradingInfo ShivangiCall=new Billgates(price3,price1);
        ShivangiCall.call();
        ShivangiCall.put();

        ShivangiCall.setShortPrice(ShivangiCall.shortPrice);
        ShivangiCall.setLongPrice(ShivangiCall.longPrice);

        //number of threads
        int numberOfThreads=5;
        for(int i=0;i<numberOfThreads;++i){
            PlaceOrders obj=new PlaceOrders();
            obj.start();
        }

    }
}
