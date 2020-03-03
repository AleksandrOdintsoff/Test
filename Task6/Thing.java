package Task6;

public class Thing {
    private String name;
    private int weight;
    private int value;

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }

    public Thing (String name, int weight, int value) {
       this.name = name;
       this.weight = weight;
       this.value = value;
    }
}
