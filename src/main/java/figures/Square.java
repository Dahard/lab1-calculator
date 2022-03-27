package figures;

public class Square extends Figure implements Prinatable {

    double a;

    public Square(double a) {

        if (a <= 0) {
            throw new IllegalArgumentException("Bad argument value");
        } else {
            this.a = a;
        }
    }

    @Override
    public void print() {
        System.out.println("a: " + this.a);
        System.out.println("Obwód kwadratu o podanych wymiarach wynosi: " + calculatePerimater());
        System.out.println("Pole powierzchni kwadratu o podanych wymiarach wynosi: " + calculateArea());
    }

    @Override
    double calculateArea() {
        return a * a;
    }

    @Override
    double calculatePerimater() {
        return a * 4;
    }
}
