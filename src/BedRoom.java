public class BedRoom {
    private final BedSize bedSize;
    private final boolean tv;
    private final int width;
    private final int height;
    private final String color;

    public BedRoom(BedSize bedSize, boolean tv, String color, int height, int width) {
        this.bedSize = bedSize;
        this.tv = tv;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public BedSize getBedSize() {
        return bedSize;
    }

    public boolean isTv() {
        return tv;
    }

    public String getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "BedRoom" +
                "\n Bed Size:" + this.bedSize +
                "\n TV:" + this.tv +
                "\n Color" + this.color +
                "\n Height" + this.height +
                "\n Width" + this.width;
    }

    public static BedRoomBuilder builder() {
        return new BedRoomBuilder();
    }
}
