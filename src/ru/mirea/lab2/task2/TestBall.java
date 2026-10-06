package pr2.task02;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(100, 100);
        System.out.println(ball);
        ball.move(30, 15);
        System.out.println("После move(30, 15): " + ball);
        ball.setXY(0, 0);
        ball.setX(5);
        System.out.println("x = " + ball.getX() + ", y = " + ball.getY());
        System.out.println(new Ball());
    }
}
