package hw_01.game;

public class GameMain {

  public static void main(String[] args) {
    // Карта с роботами.
    // Карта имеет nxm, где n и m - положительные целые числа.
    // Должна быть возможность создания робота на какой-то точке на карте.
    // Точка на карте описывается двумя целочисленными координатами.
    // Роботы могут перемещаться по карте вперед.
    // В одной точке не может находиться несколько роботов.

    // HOMEWORK
    // 0. Разобраться с проектом. Подготовить вопросы к следующему семинару, если
    // возникнут.
    // 1. Добавить валидацию параметров при создании карты
    // 2. Реализовать возможность задать ограничение по количеству создаваемых
    // на карте роботов (в конструкторе карты)
    // При этом если параметр не указан, то используем значение по-умолчанию: 5
    // 3*. Реализовать возможность вызова метода move с параметром - количество
    // шагов вперед
    // Подсказка: можно несколько раз вызвать метод #move

    /*
     * * * * *
     * * * * *
     * * * * *
     * * * * *
     * * * * *
     */

    RobotMap map = new RobotMap(5, 5);

    RobotMap.Robot robot = map.createRobot(new Point(2, 3));
    System.out.println(robot); // [2, 3], [TOP]
    robot.move();
    robot.move();
    robot.changeDirection(Direction.BOTTOM);
    robot.move(2);
    robot.move();
    robot.move();
    robot.changeDirection(Direction.LEFT);
    robot.move();
    System.out.println(robot);

    // RobotMap map1 = new RobotMap(-1, 3);
    // RobotMap.Robot robot0 = map1.createRobot(new Point(1, 3));

    RobotMap map2 = new RobotMap(3, 3, 2);
    RobotMap.Robot robot1 = map2.createRobot(new Point(0, 1));
    RobotMap.Robot robot2 = map2.createRobot(new Point(0, 2));
    RobotMap.Robot robot3 = map2.createRobot(new Point(0, 3));
    RobotMap.Robot robot4 = map2.createRobot(new Point(1, 1));
    RobotMap.Robot robot5 = map2.createRobot(new Point(1, 2));
    RobotMap.Robot robot6 = map2.createRobot(new Point(1, 3));
  }
}

