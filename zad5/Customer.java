/*
POJ, lab5, zadanie 5
Adrian Szostak, s19777
Damian Eggert, s19766
*/

public class Customer {

    private int ID, discount;
    private String name;

    public Customer(int ID, String name, int discount){
        this.ID = ID;
        this.name = name;
        this.discount = discount;
    }

    public int getID(){
        return ID;
    }

    public String getName(){
        return name;
    }

    public int getDiscount(){
        return discount;
    }

    public void setDiscount(int newDiscount){
        discount = newDiscount;
    }

    @Override
    public String toString(){
        return name+"("+ID+")";
    }
}
