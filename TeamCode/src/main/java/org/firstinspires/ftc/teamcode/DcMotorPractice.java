package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisims1.DC_Intake_Practice;
@TeleOp
public class DcMotorPractice extends OpMode {
    DC_Intake_Practice bench = new DC_Intake_Practice();

    @Override
    public void init() {
        bench.init(hardwareMap);
    }

    boolean last_button_state = false;
    boolean motor_on = false;
    boolean prev_value = gamepad1.a;

    @Override
    public void loop() {
        /*if (gamepad1.right_trigger >= 1) {
            bench.setMotorSpeed(1);

        }
        else {
            bench.setMotorSpeed(0.0);
        }
        telemetry.addData("Motor Revs", bench.getMotorRevs());

         ElapsedTime timer = new ElapsedTime();

    boolean motorActive = false;

    @Override
    public void loop() {
        if (gamepad1.right_trigger >= 1 && !motorActive) {
            bench.setMotorSpeed(1);
            timer.reset();        // start timing
            motorActive = true;
        }

        // Stop after 500ms (example)
        if (motorActive && timer.milliseconds() > 500) {
            bench.setMotorSpeed(0.0);
            motorActive = false;
        }

        telemetry.addData("Motor Revs", bench.getMotorRevs());
    }
*/

        if (prev_value != last_button_state) {
             motor_on = !motor_on;
             if (motor_on){
                 bench.setMotorSpeed(1.0);
                 last_button_state = !last_button_state;
             }
             else {
                 bench.setMotorSpeed(0.0);
             }
             last_button_state = !last_button_state;
        }



    }

}

