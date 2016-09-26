public static void moveRobot(Robot robot, int toX, int toY) {
    int x = robot.getX();
    int y = robot.getY();

    if (x > toX){
        while(robot.getDirection() != Direction.LEFT){
            robot.turnLeft();
        }
        while(x != toX){
            robot.stepForward();
            x--;
        }
    }
    else if (x < toX){
        while (robot.getDirection() != Direction.RIGHT){
            robot.turnLeft();
        }
        while (x != toX){
            robot.stepForward();
            x++;
        }
    }
    if (y > toY){
        while (robot.getDirection() != Direction.DOWN){
            robot.turnLeft();
        }
        while (y != toY){
            robot.stepForward();
            y--;
        }
    }
    else if (y < toY) {
        while (robot.getDirection() != Direction.UP){
            robot.turnLeft();
        }
        while(y != toY){
            robot.stepForward();
            y++;
        }
    }
}
