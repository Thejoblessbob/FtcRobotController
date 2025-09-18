package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisims1.DC_Intake_Practice;
@TeleOp
public class DcMotorPractice extends OpMode{
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

        /* if (gamepad1.right_trigger == 1 && gamepad1.left_trigger == 1) {
            bench.setMotorSpeed(1);
        }
        else if (gamepad1.left_trigger > 0.5 ) {
            bench.setMotorSpeed(0.4);
        }
        else if (gamepad1.right_trigger > 0.5) {
            bench.setMotorSpeed(0.6);
        }
        else {
            bench.setMotorSpeed(0.0);
        }
        telemetry.addData("Motor Revs", bench.getMotorRevs());
*/
    }

