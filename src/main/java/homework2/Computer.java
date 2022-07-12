package homework2;

public class Computer {
    private String brand;
    private int screenSize;
    private int numberOfCores;
    private String type;

    public Computer(String brand, int screenSize) {
        this.brand = brand;
        this.screenSize = screenSize;
    }

    public Computer(String brand, int screenSize, int numberOfCores, String type) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.numberOfCores = numberOfCores;
        this.type = type;
    }

    public int getScreenSize(){
        return screenSize;
    }

    public static void main(String[] args) {
        Computer workComputer = new Computer("MacBook", 15, 5, "laptop");
        Computer personalComputer = new Computer("Samsung", 2);
    }
}