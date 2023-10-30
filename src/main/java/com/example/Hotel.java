package main.java.com.example;

import java.util.ArrayList;

public class Hotel {
    private String name;
    private ArrayList<Room> roomList;

    public Hotel(String name) {
        this.name = name;
        this.roomList = new ArrayList<Room>();
    }

    // book method
    public String getName() {
        return this.name;
    }

    public ArrayList<Room> getList() {
        return this.roomList;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setRoom(ArrayList<Room> room) {
        this.roomList = room;
    }

    public boolean book(int noOfPeople, double budget){
        ArrayList<Room> availableRooms = new ArrayList<Room>();
        for(Room room : this.roomList){
            if (room.getOccupied()==false){
                availableRooms.add(room);
            }
        }
        for(int i =0; i < availableRooms.size(); i++) {
            for (int j=0; j < availableRooms.size()-i; j++){
                if(availableRooms.get(j).getPrice() > availableRooms.get(j+1).getPrice()){
                    Room temp = availableRooms.get(j);
                    availableRooms.set(j, availableRooms.get(j+1));
                    availableRooms.set(j+1, temp);
                }

            }
        
        }
        ArrayList<Room> roomsForBooking = new ArrayList<Room>();
        int peopleAccomodated=0;
        for (Room room:availableRooms){
            if (peopleAccomodated<noOfPeople){
                roomsForBooking.add(room);
                peopleAccomodated=peopleAccomodated+room.getOccupancy();
            }
        }
        //check all the conditions where booking is not possible
        //if any condition not possible, then return false
        if (peopleAccomodated < noOfPeople){
            return false;
        }
        double totalCost = 0;
        for (Room room: roomsForBooking){
            totalCost=totalCost+room.getPrice();
        }
        if (totalCost>budget){
            return false;
        }
        for (Room room: roomsForBooking){
            room.setOccupied(true);
        }
        //loop over the rooms in roomsForBooking and set each room to occupied

        return true;
        
}

}