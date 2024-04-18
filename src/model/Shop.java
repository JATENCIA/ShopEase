package model;

public class Shop implements Comparable<Shop> {

    private final double value;
    private final String description;

    public Shop(double value, String description) {
        this.value = value;
        this.description = description;
    }

    public double getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "value=" + value +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public int compareTo(Shop shop) {
        return Double.compare(this.getValue(), shop.getValue());
    }
}
