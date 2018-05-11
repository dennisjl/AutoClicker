import java.awt.Robot;

public class AutoClicker {

    private Robot robot;

    //delay between clicks in ms
    private int delay;

    public AutoClicker(){
        try{
            this.robot = new Robot();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        //default delay
        this.delay = 300;
    }

    public void clickMouse(int button){
        // this method only press the button, does not release
        try {
            robot.mousePress(button);
            // adds static delay
            robot.delay(250);
            //release mousepress
            robot.mouseRelease(button);
            robot.delay(delay);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void setDelay(int ms){
        this.delay = ms;
    }

}
