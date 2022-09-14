package org.firstinspires.ftc.teamcode.ftc16072;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp()
public class SampleOpmode extends OpMode {
    Servo claw;
    DcMotorEx liftMotor;

    @Override
    public void init() {
        claw = hardwareMap.get(Servo.class, "claw_servo");
        liftMotor = hardwareMap.get(DcMotorEx.class, "lift_motor");
        telemetry.addLine("Initialized!!");
    }

    @Override
    public void loop() {

    }
}
