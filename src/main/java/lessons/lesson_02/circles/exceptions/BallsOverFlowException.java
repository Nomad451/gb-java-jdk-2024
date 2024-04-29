package lessons.lesson_02.circles.exceptions;

public class BallsOverFlowException extends RuntimeException {
    public BallsOverFlowException(){
        super("Невозможно создать более 15 шаров");
    }
}
