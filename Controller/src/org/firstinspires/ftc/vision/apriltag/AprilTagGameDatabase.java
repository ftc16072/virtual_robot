//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.firstinspires.ftc.vision.apriltag;

import org.firstinspires.ftc.robotcore.external.matrices.VectorF;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
import org.firstinspires.ftc.robotcore.external.navigation.Quaternion;

public class AprilTagGameDatabase {
    public AprilTagGameDatabase() {
    }

    public static AprilTagLibrary getCurrentGameTagLibrary() {
        return (new AprilTagLibrary.Builder()).addTags(getSampleTagLibrary()).addTags(getCenterStageTagLibrary()).build();
    }

    public static AprilTagLibrary getCenterStageTagLibrary() {
        return (new AprilTagLibrary.Builder()).addTag(1, "BlueAllianceLeft", 2.0, new VectorF(60.25F, 41.41F, 4.0F), DistanceUnit.INCH, new Quaternion(0.3536F, -0.6124F, 0.6124F, -0.3536F, 0L)).addTag(2, "BlueAllianceCenter", 2.0, new VectorF(60.25F, 35.41F, 4.0F), DistanceUnit.INCH, new Quaternion(0.3536F, -0.6124F, 0.6124F, -0.3536F, 0L)).addTag(3, "BlueAllianceRight", 2.0, new VectorF(60.25F, 29.41F, 4.0F), DistanceUnit.INCH, new Quaternion(0.3536F, -0.6124F, 0.6124F, -0.3536F, 0L)).addTag(4, "RedAllianceLeft", 2.0, new VectorF(60.25F, -29.41F, 4.0F), DistanceUnit.INCH, new Quaternion(0.3536F, -0.6124F, 0.6124F, -0.3536F, 0L)).addTag(5, "RedAllianceCenter", 2.0, new VectorF(60.25F, -35.41F, 4.0F), DistanceUnit.INCH, new Quaternion(0.3536F, -0.6124F, 0.6124F, -0.3536F, 0L)).addTag(6, "RedAllianceRight", 2.0, new VectorF(60.25F, -41.41F, 4.0F), DistanceUnit.INCH, new Quaternion(0.3536F, -0.6124F, 0.6124F, -0.3536F, 0L)).addTag(7, "RedAudienceWallLarge", 5.0, new VectorF(-70.25F, -40.625F, 5.5F), DistanceUnit.INCH, new Quaternion(0.5F, -0.5F, -0.5F, 0.5F, 0L)).addTag(8, "RedAudienceWallSmall", 2.0, new VectorF(-70.25F, -35.125F, 4.0F), DistanceUnit.INCH, new Quaternion(0.5F, -0.5F, -0.5F, 0.5F, 0L)).addTag(9, "BlueAudienceWallSmall", 2.0, new VectorF(-70.25F, 35.125F, 4.0F), DistanceUnit.INCH, new Quaternion(0.5F, -0.5F, -0.5F, 0.5F, 0L)).addTag(10, "BlueAudienceWallLarge", 5.0, new VectorF(-70.25F, 40.625F, 5.5F), DistanceUnit.INCH, new Quaternion(0.5F, -0.5F, -0.5F, 0.5F, 0L)).build();
    }

    public static AprilTagLibrary getSampleTagLibrary() {
        return (new AprilTagLibrary.Builder()).addTag(583, "Nemo", 4.0, DistanceUnit.INCH).addTag(584, "Jonah", 4.0, DistanceUnit.INCH).addTag(585, "Cousteau", 6.0, DistanceUnit.INCH).addTag(586, "Ariel", 6.0, DistanceUnit.INCH).build();
    }
}
