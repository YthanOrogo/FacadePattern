public class FrontDesk {
    private final Valet valet;
    private final HouseKeeping houseKeeping;
    private final Cart cart;

    public FrontDesk() {
        this.valet = new Valet();
        this.houseKeeping = new HouseKeeping();
        this.cart = new Cart();
    }

    public void pickUpVehicle(String plateNumber) {
        valet.pickUpVehicle(plateNumber);
    }

    public void cleanRoom(int roomNumber) {
        houseKeeping.cleanRoom(roomNumber);
    }

    public void requestCart(int numberOfCarts) {
        cart.requestCart(numberOfCarts);
    }

    public void checkIn(int roomNumber, int numberOfCarts) {
        System.out.println("--- Check-in: Room " + roomNumber + " ---");
        requestCart(numberOfCarts);
        cleanRoom(roomNumber);
    }

    public void checkOut(int roomNumber, String plateNumber) {
        System.out.println("--- Check-out: Room " + roomNumber + " ---");
        pickUpVehicle(plateNumber);
        cleanRoom(roomNumber);
    }
}