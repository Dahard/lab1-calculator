package figures;

public class Circle extends Figure implements Prinatable {

    double r;

    public Circle(double r) {
        if (r <= 0) {
                throw new IllegalArgumentException("Błędny argument");
        } else {
            this.r = r;
        }
    }

    @Override
    public void print() {
        System.out.println("r: " + this.r);
        System.out.println("Obwód okręgu o podanych wymiarach wynosi: " + calculatePerimater());
        System.out.println("Pole powierzchni okręgu o podanych wymiarach wynosi: " + calculateArea());
    }

    @Override
    double calculateArea() {
        return Math.PI * r * r;
    }

    @Override
    double calculatePerimater() {
        return 2 * Math.PI * r;
    }
}
