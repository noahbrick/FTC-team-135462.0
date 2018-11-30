package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.DcMotorController;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.Servo;
/**
 * Created by noahbrick48 on 10/17/2018.
 */

public class hardwaremap2 {

    public DcMotor lifter = null;
    public DcMotor rightoniwheel = null;
    public DcMotor leftoniwheel = null;
    public DcMotor rightwheel = null;
    public DcMotor leftwheel = null;
    public DcMotor ballarm = null;
    public Servo ballholder = null;

    HardwareMap hwMap2 = null;

    public void init (HardwareMap hawMap) {

        hwMap2 = hawMap;

        rightwheel = hwMap2.get(DcMotor.class, "rightdrive");
        leftwheel = hwMap2.get(DcMotor.class, "leftdrive");

        rightoniwheel = hwMap2.get(DcMotor.class, "rightonidrive");
        leftoniwheel = hwMap2.get(DcMotor.class, "leftonidrive");

        lifter = hwMap2.get(DcMotor.class, "lifter");

        //ballarm = hwMap2.get(DcMotor.class, "ball arm");
        //ballholder= hwMap2.get(Servo.class, "ballholder");






                }

    }



