/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.Servo;

public class PrototypingSubsystem {
    // Motors
    VictorSPX protoMotor1;
    TalonSRX protoMotor2;
    VictorSPX protoMotor3;
    //Servo
    Servo protoServo;

    public PrototypingSubsystem() {
        this.protoMotor1 = new VictorSPX(0);
        this.protoMotor2 = new TalonSRX(1);
        this.protoMotor3 = new VictorSPX(2);
        this.protoServo = new Servo(0);
    }

    public void setprotoMotor1(double power) {
        this.protoMotor1.set(ControlMode.PercentOutput, power);
    }

    public void setprotoMotor2(double power) {
        this.protoMotor2.set(ControlMode.PercentOutput, power);
    }

    public void setprotoMotor3(double power) {
        this.protoMotor3.set(ControlMode.PercentOutput, power);
    }

    public void setprotoServoAngle(double angle){
        this.protoServo.setAngle(angle);
    }

}
