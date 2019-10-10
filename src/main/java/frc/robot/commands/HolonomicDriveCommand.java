/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import org.frcteam2910.common.math.Vector2;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.subsystems.DrivetrainSubsystem;

public class HolonomicDriveCommand extends Command {
  public HolonomicDriveCommand() {
    requires(DrivetrainSubsystem.getInstance());
}

@Override
protected void execute() {
    //boolean ignoreScalars = Robot.oi.primaryController.getLeftBumperButton().get();

    double forward = Robot.oi.rightStick.getRawAxis(1);
    double strafe = Robot.oi.rightStick.getRawAxis(0);
    double rotation = Robot.oi.rightStick.getRawAxis(2);

    boolean robotOriented = false;
    boolean reverseRobotOriented = false;

    Vector2 translation = new Vector2(forward, strafe);

    // if (reverseRobotOriented) {
    //     robotOriented = true;
    //     translation = translation.rotateBy(Rotation2.fromDegrees(180.0));
    // }
    //System.out.println("HoloDriveCommand.execute" + translation + " " + rotation);
    DrivetrainSubsystem.getInstance().holonomicDrive(translation, rotation, !robotOriented);
}

@Override
protected boolean isFinished() {
    return false;
}
}
