package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.limelightvision.LLResult;
import com.qualcomm.hardware.limelightvision.Limelight3A;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.robotcore.external.navigation.Pose3D;

@TeleOp(name = "Test Limelight", group = "Testing")
public class limelightTwo extends LinearOpMode {

    private Limelight3A limelight;

    @Override
    public void runOpMode() throws InterruptedException {

        limelight = hardwareMap.get(Limelight3A.class, "limelight");

        telemetry.setMsTransmissionInterval(11);


        limelight.pipelineSwitch(6);

        limelight.start();

        waitForStart();

        while (opModeIsActive()) {
            LLResult result = limelight.getLatestResult();

            if (result != null && result.isValid()) {
                Pose3D botpose = result.getBotpose_MT2();
                telemetry.addData("tx", result.getTx());
                telemetry.addData("ty", result.getTy());
                telemetry.addData("Botpose", botpose != null ? botpose.toString() : "null");


                int targetId = result.getFiducialResults();

                telemetry.addData("Target ID", targetId);

                if (targetId == 22) {
                    telemetry.addLine("Detected AprilTag ID 22!");
                }
            } else {
                telemetry.addLine("No valid Limelight result.");
            }

            telemetry.update();
        }
    }
}