/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.wheel_of_fortune;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.WheelOfFortune;

public class ExtendWOF extends CommandBase {
  
  private final WheelOfFortune m_WheelOfFortune;

  private SmartDashboard m_dash;

  public ExtendWOF(WheelOfFortune subsystem) {
    m_WheelOfFortune = subsystem;
    addRequirements(m_WheelOfFortune);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {

  }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
      m_WheelOfFortune.extend();
    }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return true;
  }
}
