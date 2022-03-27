package ui;

import figures.*;

public class SystemOutput {

    Triangle triangleBase;
    Circle circleBase;
    Square squareBase;
    Prism userPrism = null;
    boolean isOn = true;
    int userChoice;
    double a;
    double b;
    double c;
    double r;
    double h;

    public void runMenu(){

        while (isOn) {
            System.out.println("Witaj w kalkulatorze pól i obwodów figur. Aby rozpocząć wybierz jedną z dostępnych figur:");
            System.out.println("Trójkąt - Wpisz '1'");
            System.out.println("Okrąg - Wpisz '2'");
            System.out.println("Kwadrat - Wpisz '3'");
            System.out.println("Graniastosłup prawidłowy - Wpisz '4'");

            userChoice = UserInput.inputIntHigherThanZeroInRangeToC(4);

            switch (userChoice) {
                case 1:
                    System.out.println("Podaj długości trzech boków trójkąta.");
                    System.out.print("a: ");
                    a = UserInput.inputDoubleHigherThanZero();
                    System.out.print("b: ");
                    b = UserInput.inputDoubleHigherThanZero();
                    System.out.print("c: ");
                    c = UserInput.inputDoubleHigherThanZero();
                    Triangle userTriangle = new Triangle(a, b, c);
                    userTriangle.print();
                    break;
                case 2:
                    System.out.println("Podaj długość promienia okręgu.");
                    System.out.print("r: ");
                    r = UserInput.inputDoubleHigherThanZero();
                    Circle userCircle = new Circle(r);
                    userCircle.print();
                    break;
                case 3:
                    System.out.println("Podaj długość boku kwadratu.");
                    System.out.print("a: ");
                    a = UserInput.inputDoubleHigherThanZero();
                    Square userSquare = new Square(a);
                    userSquare.print();
                    break;
                case 4:
                    System.out.println("Podaj wysokość graniastosłupa prawidłowego.");
                    h = UserInput.inputDoubleHigherThanZero();
                    System.out.println("Wybierz podstawę graniastosłupa.");
                    System.out.println("Trójkąt - Wpisz '1'");
                    System.out.println("Okrąg - Wpisz '2'");
                    System.out.println("Kwadrat - Wpisz '3'");
                    userChoice = UserInput.inputIntHigherThanZeroInRangeToC(3);
                    switch (userChoice) {
                        case 1:
                            System.out.println("Podaj długości trzech boków trójkąta.");
                            System.out.print("a: ");
                            a = UserInput.inputDoubleHigherThanZero();
                            System.out.print("b: ");
                            b = UserInput.inputDoubleHigherThanZero();
                            System.out.print("c: ");
                            c = UserInput.inputDoubleHigherThanZero();
                            triangleBase = new Triangle(a, b, c);
                            userPrism = new Prism(triangleBase, h);
                            break;
                        case 2:
                            System.out.println("Podaj długość promienia okręgu.");
                            System.out.print("r: ");
                            r = UserInput.inputDoubleHigherThanZero();
                            circleBase = new Circle(r);
                            userPrism = new Prism(circleBase, h);
                            break;
                        case 3:
                            System.out.println("Podaj długość boku kwadratu.");
                            System.out.print("a: ");
                            a = UserInput.inputDoubleHigherThanZero();
                            squareBase = new Square(a);
                            userPrism = new Prism(squareBase, h);
                            break;
                    }

                    userPrism.print();

                    break;
            }

            System.out.println("Chcesz wybrać kolejną figurę czy zakończyć działanie programu?");
            System.out.println("Wybrać nową figurę: 1");
            System.out.println("Zakończyć program: 2");
            userChoice = UserInput.inputIntHigherThanZeroInRangeToC(2);
            switch (userChoice) {
                case 1:
                    break;
                case 2:
                    isOn = false;
                    break;
            }
        }
    }
}
