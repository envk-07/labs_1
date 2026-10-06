package pr2.task03;

public class Tester {
    private Circle[] circles;
    private int count;

    public Tester(int capacity) {
        circles = new Circle[capacity];
    }

    public boolean add(Circle c) {
        if (count == circles.length) {
            return false;
        }
        circles[count++] = c;
        return true;
    }

    public int getCount() {
        return count;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(circles[i]);
        }
    }

    public static void main(String[] args) {
        Tester t = new Tester(3);
        t.add(new Circle(0, 0, 1));
        t.add(new Circle(new Point(2, 3), 4.5));
        t.add(new Circle(-1, 5, 2));
        System.out.println("Добавить 4-ю окружность: " + t.add(new Circle(1, 1, 1)));
        System.out.println("Окружностей: " + t.getCount());
        t.print();
    }
}
