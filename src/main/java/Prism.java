public class Prism implements Prinatable{

    Figure base;
    double h;

    public Prism(Figure base, double h) {
        if (base instanceof Circle) {
            throw new IllegalArgumentException("Base cannot be circle");
        }

        if (base.calculatePerimater() % 3 != 0) {
            throw  new IllegalArgumentException("Triangle is not Equilateral");
        }
        this.base = base;
        this.h = h;
    }

    public double calculateArea() {
        return 2 * base.area + base.calculatePerimater() * h;
    }

    public double calculateVolume() {
        return base.area * h;
    }

    @Override
    public void print() {
        System.out.println("h: " + h);
        System.out.println("Base area: " + base.area);
    }
}
