package org.firstinspires.ftc.vision;

import org.firstinspires.ftc.robotcore.external.hardware.camera.CameraName;

public class VisionPortal {
    public enum MultiPortalLayout
    {
        /**
         * Divides the screen vertically
         */
        VERTICAL,

        /**
         * Divides the screen horizontally
         */
        HORIZONTAL;

    }
    public static VisionPortal easyCreateWithDefaults(CameraName cameraName, VisionProcessor... processors)
    {
        return new VisionPortal();
    }

    public void stopStreaming(){

    }
    static public int[] makeMultiPortalView(int number, VisionPortal.MultiPortalLayout layout){
        int retVal[] = new int[2];
        return retVal;
    }

}
