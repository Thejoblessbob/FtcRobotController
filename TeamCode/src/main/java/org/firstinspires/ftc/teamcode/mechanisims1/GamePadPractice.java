package org.firstinspires.ftc.teamcode.mechanisims1;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class GamePadPractice extends OpMode {

    @Override
    public void init() {

    }

    @Override
    public void loop() {
       telemetry.addData("Right_x", gamepad1.right_stick_x);
       telemetry.addData("Right_y", gamepad1.right_stick_y);
        telemetry.addData("Left_x", gamepad1.left_stick_x);
        telemetry.addData("Left_y", gamepad1.left_stick_y);
       telemetry.addData("a button", gamepad1.a);

    }
}
