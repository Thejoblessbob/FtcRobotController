package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisims1.Servo_Intake_Practice;
@TeleOp
public class DcMotorPractice extends OpMode{
    Servo_Intake_Practice bench = new Servo_Intake_Practice();

    @Override
    public void init() {
        bench.init(hardwareMap);
    }

    @Override
    public void loop() {
        if (bench.isTouchSensorPressed()) {
            bench.setMotorSpeed(0.5);
        }
        else {
            bench.setMotorSpeed(0.5);
        }
        telemetry.addData("Motor Revs", bench.getMotorRevs());

    }
}
