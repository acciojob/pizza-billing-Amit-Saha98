package com.driver;

public class Pizza {

    private int price;
    private int cheeseRate;
    private int toppingRate;
    private int bagRate;

    //flags
    private boolean isCheese;
    private boolean isTopping;
    private boolean isBag;
    private boolean isBill;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isBag =false;
        this.isCheese = false;
        this.isTopping = false;
        this.bagRate = 20;
        this.cheeseRate = 80;
        this.isBill = false;
        if(isVeg){
            this.price=300;
            this.toppingRate=70;
        }
        else{
            this.price=400;
            this.toppingRate=120;
        }
        this.isVeg = isVeg;
        // your code goes here
        this.bill = "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheese){
            this.price+=cheeseRate;
            isCheese=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isTopping){
            this.price+=toppingRate;
            isTopping=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isBag){
            this.price=this.price+this.bagRate;
            isBag=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBill){
            isBill=true;
            if(isCheese)this.bill =this.bill+"Extra Cheese Added: "+cheeseRate+"\n";
            if(isTopping)this.bill=this.bill+"Extra Toppings Added: "+toppingRate+"\n";
            if(isBag)this.bill=this.bill+"Paperbag Added: "+bagRate+"\n";
            this.bill=this.bill+"Total Price: "+price+"\n";
        }
        return this.bill;
    }
}
