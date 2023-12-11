package org.firstinspires.ftc.vision.apriltag;

import android.graphics.Canvas;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
import org.firstinspires.ftc.robotcore.internal.camera.calibration.CameraCalibration;
import org.firstinspires.ftc.vision.VisionProcessor;
import org.opencv.core.Mat;
import org.openftc.apriltag.AprilTagDetectorJNI;

import java.util.Collections;
import java.util.List;

public class AprilTagProcessor implements VisionProcessor {
    public static AprilTagProcessor easyCreateWithDefaults(){
        return new AprilTagProcessor();
    }
    public List<AprilTagDetection> getDetections(){
        return null;
    }

    @Override
    public void init(int width, int height, CameraCalibration calibration) {

    }

    @Override
    public Object processFrame(Mat frame, long captureTimeNanos) {
        return null;
    }

    @Override
    public void onDrawFrame(Canvas canvas, int onscreenWidth, int onscreenHeight, float scaleBmpPxToCanvasPx, float scaleCanvasDensity, Object userContext) {

    }
    public static enum TagFamily {
        TAG_36h11(org.openftc.apriltag.AprilTagDetectorJNI.TagFamily.TAG_36h11),
        TAG_25h9(org.openftc.apriltag.AprilTagDetectorJNI.TagFamily.TAG_25h9),
        TAG_16h5(org.openftc.apriltag.AprilTagDetectorJNI.TagFamily.TAG_16h5),
        TAG_standard41h12(org.openftc.apriltag.AprilTagDetectorJNI.TagFamily.TAG_standard41h12);

        final AprilTagDetectorJNI.TagFamily ATLibTF;

        private TagFamily(AprilTagDetectorJNI.TagFamily ATLibTF) {
            this.ATLibTF = ATLibTF;
        }
    }
    public static class Builder {
        private double fx;
        private double fy;
        private double cx;
        private double cy;
        private TagFamily tagFamily;
        private AprilTagLibrary tagLibrary;
        private DistanceUnit outputUnitsLength;
        private AngleUnit outputUnitsAngle;
        private int threads;
        private boolean drawAxes;
        private boolean drawCube;
        private boolean drawOutline;
        private boolean drawTagId;

        public Builder() {
            this.tagFamily = AprilTagProcessor.TagFamily.TAG_36h11;
            this.tagLibrary = AprilTagGameDatabase.getCurrentGameTagLibrary();
            this.outputUnitsLength = DistanceUnit.INCH;
            this.outputUnitsAngle = AngleUnit.DEGREES;
            this.threads = 3;
            this.drawAxes = false;
            this.drawCube = false;
            this.drawOutline = true;
            this.drawTagId = true;
        }

        public Builder setLensIntrinsics(double fx, double fy, double cx, double cy) {
            this.fx = fx;
            this.fy = fy;
            this.cx = cx;
            this.cy = cy;
            return this;
        }

        public Builder setTagFamily(TagFamily tagFamily) {
            this.tagFamily = tagFamily;
            return this;
        }

        public Builder setTagLibrary(AprilTagLibrary tagLibrary) {
            this.tagLibrary = tagLibrary;
            return this;
        }

        public Builder setOutputUnits(DistanceUnit distanceUnit, AngleUnit angleUnit) {
            this.outputUnitsLength = distanceUnit;
            this.outputUnitsAngle = angleUnit;
            return this;
        }

        public Builder setDrawAxes(boolean drawAxes) {
            this.drawAxes = drawAxes;
            return this;
        }

        public Builder setDrawCubeProjection(boolean drawCube) {
            this.drawCube = drawCube;
            return this;
        }

        public Builder setDrawTagOutline(boolean drawOutline) {
            this.drawOutline = drawOutline;
            return this;
        }

        public Builder setDrawTagID(boolean drawTagId) {
            this.drawTagId = drawTagId;
            return this;
        }

        public Builder setNumThreads(int threads) {
            this.threads = threads;
            return this;
        }

        public AprilTagProcessor build() {
            if (this.tagLibrary == null) {
                throw new RuntimeException("Cannot create AprilTagProcessor without setting tag library!");
            } else if (this.tagFamily == null) {
                throw new RuntimeException("Cannot create AprilTagProcessor without setting tag family!");
            } else {
                return new AprilTagProcessor();
            }
        }
    }
}
