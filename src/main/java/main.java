import java.awt.*;
import java.awt.event.InputEvent;

public class main {
    public static void main(String[] args) throws AWTException, InterruptedException {
        System.out.println("Program Running");
        while (true){
            Robot robot = new Robot();

            Point coord = MouseInfo.getPointerInfo().getLocation();
            Color color = robot.getPixelColor((int)coord.getX(), (int)coord.getY());

            Color w = new Color(75, 219, 106);

            if (color.equals(w)){

                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                System.out.println("Clicked");
                Thread.sleep(2000);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            }

        }
    }
}
