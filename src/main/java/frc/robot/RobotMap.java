/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  public static final int GRABBER_TOP_MOTOR = 5;
  public static final int GRABBER_BOTTOM_MOTOR = 2;

  public static final int CARGO_ARM_ENCODER_PORT = 4;

  public static final int HATCH_EXTENDER_SOLENOID_MODULE = 0;
  public static final int HATCH_EXTENDER_SOLENOID_CHANNEL = 2;
  public static final int HATCH_GRABBER_SOLENOID_MODULE = 0;
  public static final int HATCH_GRABBER_SOLENOID_CHANNEL = 1;

  public static final int HATCH_GRABBER_LIMIT_SWITCH_LEFT = 0;
  public static final int HATCH_GRABBER_LIMIT_SWITCH_RIGHT = 1;

  public static final int ARM_MOTOR_A = 9;
  public static final int ARM_MOTOR_B = 8;

  public static final int CLIMBER_SOLENOID_MODULE = 0;
  public static final int CLIMBER_SOLENOID_CHANNEL = 0;
  public static final int KICKSTAND_SOLENOID_MODULE = 0;
  public static final int KICKSTAND_SOLENOID_CHANNEL = 3;

  public static final int HATCH_FLOOR_GATHERER_ARM_MOTOR = 1;
  public static final int HATCH_FLOOR_GATHERER_FLOOR_MOTOR = 8;

  public static final int DRIVETRAIN_FRONT_LEFT_ANGLE_MOTOR = 4;
  public static final int DRIVETRAIN_FRONT_LEFT_ANGLE_ENCODER = 0;
  public static final int DRIVETRAIN_FRONT_LEFT_DRIVE_MOTOR = 10;

  public static final int DRIVETRAIN_FRONT_RIGHT_ANGLE_MOTOR = 7;
  public static final int DRIVETRAIN_FRONT_RIGHT_ANGLE_ENCODER = 3;
  public static final int DRIVETRAIN_FRONT_RIGHT_DRIVE_MOTOR = 6;
  
  public static final int DRIVETRAIN_BACK_LEFT_ANGLE_MOTOR = 5;
  public static final int DRIVETRAIN_BACK_LEFT_ANGLE_ENCODER = 1;
  public static final int DRIVETRAIN_BACK_LEFT_DRIVE_MOTOR = 9;

  public static final int DRIVETRAIN_BACK_RIGHT_ANGLE_MOTOR = 6;
  public static final int DRIVETRAIN_BACK_RIGHT_ANGLE_ENCODER = 2;
  public static final int DRIVETRAIN_BACK_RIGHT_DRIVE_MOTOR = 7;
}
