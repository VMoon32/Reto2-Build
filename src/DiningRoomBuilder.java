public class DiningRoomBuilder {
    private int windows;
    private boolean tv;
    private int width;
    private int height;
    private String color;
    private int chairCapacity;

    public DiningRoomBuilder windows(final int windows){
        this.windows = windows;
        return this;
    }

    public DiningRoomBuilder tv(final boolean tv){
        this.tv = tv;
        return this;
    }

    public DiningRoomBuilder width(final int width){
        this.width = width;
        return this;
    }

    public DiningRoomBuilder height(final int height){
        this.height = height;
        return this;
    }

    public DiningRoomBuilder color(final String color){
        this.color = color;
        return this;
    }

    public DiningRoomBuilder chairCapacity(final int chairCapacity){
        this.chairCapacity = chairCapacity;
        return this;
    }

    public DiningRoom build(){
        return new DiningRoom(windows, tv, width, height, color, chairCapacity);
    }
}
