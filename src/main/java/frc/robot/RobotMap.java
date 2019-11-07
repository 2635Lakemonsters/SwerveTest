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
 
  public static final int LEFT_JOYSTICK_CHANNEL = 0;
  public static final int RIGHT_JOYSTICK_CHANNEL = 1;

  public static final int REFERENCE_RESET_BUTTON = 8;

  public static final int DRIVETRAIN_FRONT_LEFT_ANGLE_MOTOR = 8;
  public static final int DRIVETRAIN_FRONT_LEFT_ANGLE_ENCODER = 3;
  public static final int DRIVETRAIN_FRONT_LEFT_DRIVE_MOTOR = 7;

  public static final int DRIVETRAIN_FRONT_RIGHT_ANGLE_MOTOR = 4;
  public static final int DRIVETRAIN_FRONT_RIGHT_ANGLE_ENCODER = 2;
  public static final int DRIVETRAIN_FRONT_RIGHT_DRIVE_MOTOR = 3;
  
  public static final int DRIVETRAIN_BACK_LEFT_ANGLE_MOTOR = 6;
  public static final int DRIVETRAIN_BACK_LEFT_ANGLE_ENCODER = 1;
  public static final int DRIVETRAIN_BACK_LEFT_DRIVE_MOTOR = 5;

  public static final int DRIVETRAIN_BACK_RIGHT_ANGLE_MOTOR = 2;
  public static final int DRIVETRAIN_BACK_RIGHT_ANGLE_ENCODER = 0;
  public static final int DRIVETRAIN_BACK_RIGHT_DRIVE_MOTOR = 1;
}
