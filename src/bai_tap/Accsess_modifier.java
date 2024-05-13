package bai_tap;

public class Accsess_modifier {
    private double radius;
    private String Color;

    public Accsess_modifier(double radius, String Color) {
        this.radius = radius;
        this.Color = Color;
    }

    public double Accsess_modifier(double radius) {
        return radius = 0;
    }

    public double getRadius() {
        return radius = 3;
    }

    public double getArea() {
        return radius = 5;
    }

    public static void main(String[] args) {
        Accsess_modifier accsessModifier = new Accsess_modifier(1.0,"Red");
        System.out.println(accsessModifier.getArea());
        System.out.println(accsessModifier.getRadius());
    }

}
