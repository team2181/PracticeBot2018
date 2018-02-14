// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2181.PracticeBot2018;

import org.usfirst.frc2181.PracticeBot2018.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton ropeSpoolForward;
    public JoystickButton ropeSpoolBackward;
    public JoystickButton ropeSpoolForwardStop;
    public JoystickButton ropeSpoolBackwardStop;
    public JoystickButton gearLoaderFlipperUp;
    public JoystickButton gearLoaderFlipperUpStop;
    public JoystickButton gearLoaderFlipperDown;
    public JoystickButton gearLoaderFlipperDownStop;
    public Joystick xboxController;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        xboxController = new Joystick(0);
        
        gearLoaderFlipperDownStop = new JoystickButton(xboxController, 5);
        gearLoaderFlipperDownStop.whenReleased(new gearLoaderDefault());
        gearLoaderFlipperDown = new JoystickButton(xboxController, 5);
        gearLoaderFlipperDown.whenPressed(new gearLandingBackward());
        gearLoaderFlipperUpStop = new JoystickButton(xboxController, 6);
        gearLoaderFlipperUpStop.whenReleased(new gearLoaderDefault());
        gearLoaderFlipperUp = new JoystickButton(xboxController, 6);
        gearLoaderFlipperUp.whenPressed(new gearLandingForward());
        ropeSpoolBackwardStop = new JoystickButton(xboxController, 4);
        ropeSpoolBackwardStop.whenReleased(new ropeSpoolStopCommand());
        ropeSpoolForwardStop = new JoystickButton(xboxController, 1);
        ropeSpoolForwardStop.whenReleased(new ropeSpoolStopCommand());
        ropeSpoolBackward = new JoystickButton(xboxController, 4);
        ropeSpoolBackward.whenPressed(new ropeSpoolBackwardC());
        ropeSpoolForward = new JoystickButton(xboxController, 1);
        ropeSpoolForward.whenPressed(new ropeSpoolForwardC());


        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("ropeSpoolForwardC", new ropeSpoolForwardC());
        SmartDashboard.putData("ropeSpoolBackwardC", new ropeSpoolBackwardC());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getXboxController() {
        return xboxController;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

