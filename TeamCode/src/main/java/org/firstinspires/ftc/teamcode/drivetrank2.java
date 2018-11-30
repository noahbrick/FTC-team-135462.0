package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.OpticalDistanceSensor;
/**
 * Created by noahbrick48 on 10/17/2018.
 */
@TeleOp(name="drivetrain: Telop tank2", group="metal")

public class drivetrank2 extends LinearOpMode{

    hardwaremap2 robot = new hardwaremap2();

    @Override
    public void runOpMode() {
        double liftmotor;
        double left;
        double right;
        double ballservo;
        robot.init(hardwareMap);

        waitForStart();
        while (opModeIsActive()) {

            //ballservo = gamepad2.right_bumper;
            //robot.ballholder.setPosition();

            liftmotor = -gamepad2.right_stick_y;
            robot.lifter.setPower(liftmotor);
            


            left = -gamepad1.left_stick_y;
            right = -gamepad1.right_stick_y;

            if (left > 0.05 || left < -0.05 || right > 0.05 || right < -0.05) {
                robot.leftwheel.setPower(left);
                robot.rightwheel.setPower(right);
                robot.rightoniwheel.setPower(right);
                robot.leftoniwheel.setPower(left);
            } else if (gamepad1.a) {
                robot.leftoniwheel.setPower(1/2);
                robot.rightwheel.setPower(1/2);
            } else if (gamepad1.b) {
                robot.leftoniwheel.setPower(-1/2);
                robot.rightwheel.setPower(-1/2);
            } else if (gamepad1.dpad_up) {
                robot.leftwheel.setPower(1/2);
                robot.rightoniwheel.setPower(1/2);
            } else if (gamepad1.dpad_down) {
                robot.leftwheel.setPower(-1/2);
                robot.rightoniwheel.setPower(-1/2);
            } else {
                robot.leftwheel.setPower(0);
                robot.rightwheel.setPower(0);
                robot.rightoniwheel.setPower(0);
                robot.leftoniwheel.setPower(0);
            }


        }







    }



}
