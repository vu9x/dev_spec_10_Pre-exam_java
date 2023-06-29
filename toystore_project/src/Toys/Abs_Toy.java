public abstract class Abs_Toy implements Comparable<Abs_Toy>{
    private int id;
    private String name;
    private double frequency;

    public abstract double getFrequency();

    @Override
    public int compareTo(Abs_Toy o){
        return Double.compare(o.getFrequency(), getFrequency());
    }
}
