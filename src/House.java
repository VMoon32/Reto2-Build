public class House {
    private final Kitchen kitchen;
    private final DiningRoom diningRoom;
    private final LivingRoom livingRoom;
    private RestRoom []restRooms = new RestRoom[5];
    private BedRoom []bedRooms = new BedRoom[5];
    private final Yard yard;

    private int nBedRooms = 0;
    private int nRestRooms = 0;

    public House(Kitchen kitchen, DiningRoom diningRoom, LivingRoom livingRoom, RestRoom restRoom, BedRoom bedRoom, Yard yard){
        this.kitchen = kitchen;
        this.diningRoom = diningRoom;
        this.livingRoom = livingRoom;
        this.addRoom(bedRoom);
        this.addRoom(restRoom);
        this.yard = yard;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public DiningRoom getDiningRoom() {
        return diningRoom;
    }

    public LivingRoom getLivingRoom() {
        return livingRoom;
    }

    public RestRoom[] getRestRooms() {
        return restRooms;
    }

    public BedRoom[] getBedRooms() {
        return bedRooms;
    }

    public Yard getYard() {
        return yard;
    }
    //SE PUEDE HACER UNO? ->
    public void addRoom(BedRoom bedRoom){
        if(this.nBedRooms<5){
            this.bedRooms[this.nBedRooms++] = bedRoom;
        }
        else{
            throw new RuntimeException("Can not manage any more bedrooms");
        }
    }

    public void addRoom(RestRoom restRoom){
        if(this.nRestRooms<5){
            this.restRooms[this.nRestRooms++] = restRoom;
        }
        else{
            throw new RuntimeException("Can not manage any more restrooms");
        }
    }
    //ESTE <-
}

