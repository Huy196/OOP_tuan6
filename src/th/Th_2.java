package th;

public class Th_2 {
    private String name;
    private String engine;
    public static int numberOfCars;

    public Th_2(String name, String engine){
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
}
class Main_1{
    public static void main(String[] args) {
        Th_2 Car1 = new Th_2("Mazda","Skyactiv 3");
        System.out.println(Th_2.numberOfCars);
        Th_2 Car2 = new Th_2("Mazda","Skyactiv 6");
        System.out.println(Th_2.numberOfCars);
    }
}