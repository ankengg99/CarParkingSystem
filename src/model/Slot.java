package model;

public class Slot {

    String slot;

    boolean isEmpty;

    public Slot(String slot, boolean isEmpty) {
        this.slot = slot;
        this.isEmpty = isEmpty;
    }

    public String getSlot() {
        return this.slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }



    public boolean isEmpty() {
        return this.isEmpty;
    }

    public void setEmpty(boolean empty) {
        this.isEmpty = empty;
    }
}
