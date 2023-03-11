package service;

import model.*;

import java.time.LocalTime;

public class ParkingService {
    SlotService slotService=SlotService.getInstance();
    Slot availableSlot=null;
   public Ticket park(Vehicle vehicle){

        if(vehicle instanceof Bike){
           availableSlot=slotService.findSlot("bike");
        }
        else if(vehicle instanceof Car){
            availableSlot=slotService.findSlot("car");
        }
        else if(vehicle instanceof Truck){
            availableSlot=slotService.findSlot("truck");
        }
        if(availableSlot!=null){
           availableSlot.setEmpty(false);
           Ticket ticket= new Ticket(vehicle,LocalTime.now(),availableSlot);
            System.out.println(ticket.toString());
            return ticket;
        }
       else
        System.out.println("Parking is full");
        return null;
    }
   public void unparked(Ticket ticket){
        Slot slot=ticket.getSlot();
        slot.setEmpty(true);
       LocalTime exitTime=LocalTime.now();
        Payment payment = new Payment(ticket.getEntryTime(), exitTime);
    }

}
