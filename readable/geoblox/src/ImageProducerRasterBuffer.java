/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ImageProducerRasterBuffer extends AwtRasterBuffer implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ColorModel colorModel;
    static ValidationState debouncingValidationState;
    private java.awt.image.ImageConsumer imageConsumer;
    static ResourceArchive activeTextArchive;

    final static EmailAvailabilityQuery createEmailAvailabilityQuery(byte methodGuard, String candidateEmail) {
        RuntimeException queryFailureForContext = null;
        EmailAvailabilityQuery createdQueryBeforeReturn = null;
        RuntimeException queryFailureBeforeDescription = null;
        StringBuilder queryMessagePrefix = null;
        String emailDescription = null;
        RuntimeException caughtQueryFailure = null;
        try {
          if (methodGuard != 86) {
            activeTextArchive = (ResourceArchive) null;
          }
          createdQueryBeforeReturn = new EmailAvailabilityQuery(candidateEmail);
          return createdQueryBeforeReturn;
        } catch (java.lang.RuntimeException queryFailure) {
          caughtQueryFailure = queryFailure;
          queryFailureForContext = caughtQueryFailure;
          queryFailureBeforeDescription = queryFailureForContext;
          queryMessagePrefix = new StringBuilder().append("bf.A(").append(methodGuard).append(',');
          if (candidateEmail == null) {
            emailDescription = "null";
          } else {
            emailDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) queryFailureBeforeDescription), ((StringBuilder) (Object) queryMessagePrefix).append(emailDescription).append(')').toString());
        }
    }

    private final synchronized void publishPixelsToConsumer(boolean methodGuard) {
        if (null == this.imageConsumer) {
            return;
        }
        this.imageConsumer.setPixels(0, 0, this.width, this.height, this.colorModel, this.pixels, 0, this.width);
        if (methodGuard) {
            this.imageConsumer.imageComplete(2);
            return;
        }
        activeTextArchive = (ResourceArchive) null;
        this.imageConsumer.imageComplete(2);
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer consumer) {
    }

    final void drawImage(int drawY, java.awt.Graphics graphics, int drawX, int methodGuard) {
        try {
            if (methodGuard != 0) {
                java.awt.Image nullImageForInvalidGuard = (java.awt.Image) null;
                this.imageUpdate((java.awt.Image) null, 94, -33, 114, 59, 88);
            }
            this.publishPixelsToConsumer(true);
            graphics.drawImage(this.image, drawX, drawY, (java.awt.image.ImageObserver) (this));
        } catch (RuntimeException imageDrawFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) imageDrawFailure), "bf.D(" + drawY + ',' + (graphics != null ? "{...}" : "null") + ',' + drawX + ',' + methodGuard + ')');
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer consumer) {
        return this.imageConsumer == consumer;
    }

    public final void startProduction(java.awt.image.ImageConsumer consumer) {
        try {
            this.addConsumer(consumer);
        } catch (RuntimeException productionStartFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) productionStartFailure), "bf.startProduction(" + (consumer != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer consumer) {
        try {
            this.imageConsumer = consumer;
            consumer.setDimensions(this.width, this.height);
            consumer.setProperties((Hashtable) null);
            consumer.setColorModel(this.colorModel);
            consumer.setHints(14);
        } catch (RuntimeException consumerRegistrationFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) consumerRegistrationFailure), "bf.addConsumer(" + (consumer != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean imageUpdate(java.awt.Image observedImage, int infoFlags, int updateX, int updateY, int updateWidth, int updateHeight) {
        RuntimeException imageUpdateFailureForContext = null;
        RuntimeException imageUpdateFailureBeforeDescription = null;
        StringBuilder imageUpdateMessagePrefix = null;
        String observedImageDescription = null;
        RuntimeException caughtImageUpdateFailure = null;
        try {
          return true;
        } catch (java.lang.RuntimeException imageUpdateFailure) {
          caughtImageUpdateFailure = imageUpdateFailure;
          imageUpdateFailureForContext = caughtImageUpdateFailure;
          imageUpdateFailureBeforeDescription = imageUpdateFailureForContext;
          imageUpdateMessagePrefix = new StringBuilder().append("bf.imageUpdate(");
          if (observedImage == null) {
            observedImageDescription = "null";
          } else {
            observedImageDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) imageUpdateFailureBeforeDescription), ((StringBuilder) (Object) imageUpdateMessagePrefix).append(observedImageDescription).append(',').append(infoFlags).append(',').append(updateX).append(',').append(updateY).append(',').append(updateWidth).append(',').append(updateHeight).append(')').toString());
        }
    }

    final void initialize(int height, java.awt.Component component, int width, byte methodGuard) {
        try {
            this.height = height;
            this.width = width;
            this.pixels = new int[height * width + 1];
            this.colorModel = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
            this.image = component.createImage((java.awt.image.ImageProducer) (this));
            this.publishPixelsToConsumer(true);
            component.prepareImage(this.image, (java.awt.image.ImageObserver) (this));
            this.publishPixelsToConsumer(true);
            component.prepareImage(this.image, (java.awt.image.ImageObserver) (this));
            this.publishPixelsToConsumer(true);
            component.prepareImage(this.image, (java.awt.image.ImageObserver) (this));
            this.setAsRasterTarget(255);
            if (methodGuard <= 116) {
                this.colorModel = (java.awt.image.ColorModel) null;
            }
        } catch (RuntimeException initializationFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) initializationFailure), "bf.C(" + height + ',' + (component != null ? "{...}" : "null") + ',' + width + ',' + methodGuard + ')');
        }
    }

    final static void drawDottedWhiteFocusRectangle(int rectangleTop, int rectangleWidth, int methodGuard, int rectangleHeight, int rectangleLeft) {
        int clippedLeftBeforeStore = 0;
        int clippedTopBeforeStore = 0;
        int clippedRightBeforeStore = 0;
        int clippedBottomBeforeStore = 0;
        RuntimeException caughtDrawFailure = null;
        int rectangleRight = 0;
        RuntimeException drawFailureForContext = null;
        int rectangleBottom = 0;
        int clippedLeft = 0;
        int clippedTop = 0;
        int clippedRight = 0;
        int clippedBottom = 0;
        int framebufferIndex = 0;
        int remainingDots = 0;
        int unusedClientControlSnapshot = 0;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          rectangleRight = rectangleWidth + rectangleLeft;
          rectangleBottom = rectangleTop + rectangleHeight;
          if (rectangleLeft <= SoftwareRasterizer.clipLeft) {
            clippedLeftBeforeStore = SoftwareRasterizer.clipLeft;
          } else {
            clippedLeftBeforeStore = rectangleLeft;
          }
          clippedLeft = clippedLeftBeforeStore;
          if (rectangleTop > SoftwareRasterizer.clipTop) {
            clippedTopBeforeStore = rectangleTop;
          } else {
            clippedTopBeforeStore = SoftwareRasterizer.clipTop;
          }
          clippedTop = clippedTopBeforeStore;
          if (SoftwareRasterizer.clipRight > rectangleRight) {
            clippedRightBeforeStore = rectangleRight;
          } else {
            clippedRightBeforeStore = SoftwareRasterizer.clipRight;
          }
          clippedRight = clippedRightBeforeStore;
          if (SoftwareRasterizer.clipBottom <= rectangleBottom) {
            clippedBottomBeforeStore = SoftwareRasterizer.clipBottom;
          } else {
            clippedBottomBeforeStore = rectangleBottom;
          }
          clippedBottom = clippedBottomBeforeStore;
          if (methodGuard != 14164) {
            return;
          }
          if (rectangleLeft >= SoftwareRasterizer.clipLeft &&
              rectangleLeft < SoftwareRasterizer.clipRight) {
            framebufferIndex = rectangleLeft + clippedTop * SoftwareRasterizer.stride;
            remainingDots = clippedBottom + 1 - clippedTop >> 1;
            while (true) {
              remainingDots--;
              if (0 > remainingDots) {
                break;
              }
              SoftwareRasterizer.framebuffer[framebufferIndex] = 16777215;
              framebufferIndex = framebufferIndex + SoftwareRasterizer.stride * 2;
            }
          }
          if (rectangleTop >= SoftwareRasterizer.clipTop &&
              SoftwareRasterizer.clipBottom > rectangleBottom) {
            framebufferIndex = clippedLeft + SoftwareRasterizer.stride * rectangleTop;
            remainingDots = -clippedLeft + 1 + clippedRight >> 1;
            while (true) {
              remainingDots--;
              if (remainingDots < 0) {
                break;
              }
              SoftwareRasterizer.framebuffer[framebufferIndex] = 16777215;
              framebufferIndex += 2;
            }
          }
          if (rectangleRight >= SoftwareRasterizer.clipLeft &&
              SoftwareRasterizer.clipRight > rectangleRight) {
            framebufferIndex = rectangleRight + ((1 & -rectangleLeft + rectangleRight) + clippedTop) * SoftwareRasterizer.stride;
            remainingDots = -clippedTop + 1 + clippedBottom >> 1;
            while (true) {
              remainingDots--;
              if (0 > remainingDots) {
                break;
              }
              SoftwareRasterizer.framebuffer[framebufferIndex] = 16777215;
              framebufferIndex = framebufferIndex + 2 * SoftwareRasterizer.stride;
            }
          }
          if (SoftwareRasterizer.clipTop <= rectangleTop &&
              SoftwareRasterizer.clipBottom > rectangleBottom) {
            framebufferIndex = SoftwareRasterizer.stride * rectangleBottom + (clippedLeft + (1 & -rectangleTop + rectangleBottom));
            remainingDots = 1 - (-clippedRight + clippedLeft) >> 1;
            while (true) {
              remainingDots--;
              if (remainingDots < 0) {
                return;
              }
              SoftwareRasterizer.framebuffer[framebufferIndex] = 16777215;
              framebufferIndex += 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException drawFailure) {
          caughtDrawFailure = drawFailure;
          drawFailureForContext = caughtDrawFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) drawFailureForContext), "bf.B(" + rectangleTop + ',' + rectangleWidth + ',' + methodGuard + ',' + rectangleHeight + ',' + rectangleLeft + ')');
        }
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer consumer) {
        try {
            if (consumer == this.imageConsumer) {
                this.imageConsumer = null;
            }
        } catch (RuntimeException consumerRemovalFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) consumerRemovalFailure), "bf.removeConsumer(" + (consumer != null ? "{...}" : "null") + ')');
        }
    }

    ImageProducerRasterBuffer() {
    }

    public static void releaseStaticReferences(byte methodGuard) {
        activeTextArchive = null;
        debouncingValidationState = null;
        if (methodGuard >= -101) {
            debouncingValidationState = (ValidationState) null;
        }
    }

    static {
        debouncingValidationState = new ValidationState();
    }
}
