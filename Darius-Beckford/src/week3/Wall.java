package week3;

public class Wall {
    // private fields //
    private String material;
    private int width;
    private int height;

    // constructors //
    public Wall(String material, int width, int height) {
        this.material = material;
        this.width = width;
        this.height = height;
    }

    // getters //
    public String getMaterial() {
        return material;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }

    // setters //
    public void setMaterial(String material) {
        this.material = material;
    }
    public void setWidth(int width) {
        if (width <= 0) {
            System.out.println("Error! Enter a integer greater than zero");
        } else {
            this.width = width;
        }
    }
    public void setHeight(int height) {
        if (height <= 0) {
            System.out.println("Error! Enter a integer greater than zero");
        } else {
            this.height = height;
        }
    }
}
