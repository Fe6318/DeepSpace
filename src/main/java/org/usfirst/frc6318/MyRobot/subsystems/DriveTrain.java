// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc6318.MyRobot.subsystems;


import org.usfirst.frc6318.MyRobot.commands.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSource;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class DriveTrain extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private PWMVictorSPX speedController1;
    private PWMVictorSPX speedController2;
    private SpeedControllerGroup speedControllerGroup1;
    private PWMVictorSPX speedController3;
    private PWMVictorSPX speedController4;
    private SpeedControllerGroup speedControllerGroup2;
    private DifferentialDrive differentialDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public DriveTrain() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        speedController1 = new PWMVictorSPX(0);
        addChild("Speed Controller 1",speedController1);
        speedController1.setInverted(true);
        
        speedController2 = new PWMVictorSPX(1);
        addChild("Speed Controller 2",speedController2);
        speedController2.setInverted(true);
        
        speedControllerGroup1 = new SpeedControllerGroup(speedController1, speedController2  );
        addChild("Speed Controller Group 1",speedControllerGroup1);
        
        
        speedController3 = new PWMVictorSPX(2);
        addChild("Speed Controller 3",speedController3);
        speedController3.setInverted(true);
        
        speedController4 = new PWMVictorSPX(3);
        addChild("Speed Controller 4",speedController4);
        speedController4.setInverted(true);
        
        speedControllerGroup2 = new SpeedControllerGroup(speedController3, speedController4  );
        addChild("Speed Controller Group 2",speedControllerGroup2);
        
        
        differentialDrive = new DifferentialDrive(speedControllerGroup1, speedControllerGroup2);
        addChild("Differential Drive",differentialDrive);
        differentialDrive.setSafetyEnabled(true);
        differentialDrive.setExpiration(0.1);
        differentialDrive.setMaxOutput(1.0);

        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new Drive(0));

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    public DifferentialDrive getDifferentialDrive() {
        return differentialDrive;
    }
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

}

