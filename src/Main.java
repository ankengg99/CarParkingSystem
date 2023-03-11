import model.Bike;
import model.Car;
import model.Ticket;
import service.ParkingService;

public class Main {
    public static void main(String[] args) throws NullPointerException{
        ParkingService parking=new ParkingService();
        Car bmw=new Car("BMW","DL001","Black");
        Bike royal=new Bike("BUllet","DL002","white0");
        Ticket t1=parking.park(bmw);
        Ticket t2=parking.park(royal);
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){

        }
        parking.unparked(t1);
        parking.unparked(t2);
    }
}