package main.java.com.example;

public class Room { 
    private int occupancy;
    private double price;
    private boolean occupied;

    public Room (int occupancy, double price, boolean occupied){
        this.occupancy=occupancy;
        this.price=price;
        this.occupied=false;
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
}
