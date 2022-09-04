public class KitchenBuilder {
    private boolean stove;
    private boolean sink;
    private int windows = 2;
    private boolean refrigerator;
    private boolean oven;
    private int width;
    private int height;
    private String color;

    public KitchenBuilder stove(final boolean stove){
        this.stove = stove;
        return this;
    }

    public KitchenBuilder sink(final boolean sink){
        this.sink = sink;
        return this;
    }
    public KitchenBuilder windows(final int windows){
        this.windows = windows;
        return this;
    }
    public KitchenBuilder refrigerator(final boolean refrigerator){
        this.refrigerator = refrigerator;
        return this;
    }
    public KitchenBuilder oven(final boolean oven){
        this.oven = oven;
        return this;
    }
    public KitchenBuilder width(final int width){
        this.width = width;
        return this;
    }
    public KitchenBuilder height(final int height){
        this.height = height;
        return this;
    }
    public KitchenBuilder color(final String color){
        this.color = color;
        return this;
    }

    public Kitchen build(){
        return new Kitchen(stove, sink, windows, refrigerator, oven, width, height, color);
    }
    public static KitchenBuilder builder(){
        return new KitchenBuilder();
    //checar static? pq era asi
    }
}
