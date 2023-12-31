public class Care {
    private String name;
    private String temperture;
    private int price;

    public Care(String name, String temperture, int price) {
        this.name = name;
        this.temperture = temperture;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getTemperture() {
        return temperture;
    }

    public int getPrice() {
        return price;
    }
}

