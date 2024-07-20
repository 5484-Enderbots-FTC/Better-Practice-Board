package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;

@TeleOp(name = "Color Distance", group = "Individual Components")

public class colorDistance extends LinearOpMode {

    public ColorSensor proxColor;

    @Override
    public void runOpMode() throws InterruptedException {
        telemetry.addData("Status", "Initialized");

        waitForStart();

        while (opModeIsActive()){
            //put in code for actual color/distance detecting here
        }

    }
}
