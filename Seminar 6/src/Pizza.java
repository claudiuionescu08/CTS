public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                '}';
    }
}