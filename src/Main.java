public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.printInfo();
    }
}

class Book {
    String title;
    String author;
    int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void applyDiscount(int Discount) {
        if (Discount > 0 && Discount < 100) {
            price -= price * Discount / 100;
        }
    }

    public void printInfo() {
        System.out.print("title = " + title + " " + "author = " + author + " " + "price = " + price + "\n");
        System.out.println();
    }
}

class Circle {
    int radius;
    double pI = 3.14159;
    double circumference;
    double circleArea;

    public Circle(int radius) {
        this.radius = radius;
        circleArea = pI * radius * radius;
        circumference = 2 * pI * radius;
    }

    public void printInfo() {
        System.out.println("Площадь круга = " + circleArea);
        System.out.println("Длина круга = " + circumference);
    }
}