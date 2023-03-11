package model;

import java.time.LocalTime;

public class Ticket {
    Vehicle vehicle;
     LocalTime entryTime;
      Slot slot;
Ticket ticket;
    public Ticket(Vehicle vehicle, LocalTime entryTime, Slot slot) {
        this.vehicle = vehicle;
        this.entryTime = entryTime;
        this.slot = slot;
    }
       public Ticket(Vehicle vehicle){
        this.vehicle=vehicle;
       }
    public Ticket getTicket() {
        return this.ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Vehicle getVehicle() {
        return this.vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public LocalTime getEntryTime() {
        return this.entryTime;
    }

    public void setEntryTime(LocalTime entryTime) {
        this.entryTime = entryTime;
    }

    public Slot getSlot() {
        return this.slot;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }

    @Override
   public String toString(){
        return "Ticket no"+"\n"+this.vehicle.getVehicle()+" "+this.slot.getSlot()+" "+this.entryTime;
   }

}
