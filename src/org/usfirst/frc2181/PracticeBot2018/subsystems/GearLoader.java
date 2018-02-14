// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2181.PracticeBot2018.subsystems;

import org.usfirst.frc2181.PracticeBot2018.RobotMap;
import org.usfirst.frc2181.PracticeBot2018.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Counter;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.VictorSP;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class GearLoader extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController gearLoaderSpeedController = RobotMap.gearLoadergearLoaderSpeedController;
    private final DigitalInput gearLoaderEncoder = RobotMap.gearLoadergearLoaderEncoder;
    private final DigitalInput gearLoaderLimitSwitch = RobotMap.gearLoadergearLoaderLimitSwitch;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new gearLoaderDefault());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    private final Counter position = new Counter(gearLoaderEncoder);
    
    public void setGearLoader(double speed) {
    	gearLoaderSpeedController.set(speed);
    }
    
    public boolean getLimitSwitch() {
    	return !gearLoaderLimitSwitch.get();
    }
    
    public int getPulses() {
    	return position.get();
    }
    
    public double getDegrees() {
    	return 2.06 * position.get();
    }
    
    public void reset() {
    	position.reset();
    }
}

