public class Yard {
    private final boolean grass;
    private final int width;
    private final int height;
    private final String color;

    public Yard(boolean grass, int width, int height, String color){
        this.grass = grass;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public boolean isGrass() {
        return grass;
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
}
