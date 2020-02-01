package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.subsystems.PrototypingSubsystem;
import frc.robot.subsystems.XboxController;

public class Robot extends TimedRobot {
  // Subsystems
  PrototypingSubsystem protoSystem;
  // Doubles
  double motor1, motor2, motor3, motor4, servoAngle;
  //Controllers
  XboxController controller;

  @Override
  public void robotInit() {
    //Subsystems
    this.protoSystem = new PrototypingSubsystem();
    //Controllers
    this.controller = new XboxController(0);
    // SmartDashboard Entries
    SmartDashboard.putNumber("Motor1", 0);
    SmartDashboard.putNumber("Motor2", 0);
    SmartDashboard.putNumber("Motor3", 0);
    SmartDashboard.putNumber("Servo Angle", 0);
    SmartDashboard.putBoolean("Controller Mode", false);
    SmartDashboard.putNumber("Manual Motor Selector", 0);
    // Motor Powers
    this.motor1 = SmartDashboard.getNumber("Motor1", 0);
    this.motor2 = SmartDashboard.getNumber("Motor2", 0);
    this.motor3 = SmartDashboard.getNumber("Motor3", 0);
    this.servoAngle = SmartDashboard.getNumber("Servo Angle", 0);
  }

  @Override
  public void autonomousInit() {
  }

  @Override
  public void autonomousPeriodic() {
  }

  @Override
  public void teleopInit() {
  }

  @Override
  public void teleopPeriodic() {

    if(SmartDashboard.getBoolean("Controller Mode", false)){
      int selectedMotor = (int) SmartDashboard.getNumber("Manual Motor Selector", 0);
      double manualMotorPower = -this.controller.getLeftStickY();
      if(selectedMotor == 1){
        this.protoSystem.setprotoMotor1(manualMotorPower);
      }else if(selectedMotor == 2){
        this.protoSystem.setprotoMotor2(manualMotorPower);
      }else if(selectedMotor == 3){
        this.protoSystem.setprotoMotor3(manualMotorPower);
      }else if(selectedMotor == 4){
        this.protoSystem.setServoAnalog(manualMotorPower);
      }
    }else{
      // Motor Powers
      this.motor1 = SmartDashboard.getNumber("Motor1", 0);
      this.motor2 = SmartDashboard.getNumber("Motor2", 0);
      this.motor3 = SmartDashboard.getNumber("Motor3", 0);
      this.servoAngle = SmartDashboard.getNumber("Servo Angle", 0);
      // Setting Motor Powers
      this.protoSystem.setprotoMotor1(motor1);
      this.protoSystem.setprotoMotor2(motor2);
      this.protoSystem.setprotoMotor3(motor3);
      this.protoSystem.setprotoServoAngle(servoAngle);
    }
  }

  @Override
  public void testInit() {
  }

  @Override
  public void testPeriodic() {
    
    if(SmartDashboard.getBoolean("Controller Mode", false)){
      int selectedMotor = (int) SmartDashboard.getNumber("Manual Motor Selector", 0);
      double manualMotorPower = this.controller.getRightTriggerAnalog();
      if(selectedMotor == 1){
        this.protoSystem.setprotoMotor1(manualMotorPower);
      }else if(selectedMotor == 2){
        this.protoSystem.setprotoMotor2(manualMotorPower);
      }else if(selectedMotor == 3){
        this.protoSystem.setprotoMotor3(manualMotorPower);
      }else if(selectedMotor == 4){
        this.protoSystem.setServoAnalog(manualMotorPower);
      }
    }else{
      // Motor Powers
      this.motor1 = SmartDashboard.getNumber("Motor1", 0);
      this.motor2 = SmartDashboard.getNumber("Motor2", 0);
      this.motor3 = SmartDashboard.getNumber("Motor3", 0);
      this.servoAngle = SmartDashboard.getNumber("Servo Angle", 0);
      // Setting Motor Powers
      this.protoSystem.setprotoMotor1(motor1);
      this.protoSystem.setprotoMotor2(motor2);
      this.protoSystem.setprotoMotor3(motor3);
      this.protoSystem.setprotoServoAngle(servoAngle);
    }
    
    
  }
}
