package main.java.com.example;
import java.util.ArrayList;

public class Room { 
    private int occupancy;
    private double price;
    private boolean occupied;
    private ArrayList <Guest> guestList;

    public Room (int occupancy, double price, boolean occupied){
        this.occupancy=occupancy;
        this.price=price;
        this.occupied=false;
        this.guestList=new ArrayList<Guest>();
    }
    
   public int getOccupancy(){
        return this.occupancy;
    }   
    public double getPrice(){
        return this.price;
    }
    public boolean getOccupied(){
        return this.occupied;
    }
    public void setOccupancy(int occupancy){
        this.occupancy=occupancy;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void setOccupied(boolean occupied){
        this.occupied=occupied;
    }
    public void addGuest(Guest guest){
        this.guestList.add(guest);
    }
    public void removeGuest(Guest guest){
        this.guestList.remove(guest);
    }
    public ArrayList<Guest>getGuests(){
        return this.guestList;
    }

}
