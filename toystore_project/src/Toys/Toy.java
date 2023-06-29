package Toys;

public class Toy extends  Abs_Toy{

    private static int counter = 0;
    private int id;
    private String name;
    private double frequency;

    public Toy(String name, double frequency) {
        this.id = ++counter;
        this.name = name;
        this.frequency = frequency;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(Double frequency) {
        this.frequency = frequency;
    }

    public String toString() {
        return String.format("%d %s\n", this.getId(), this.getName());
    }
}
