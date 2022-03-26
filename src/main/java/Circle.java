public class Circle extends Figure implements Prinatable {

    double r;

    public Circle(double r) {
        if (r <= 0) {
                throw new IllegalArgumentException("Bad argument value");
        } else {
            this.r = r;
        }
    }

    @Override
    public void print() {
        System.out.println("r: " + this.r);
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
