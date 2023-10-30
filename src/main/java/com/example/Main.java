package main.java.com.example;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){

        Hotel pitbull=new Hotel("AOLA");
        Room economyRoom = new Room (2, 420, false) ;
        Room deluxeRoom = new Room (2, 8700, false);
        Room theBestRoom = new Room (2, 1234321, false );
        ArrayList<Room> theBestList = new ArrayList<Room>();

        theBestList.add(economyRoom);
        theBestList.add(deluxeRoom);
        theBestList.add(theBestRoom);
        pitbull.setRoom(theBestList);

        System.out.println(pitbull.getName());
        System.out.println(economyRoom.getPrice());

        for (Room AK :theBestList){
            System.out.println(AK.getOccupancy());
            System.out.println(AK.getOccupied());
            System.out.println(AK.getPrice());
        }
        System.out.println("What's up");
    }

}



 
        

    
