//10-Write a Java class, Flower, that has three instance variables of type String, int, and float,
// which respectively represent the name of the flower, its number of petals, and price.
// Your class must include a constructor method that initializes each variable to an appropriate value,
// and your class should include methods for setting the value of each type, and getting the value of each type.
public class Flower {
    private String name;
    private int numberOfPetals;
    private float price;

    public Flower(String name, int numberOfPetals, float price) {
        this.name = name;
        this.numberOfPetals = numberOfPetals;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfPetals(int numberOfPetals) {
        this.numberOfPetals = numberOfPetals;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfPetals() {
        return numberOfPetals;
    }

    public float getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Flower rose = new Flower("Zainab Hussein", 20, 7.99f);
        System.out.println("Name: " + rose.getName());
        System.out.println("Number of Petals: " + rose.getNumberOfPetals());
        System.out.println("Price: $" + rose.getPrice());

        rose.setPrice(3.49f);
        System.out.println("Updated Price: $" + rose.getPrice());
    }
}
