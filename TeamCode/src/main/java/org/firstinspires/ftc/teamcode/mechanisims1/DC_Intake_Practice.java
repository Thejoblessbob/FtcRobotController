package org.firstinspires.ftc.teamcode.mechanisims1;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class DC_Intake_Practice {

    private DcMotor motor; // IntakeMotor1
    private double ticksPerRev;
    private DigitalChannel touchSensor;

    public void init(HardwareMap hwMap) {
        // Touch Sensor
        touchSensor = hwMap.get(DigitalChannel.class,"touch_sensor");
        touchSensor.setMode(DigitalChannel.Mode.INPUT);

        // Dc Motor
        motor = hwMap.get(DcMotor.class, "intake_motor_1");
        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        ticksPerRev = motor.getMotorType().getTicksPerRev();
        motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        motor.setDirection(DcMotorSimple.Direction.REVERSE);
    }
    // ------------ Touch Sensor ------------
    public boolean isTouchSensorPressed(){
        return!touchSensor.getState();
    }
    //touch sensor True or False
    public boolean isTouchSensorReleased(){
        return!touchSensor.getState();
    }

    //------------ DC Motor ------------
    public void setMotorSpeed(double speed) {
        //accepts values from -1.0 - 1.0
        motor.setPower(speed);
    }
    // Motor commands
    public double getMotorRevs() {
        return motor.getCurrentPosition() / ticksPerRev * 2;
    }
}
