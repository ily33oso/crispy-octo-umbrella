import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.ElapsedTime;

@TeleOp (name = "gato")

public class gato extends LinearOpMode {

    DcMotor fl  = null;
    DcMotor fr  = null;
    DcMotor bl   = null;
    DcMotor br  = null;
    private ElapsedTime runtime;

    @Override
    public void runOpMode() throws InterruptedException {
        telemetry.addData("status","Initialized");
        telemetry.update();
        
        fl.setDirection(DcMotor.Direction.REVERSE);
        fr.setDirection(DcMotor.Direction.FORWARD);
        bl.setDirection(DcMotor.Direction.REVERSE);
        br.setDirection(DcMotor.Direction.REVERSE);
        
        //Wait for the game to start (driver presses START)
        waitForStart();
        runtime = new ElapsedTime();

        if (gamepad1.right_trigger);

    }
}
