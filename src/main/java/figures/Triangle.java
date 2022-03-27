package figures;

public class Triangle extends Figure implements Prinatable {

    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {

        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Bad argument value");
        } else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    @Override
    public void print() {
        System.out.println("a: " + this.a);
        System.out.println("b: " + this.b);
        System.out.println("c: " + this.c);
        System.out.println("Obwód trójkąta o podanych wymiarach wynosi: " + calculatePerimater());
        System.out.println("Pole powierzchni trójkąta o podanych wymiarach wynosi: " + calculateArea());
    }

    @Override
    double calculateArea() {
        double p = calculatePerimater();
        return Math.sqrt((p - this.a) * (p - this.b) * (p - this.c) * p);
    }

    @Override
    double calculatePerimater() {
        return a + b + c;
    }
}
