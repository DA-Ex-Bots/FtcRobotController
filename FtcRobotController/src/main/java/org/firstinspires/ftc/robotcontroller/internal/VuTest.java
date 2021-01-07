package org.firstinspires.ftc.robotcontroller.internal;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.vuforia.Vuforia;


@TeleOp(name = "VuTest", group = "Concept")

public class VuTest extends LinearOpMode {

    ConceptTensorFlowObjectDetection VuforiaDetect = new ConceptTensorFlowObjectDetection(this, hardwareMap);

    @Override
    public void runOpMode() {


        telemetry.addData("debug", 1);
        telemetry.update();

        VuforiaDetect.VuforiaStart();
        telemetry.addData("debug", 2);
        telemetry.update();
        sleep(5000);
    }
}
