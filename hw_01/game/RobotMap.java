package hw_01.game;

import java.util.ArrayList;
import java.util.List;

public class RobotMap {

    private final int n;
    private final int m;
    private final int maxCount;
    private final List<Robot> robots;

    public RobotMap(int n, int m) {
        this(n, m, 5);
    }

    public RobotMap(int n, int m, int maxCount) {
        this.n = n;
        this.m = m;
        this.robots = new ArrayList<>();
        this.maxCount = maxCount;
    }

    public Robot createRobot(Point point) {
        validateParam(n, m);
        validatePoint(point);
        Robot robot = new Robot(point);
        robots.add(robot);
        if (robots.size() > maxCount) {
            throw new IllegalStateException("Нельзя создавать больше " + maxCount + " роботов!");
        }
        return robot;
    }

    private void validateParam(int n, int m) {
        if (n < 0 || m < 0) {
            throw new IllegalArgumentException("Некорректное значение параметра!");
        }
    }

    private void validatePoint(Point point) {
        validatePointIsCorrect(point);
        validatePointIsFree(point);
    }

    private void validatePointIsCorrect(Point point) {
        if (point.x() < 0 || point.x() > n || point.y() < 0 || point.y() > m) {
            throw new IllegalStateException("Некорректное значение точки!");
        }
    }

    private void validatePointIsFree(Point point) {
        for (Robot robot : robots) {
            Point robotPoint = robot.point;
            if (robotPoint.equals(point)) {
                throw new IllegalStateException("Точка " + point + " занята!");
            }
        }
    }

    public class Robot {

        public static final Direction DEFAULT_DIRECTION = Direction.TOP;

        private Direction direction;
        private Point point;

        public Robot(Point point) {
            this.direction = DEFAULT_DIRECTION;
            this.point = point;
        }

        public void changeDirection(Direction direction) {
            this.direction = direction;
        }

        public void move(int steps) {
            for (int i = 0; i < steps; i++) {
                move();
            }
        }

        public void move() {
            Point newPoint = switch (direction) {
                case TOP -> new Point(point.x() - 1, point.y());
                case RIGHT -> new Point(point.x(), point.y() + 1);
                case BOTTOM -> new Point(point.x() + 1, point.y());
                case LEFT -> new Point(point.x(), point.y() - 1);
            };
            validatePoint(newPoint);

            System.out.println("Робот переместился с " + point + " на " + newPoint);
            this.point = newPoint;
        }

        @Override
        public String toString() {
            return point.toString() + ", [" + direction.name() + "]";
        }
    }

}
