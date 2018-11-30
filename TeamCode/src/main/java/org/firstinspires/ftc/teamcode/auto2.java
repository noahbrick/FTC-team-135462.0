package org.firstinspires.ftc.teamcode;
import android.graphics.Path;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.robotcontroller.external.samples.HardwarePushbot;


/**
 * Created by noahbrick48 on 11/19/2018.
 */
@Autonomous(name="auto2 ", group="Pushbot")

public class auto2 extends LinearOpMode {
    hardwaremap2 robot = new hardwaremap2();
    private ElapsedTime runtime = new ElapsedTime();
    static final double COUNTS_PER_MOTOR_REV = 1440;


    public void runOpMode() {
        robot.init(hardwareMap);
        telemetry.addData("Status", "Resetting Encoders");
        telemetry.update();

        robot.lifter.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        robot.lifter.setMode(DcMotor.RunMode.RUN_USING_ENCODER);


        telemetry.addData("Path0", "lifter position",
                robot.lifter.getCurrentPosition());
        telemetry.update();

        waitForStart();




        int liftertarget;


        if (opModeIsActive()) {


                //liftertarget = robot.lifter.getCurrentPosition() + 100;
            robot.lifter.setTargetPosition(10000);

                robot.lifter.setMode(DcMotor.RunMode.RUN_TO_POSITION);

                runtime.reset();

                robot.lifter.setPower(1);

            while (opModeIsActive() &&
                    robot.lifter.isBusy()) {

                // Display it for the driver.
                telemetry.addData("Path2",  "Running at %7d ",robot.lifter.getCurrentPosition());


                telemetry.update();
            }

                robot.lifter.setPower(0);
            robot.lifter.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        }


    }
}

