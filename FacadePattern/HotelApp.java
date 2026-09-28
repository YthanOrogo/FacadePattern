public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();
 
        frontDesk.pickUpVehicle("ABC-1234");
        frontDesk.cleanRoom(305);
        frontDesk.requestCart(2);
 
        System.out.println();
 
        frontDesk.checkIn(412, 3);
        System.out.println();
        frontDesk.checkOut(412, "XYZ-9876");
    }
}