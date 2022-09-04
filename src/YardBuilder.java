public class YardBuilder {
    private boolean grass;
    private int width;
    private int height;
    private String color;

    public YardBuilder grass(final boolean grass){
        this.grass = grass;
        return this;
    }
    public YardBuilder width(final int width){
        this.width = width;
        return this;
    }
    public YardBuilder height(final int height){
        this.height = height;
        return this;
    }
    public YardBuilder color(final String color){
        this.color = color;
        return this;
    }

    public Yard build(){
        return new Yard(grass, width, height, color);
    }
}
