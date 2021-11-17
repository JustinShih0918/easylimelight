package frc.robot.component;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import org.team6083.lib.drive.DifferentialDrive;

import edu.wpi.first.wpilibj.VictorSP;
import frc.robot.Robot;

public class drivebase {
    public static DifferentialDrive drive;
    public static VictorSP left_1;
    public static VictorSP left_2;
    public static VictorSP right_1;
    public static VictorSP right_2;

    public static void init() {
        left_1 = new VictorSP(2);
        left_2 = new VictorSP(3);
        right_1 = new VictorSP(0);
        right_2 = new VictorSP(1);
        drive = new DifferentialDrive(left_1,left_2,right_1,right_2);
    }
    public static void teleop(){
        drive.tankDrive(Robot.xbox);
    }
    public static void track(double speed, double rotation, boolean input) {
        drive.arcadeDrive(speed, rotation, input);
    }
    
    public static void directControl(double left, double right) {
        drive.directControl(left, right);
    }
}
