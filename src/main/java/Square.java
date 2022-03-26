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
