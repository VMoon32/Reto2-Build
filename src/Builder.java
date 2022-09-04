public class Builder {
        public static void main(String []args){
                House house = new HouseBuilder()
                        .kitchen(Kitchen.builder()
                                .stove(true)
                                .sink(true)
                                .windows(1)
                                .refrigerator(true)
                                .oven(false)
                                .width(3)
                                .height(4)
                                .color("red")
                                .build())
                        .diningRoom(DiningRoom.builder()
                                .windows(2)
                                .tv(false)
                                .width(5)
                                .height(5)
                                .color("white")
                                .chairCapacity(8)
                                .build())
                        .bedRoom(BedRoom.builder()
                                .bedSize(BedSize.queen)
                                .tv(false)
                                .width(5)
                                .height(5)
                                .color("blue")
                                .build())
                        .build();
        }
}