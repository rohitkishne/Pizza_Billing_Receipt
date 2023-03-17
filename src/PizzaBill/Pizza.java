package PizzaBill;

public class Pizza {

    public int cheesePrice;

    public int basePrice;

    public int toppingsPrice;

    public int paperBagPrice;

    public String bill;

    public int totalPrice;

    boolean isCheeseAdded;
    boolean isToppingsAdded;

    boolean isPaperBagAdded;

    boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        if(isVeg){
            basePrice = 300;
            toppingsPrice = 70;
        }else{
            //non veg case
            basePrice = 400;
            toppingsPrice = 120;
        }
        paperBagPrice = 20;
        cheesePrice = 80;

        isCheeseAdded = false;
        isToppingsAdded = false;
        isPaperBagAdded = false;


        totalPrice = basePrice;
        bill = "Base Price Of The Pizza: "+basePrice + "\n";

    }

    public int getPrice(){
        return totalPrice;
    }

    public void addExtraCheese(){

        if(isCheeseAdded==false){
            totalPrice = totalPrice + cheesePrice;
            isCheeseAdded= true; //So to prevent it from adding again
        }
    }

    public void addExtraToppings(){

        if(isToppingsAdded==false){
            totalPrice = totalPrice + toppingsPrice;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        if(isPaperBagAdded==false){
            totalPrice = totalPrice + paperBagPrice;
            isPaperBagAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated==false){


            if(isCheeseAdded==true){
                bill = bill + "Extra Cheese Added: "+cheesePrice + "\n";
            }
            if(isToppingsAdded==true){
                bill = bill + "Extra Toppings Added: "+toppingsPrice + "\n";
            }
            if(isPaperBagAdded==true){
                bill = bill + "Paperbag Added: "+paperBagPrice + "\n";
            }

            bill = bill + "Total Price: "+totalPrice + "\n";

            isBillGenerated = true;
        }
        return bill;
    }
}
