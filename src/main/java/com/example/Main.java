package main.java.com.example;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Employee brad = new Employee(69, 12345678, 1, "Male", 180, "Brad", 70, "manager");
        Employee hogan = new Employee(80, 87654321, 1, "Female", 150, "Hogan", 95, "worker");
        Employee michael = new Employee(10, 98765432, 1, "Male", 179, "Michael", 65, "worker");

        Guest bread =new Guest(69, "Male", 160, "Brad", 80, 12345678, true );
        Guest lake =new Guest(3, "Male", 179, "Lake", 69, 87654321, false);
        Hotel pitbull=new Hotel("AOLA");
        Room economyRoom = new Room (2, 420, false) ;
        
        Room deluxeRoom = new Room (2, 8700, false);
        Room theBestRoom = new Room (2, 1234321, false);
        ArrayList<Room> theBestList = new ArrayList<Room>();
        pitbull.addEmployee(brad);
        pitbull.addEmployee(hogan);
        pitbull.addEmployee(michael);
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



 
        

    
