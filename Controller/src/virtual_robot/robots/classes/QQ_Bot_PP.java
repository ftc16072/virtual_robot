package virtual_robot.robots.classes;

import com.qualcomm.robotcore.hardware.DcMotorExImpl;
import com.qualcomm.robotcore.hardware.DcMotorImpl;
import com.qualcomm.robotcore.hardware.ServoImpl;
import com.qualcomm.robotcore.hardware.configuration.MotorType;

import javafx.fxml.FXML;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import virtual_robot.controller.BotConfig;

/**
 * For internal use only. Represents a robot with four mecanum wheels,
 * claw servo, and liftMotor
 */
@BotConfig(name = "QQ Bot PP", filename = "qq_bot_pp")
public class QQ_Bot_PP extends MecanumPhysicsBase {
    private ServoImpl claw_servo = null;
    private ServoImpl rotate_servo = null;

    private DcMotorExImpl lift_motor = null;


    public QQ_Bot_PP() {
        super();
    }

    public void initialize() {
        super.initialize();
        hardwareMap.setActive(true);
        claw_servo = (ServoImpl) hardwareMap.servo.get("claw_servo");
        rotate_servo = (ServoImpl) hardwareMap.servo.get("rotate_servo");
        lift_motor = (DcMotorExImpl) hardwareMap.dcMotor.get("lift_motor");

        hardwareMap.setActive(false);
    }

    protected void createHardwareMap() {
        super.createHardwareMap();
        hardwareMap.put("claw_servo", new ServoImpl());
        hardwareMap.put("rotate_servo", new ServoImpl());
        hardwareMap.put("lift_motor", new DcMotorExImpl(MotorType.Gobilda137));
    }

    public synchronized void updateStateAndSensors(double millis) {
        //Compute new pose and update various sensors
        super.updateStateAndSensors(millis);
    }

    public synchronized void updateDisplay() {
        super.updateDisplay();
    }

    public void powerDownAndReset() {
        super.powerDownAndReset();
    }


}
