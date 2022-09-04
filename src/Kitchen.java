public class Kitchen {
    private final boolean stove;
    private final boolean sink;
    private final int windows;
    private final boolean refrigerator;
    private final boolean oven;
    private final int width;
    private final int height;
    private final String color;

    public Kitchen(boolean stove, boolean sink, int windows, boolean refrigerator, boolean oven, int width, int height, String color){
        this.stove = stove;
        this.sink = sink;
        this.windows = windows;
        this.refrigerator = refrigerator;
        this.oven = oven;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public boolean isStove() {
        return stove;
    }

    public boolean isSink() {
        return sink;
    }

    public int getWindows() {
        return windows;
    }

    public boolean isRefrigerator() {
        return refrigerator;
    }

    public boolean isOven() {
        return oven;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public static KitchenBuilder builder() {
        return new KitchenBuilder();
    }

    @Override
    public String toString(){
        return "Kitchen:" +
                "\n Windows: " + this.windows +
                "\n Sink: " + this.sink +
                "\n Stove: " + this.stove +
                "\n Refrigerator: " + this.refrigerator +
                "\n Oven: " + this.oven +
                "\n Width: " + this.width +
                "\n Height: " + this.height +
                "\n Color: " + this.color;
    }
}
