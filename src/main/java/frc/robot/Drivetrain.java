package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Timer;
import frc.robot.OI;
import frc.robot.RobotMap;

/**
 * This is the code for the robot drivetrain. It initializes motor controllers and has methods
 * for various functions of the drivetrain.
 * @author gjs
 */
public class Drivetrain {
    // Create 4 object variable names of type CANSparkMax named: l_primary, l_secondary, r_primary, r_secondary;


    private static Drivetrain instance;

    // Create 2 object variable names of type SpeedControllerGroup named: leftSpeedControl, rightSpeedControl


    // This is a PRIVATE constructor
    private Drivetrain() {
        // Initialize the 4 CANSparkMax objects (assign them with the new operator)
        // The deviceID is RobotMap.Drivetrain.CONSTANT_UNDER_THE_FILE and the MotorType is MotorType.kBrushless
        // API is under https://www.revrobotics.com/content/sw/max/sw-docs/java/com/revrobotics/CANSparkMax.html (check under the Constructor Summary)
        


        // Initialize the 2 SpeedControllerGroup objects (assign them with the new operator)
        // leftSpeedControl should take l_primary l_secondary
        // rightSpeedControl should take r_primary r_secondary


    }

    /**
     * creates a new instance of the drivetrain class if one has not been made
     * @return an instance of the drivetrain class
     */
    public static Drivetrain getInstance() {
        if (instance == null) {
            return new Drivetrain();
        }
        return instance;
    }

    /**
     * Create a public method of type void that sets the left speed of the drivetrain
     * method name: setLeftSpeed
     * parameter: double speed
     * body of method: leftSpeedControl.set(speed);
     * @param speed the speed to set from -1 to 1
     */
    

    // Do the same as above for the rightSpeedControl

    /**
     * IMPORTANT METHOD HERE!
     * At TechHOUNDS, we use an arcade drive, and that's done through a really simple process
     */
    public void arcadeDrive(double speed) {
        // Create a decimal variable x and assign it OI.driver.getLX()
        

        // Create a decimal variable y and assign it OI.driver.getLY()


        // assign -speed times y to y


        // assign -speed times x to x


        // Call the setSpeed method (created below) and pass in y-x and y+x
 
    }

    /**
     * Sets the speed of both the control groups
     * @param leftSpeed speed of the left side of the drivetrain from -1 to 1
     * @param rightSpeed speed of the right side of the drivetrain from -1 to 1
     */
    public void setSpeed(double leftSpeed, double rightSpeed) {
        // Call setRightSpeed and pass in rightSpeed
        

        // Call setLeftSpeed and pass in leftSpeed


    }

    @Override
    public String toString() {
        return "";
    }
}
