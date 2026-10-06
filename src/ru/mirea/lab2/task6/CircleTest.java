package pr2.task06;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(0, 0, 3);
        Circle c2 = new Circle(1, 2, 5);
        System.out.println(c1);
        System.out.printf("Площадь: %.3f, длина: %.3f%n", c1.getArea(), c1.getLength());
        System.out.println(c2);
        System.out.printf("Площадь: %.3f, длина: %.3f%n", c2.getArea(), c2.getLength());

        int cmp = c1.compareTo(c2);
        String rel = cmp < 0 ? "меньше" : cmp > 0 ? "больше" : "равна";
        System.out.println("Первая окружность " + rel + " второй");

        c1.setRadius(5);
        System.out.println("После setRadius(5) сравнение: " + c1.compareTo(c2));
    }
}
