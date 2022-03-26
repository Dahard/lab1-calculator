import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isOn = true;
        Triangle triangleBase;
        Circle circleBase;
        Square squareBase;
        Prism userPrism = null;
        double a;
        double b;
        double c;
        double r;
        double h;
        int userChoice;

        do {
            System.out.println("Witaj w kalkulatorze pól i obwodów figur. Aby rozpocząć wybierz jedną z dostępnych figur:");
            System.out.println("Trójkąt - Wpisz '1'");
            System.out.println("Okrąg - Wpisz '2'");
            System.out.println("Kwadrat - Wpisz '3'");
            System.out.println("Graniastosłup prawidłowy - Wpisz '4'");

            userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.println("Podaj długości trzech boków trójkąta.");
                    System.out.print("a: ");
                    a = scanner.nextDouble();
                    System.out.print("b: ");
                    b = scanner.nextDouble();
                    System.out.print("c: ");
                    c = scanner.nextDouble();
                    Triangle userTriangle = new Triangle(a, b, c);
                    userTriangle.print();
                    System.out.println("Obwód trójkąta o podanych wymiarach wynosi: " + userTriangle.calculatePerimater());
                    System.out.println("Pole powierzchni trójkąta o podanych wymiarach wynosi: " + userTriangle.calculateArea());
                    break;
                case 2:
                    System.out.println("Podaj długość promienia okręgu.");
                    System.out.print("r: ");
                    r = scanner.nextDouble();
                    Circle userCircle = new Circle(r);
                    userCircle.print();
                    System.out.println("Obwód okręgu o podanych wymiarach wynosi: " + userCircle.calculatePerimater());
                    System.out.println("Pole powierzchni okręgu o podanych wymiarach wynosi: " + userCircle.calculateArea());
                    break;
                case 3:
                    System.out.println("Podaj długość boku kwadratu.");
                    System.out.print("a: ");
                    a = scanner.nextDouble();
                    Square userSquare = new Square(a);
                    userSquare.print();
                    System.out.println("Obwód kwadratu o podanych wymiarach wynosi: " + userSquare.calculatePerimater());
                    System.out.println("Pole powierzchni kwadratu o podanych wymiarach wynosi: " + userSquare.calculateArea());
                    break;
                case 4:
                    System.out.println("Podaj wysokość graniastosłupa prawidłowego.");
                    h = scanner.nextDouble();
                    System.out.println("Wybierz podstawę graniastosłupa.");
                    System.out.println("Trójkąt - Wpisz '1'");
                    System.out.println("Okrąg - Wpisz '2'");
                    System.out.println("Kwadrat - Wpisz '3'");
                    userChoice = scanner.nextInt();
                    switch (userChoice) {
                        case 1:
                            System.out.println("Podaj długości trzech boków trójkąta.");
                            System.out.print("a: ");
                            a = scanner.nextDouble();
                            System.out.print("b: ");
                            b = scanner.nextDouble();
                            System.out.print("c: ");
                            c = scanner.nextDouble();
                            triangleBase = new Triangle(a, b, c);
                            userPrism = new Prism(triangleBase, h);
                            break;
                        case 2:
                            System.out.println("Podaj długość promienia okręgu.");
                            System.out.print("r: ");
                            r = scanner.nextDouble();
                            circleBase = new Circle(r);
                            userPrism = new Prism(circleBase, h);
                            break;
                        case 3:
                            System.out.println("Podaj długość boku kwadratu.");
                            System.out.print("a: ");
                            a = scanner.nextDouble();
                            squareBase = new Square(a);
                            userPrism = new Prism(squareBase, h);
                            break;
                    }

                    userPrism.print();
                    System.out.println("Pole powierzchni graniastosłupa prawidłowego o podanych wymiarach wynosi: " + userPrism.calculateArea());
                    System.out.println("Objętość graniastosłupa prawidłowego o podanych wymiarach wynosi: " + userPrism.calculateVolume());

                    break;
            }

            System.out.println("Chcesz wybrać kolejną figurę czy zakończyć działanie programu?");
            System.out.println("Wybrać nową figurę: 1");
            System.out.println("Zakończyć program: 2");
            userChoice = scanner.nextInt();
            switch (userChoice) {
                case 1:
                    break;
                case 2:
                    isOn = false;
                    break;
            }

        } while (isOn);

    }
}
