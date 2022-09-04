public class HouseBuilder {
    private Kitchen kitchen;
    private DiningRoom diningRoom;
    private LivingRoom livingRoom;
    private RestRoom restRoom;
    private BedRoom bedRoom;
    private Yard yard;

    public HouseBuilder kitchen(final Kitchen kitchen){
        this.kitchen = kitchen;
        return this;
    }
    public HouseBuilder diningRoom(final DiningRoom diningRoom){
        this.diningRoom = diningRoom;
        return this;
    }
    public HouseBuilder livingRoom(final LivingRoom livingRoom){
        this.livingRoom = livingRoom;
        return this;
    }
    public HouseBuilder restRoom(final RestRoom restRoom){
        this.restRoom = restRoom;
        return this;
    }
    public HouseBuilder bedRoom(final BedRoom bedRoom){
        this.bedRoom = bedRoom;
        return this;
    }
    public HouseBuilder yard(final Yard yard){
        this.yard = yard;
        return this;
    }

    public House build(){
        return new House(kitchen, diningRoom, livingRoom, restRoom, bedRoom, yard);
    }
}
