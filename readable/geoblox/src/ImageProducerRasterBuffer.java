/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ImageProducerRasterBuffer extends AwtRasterBuffer implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ColorModel colorModel;
    static lh field_g;
    private java.awt.image.ImageConsumer imageConsumer;
    static ResourceArchive activeTextArchive;

    final static h a(byte param0, String param1) {
        RuntimeException var2 = null;
        h stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 86) {
            activeTextArchive = (ResourceArchive) null;
          }
          stackIn_3_0 = new h(param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = (RuntimeException) (var2);
          stackIn_6_1 = new StringBuilder().append("bf.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
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
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "bf.startProduction(" + (consumer != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer consumer) {
        try {
            this.imageConsumer = consumer;
            consumer.setDimensions(this.width, this.height);
            consumer.setProperties((Hashtable) null);
            consumer.setColorModel(this.colorModel);
            consumer.setHints(14);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "bf.addConsumer(" + (consumer != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean imageUpdate(java.awt.Image observedImage, int infoFlags, int updateX, int updateY, int updateWidth, int updateHeight) {
        RuntimeException var7 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_4_0 = (RuntimeException) (var7);
          stackIn_4_1 = new StringBuilder().append("bf.imageUpdate(");
          if (observedImage == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(infoFlags).append(',').append(updateX).append(',').append(updateY).append(',').append(updateWidth).append(',').append(updateHeight).append(')').toString());
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

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = Geoblox.field_C;
        try {
          var5_int = param1 + param4;
          var6 = param0 + param3;
          if (param4 <= SoftwareRasterizer.clipLeft) {
            stackIn_4_0 = SoftwareRasterizer.clipLeft;
          } else {
            stackIn_4_0 = param4;
          }
          var7 = stackIn_4_0;
          if (param0 > SoftwareRasterizer.clipTop) {
            stackIn_7_0 = param0;
          } else {
            stackIn_7_0 = SoftwareRasterizer.clipTop;
          }
          var8 = stackIn_7_0;
          if (SoftwareRasterizer.clipRight > var5_int) {
            stackIn_10_0 = var5_int;
          } else {
            stackIn_10_0 = SoftwareRasterizer.clipRight;
          }
          var9 = stackIn_10_0;
          if (SoftwareRasterizer.clipBottom <= var6) {
            stackIn_13_0 = SoftwareRasterizer.clipBottom;
          } else {
            stackIn_13_0 = var6;
          }
          var10 = stackIn_13_0;
          if (param2 != 14164) {
            return;
          }
          L4: {
            if ((param4 >= SoftwareRasterizer.clipLeft) &&
                (param4 < SoftwareRasterizer.clipRight)) {
              var11 = param4 + var8 * SoftwareRasterizer.stride;
              var12 = var10 + 1 - var8 >> 1;
              while (true) {
                var12--;
                if (0 > var12) {
                  break L4;
                }
                SoftwareRasterizer.framebuffer[var11] = 16777215;
                var11 = var11 + SoftwareRasterizer.stride * 2;
                continue;
              }
            }
          }
          L6: {
            if ((param0 >= SoftwareRasterizer.clipTop) &&
                (SoftwareRasterizer.clipBottom > var6)) {
              var11 = var7 + SoftwareRasterizer.stride * param0;
              var12 = -var7 + 1 + var9 >> 1;
              while (true) {
                var12--;
                if (var12 < 0) {
                  break L6;
                }
                SoftwareRasterizer.framebuffer[var11] = 16777215;
                var11 += 2;
                continue;
              }
            }
          }
          L8: {
            if ((var5_int >= SoftwareRasterizer.clipLeft) &&
                (SoftwareRasterizer.clipRight > var5_int)) {
              var11 = var5_int + ((1 & -param4 + var5_int) + var8) * SoftwareRasterizer.stride;
              var12 = -var8 + 1 + var10 >> 1;
              while (true) {
                var12--;
                if (0 > var12) {
                  break L8;
                }
                SoftwareRasterizer.framebuffer[var11] = 16777215;
                var11 = var11 + 2 * SoftwareRasterizer.stride;
                continue;
              }
            }
          }
          if ((SoftwareRasterizer.clipTop <= param0) &&
              (SoftwareRasterizer.clipBottom > var6)) {
            var11 = SoftwareRasterizer.stride * var6 + (var7 + (1 & -param0 + var6));
            var12 = 1 - (-var9 + var7) >> 1;
            while (true) {
              var12--;
              if (var12 < 0) {
                return;
              }
              SoftwareRasterizer.framebuffer[var11] = 16777215;
              var11 += 2;
              continue;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var5), "bf.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer consumer) {
        try {
            if (consumer == this.imageConsumer) {
                this.imageConsumer = null;
            }
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "bf.removeConsumer(" + (consumer != null ? "{...}" : "null") + ')');
        }
    }

    ImageProducerRasterBuffer() {
    }

    public static void c(byte param0) {
        activeTextArchive = null;
        field_g = null;
        if (param0 >= -101) {
            field_g = (lh) null;
        }
    }

    static {
        field_g = new lh();
    }
}
