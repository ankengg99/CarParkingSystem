package service;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class SlotService {
    List<Slot> bike,car,truck;
    static SlotService instance;


        public static SlotService getInstance () {
        if (instance == null) {
            instance = new SlotService();
            return instance;
        }
        return instance;
    }

    public SlotService() {
        this.bike =new ArrayList<>();
        this.car = new ArrayList<>();
        this.truck = new ArrayList<>();
            for(int i=0; i<9; i++){
                bike.add(new Slot("b"+i,true));
            }
            for(int i=0; i<6; i++){
                car.add(new Slot("c"+i,true));
            }
            for(int i=0; i<4; i++){
                truck.add(new Slot("t"+i,true));
            }
    }

    public Slot findSlot(String type){
        if(type.equals("bike")){
            for(Slot slot:bike){
                if(slot.isEmpty()){
                    return slot;
                }
            }
        }
        if(type.equals("car")){
            for(Slot slot:car){
                if(slot.isEmpty()){
                    return slot;
                }
            }
        }
        if(type.equals("truck")){
            for(Slot slot:truck){
                if(slot.isEmpty()){
                    return slot;
                }
            }
        }
        return null;
    }
}
