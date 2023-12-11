package org.firstinspires.ftc.vision;

import android.util.Size;

import org.firstinspires.ftc.robotcore.external.hardware.camera.BuiltinCameraDirection;
import org.firstinspires.ftc.robotcore.external.hardware.camera.CameraName;

import java.util.ArrayList;
import java.util.List;

public class VisionPortal {
    public static VisionPortal easyCreateWithDefaults(CameraName cameraName, VisionProcessor... processors)
    {
        return new VisionPortal();
    }

    public void stopStreaming(){

    }
    public static enum MultiPortalLayout {
        VERTICAL,
        HORIZONTAL;
    }
    public static int[] makeMultiPortalView(int numPortals, MultiPortalLayout mpl) {
        int ids[] = new int[numPortals];
        return ids;
    }
    public static class Builder {
        private static final ArrayList<VisionProcessor> attachedProcessors = new ArrayList();
        private CameraName camera;
        private int liveViewContainerId;
        private boolean autoStopLiveView;
        private Size cameraResolution;
        private final List<VisionProcessor> processors;

        public Builder() {
            this.autoStopLiveView = true;
            this.cameraResolution = new Size(640, 480);
            this.processors = new ArrayList();
        }

        public Builder setCamera(CameraName camera) {
            this.camera = camera;
            return this;
        }

        public Builder setCamera(BuiltinCameraDirection cameraDirection) {
            return this;
        }

        public Builder setStreamFormat(StreamFormat streamFormat) {
            return this;
        }

        public Builder enableLiveView(boolean enableLiveView) {
            return this;
        }

        public Builder setAutoStopLiveView(boolean autoPause) {
            return this;
        }

        public Builder setLiveViewContainerId(int liveViewContainerId) {
            this.liveViewContainerId = liveViewContainerId;
            return this;
        }

        public Builder setCameraResolution(Size cameraResolution) {
            this.cameraResolution = cameraResolution;
            return this;
        }

        public Builder addProcessor(VisionProcessor processor) {
            synchronized(attachedProcessors) {
                if (attachedProcessors.contains(processor)) {
                    throw new RuntimeException("This VisionProcessor has already been attached to a VisionPortal, either a different one or perhaps even this same portal.");
                }

                attachedProcessors.add(processor);
            }

            this.processors.add(processor);
            return this;
        }

        public Builder addProcessors(VisionProcessor... processors) {
            VisionProcessor[] var2 = processors;
            int var3 = processors.length;

            for(int var4 = 0; var4 < var3; ++var4) {
                VisionProcessor p = var2[var4];
                this.addProcessor(p);
            }

            return this;
        }

        public VisionPortal build() {
            if (this.camera == null) {
                throw new RuntimeException("You can't build a vision portal without setting a camera!");
            } else {
                VisionPortal portal = new VisionPortal();
                this.processors.clear();
                return portal;
            }
        }
    }
    public static enum StreamFormat {
        YUY2,
        MJPEG;
    }


}
