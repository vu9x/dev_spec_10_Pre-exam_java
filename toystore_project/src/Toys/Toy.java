package Toys;

public class Toy extends  Abs_Toy{

    private static int counter = 0;
    private int id;
    private String name;
    private double frequency;
    private int quantity;

    public Toy(String name, double frequency, int quantity) {
        this.id = ++counter;
        this.name = name;
        this.frequency = frequency;
        this.quantity = quantity;
    }


    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    @Override
    public double getFrequency() { return frequency;}
    public int getQuantity() {return quantity;}
    public void setQuantity(int quantity) {this.quantity = quantity;}

    public String toString() {
        return String.format("%d %s\n", this.getId(), this.getName());
    }
}
