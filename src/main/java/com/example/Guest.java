package main.java.com.example;

public class Guest extends Person {
    private int guestid;
    private boolean breakfast;
    
    public Guest(int age, String sex, double height, String name, double weight, int guestid, boolean breakfast) {
        super(age, sex, height, name, weight);
        //TODO Auto-generated constructor stub
        this.guestid=guestid;
        this.breakfast=false;
    }
    public int getGuestid(){
        return this.guestid;
    }
    public boolean getBreakfast(){
        return false;
    }
    public void setGuestid(int guestid){
        this.guestid=guestid;
    }
    public void setBreakfast(boolean breakfast){
        this.breakfast=breakfast;
    }
}