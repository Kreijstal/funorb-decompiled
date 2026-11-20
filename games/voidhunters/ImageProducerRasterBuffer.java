/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ImageProducerRasterBuffer extends RasterBuffer implements java.awt.image.ImageProducer {
    private java.awt.image.ColorModel colorModel;
    static String field_i;
    private java.awt.Image image;
    private java.awt.image.ImageConsumer consumer;
    private java.awt.Canvas canvas;

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
          this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "hq.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final synchronized void publishPixels(byte param0) {
        if (param0 != 105) {
          java.awt.image.ImageConsumer var3 = (java.awt.image.ImageConsumer) null;
          this.isConsumer((java.awt.image.ImageConsumer) null);
          if (this.consumer == null) {
            return;
          }
          this.consumer.setPixels(0, 0, this.width, this.height, this.colorModel, this.pixels, 0, this.width);
          this.consumer.imageComplete(2);
          return;
        }
        if (this.consumer == null) {
          return;
        }
        this.consumer.setPixels(0, 0, this.width, this.height, this.colorModel, this.pixels, 0, this.width);
        this.consumer.imageComplete(2);
    }

    final void drawRegion(java.awt.Graphics param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        java.awt.Shape var9 = null;
        try {
          this.publishRegion(param2, param4, (byte) 31, param1, param7);
          var9 = param0.getClip();
          param0.clipRect(param6, param5, param1, param7);
          if (param3 != 32255) {
            this.image = (java.awt.Image) null;
          }
          param0.drawImage(this.image, -param4 + param6, param5 - param2, (java.awt.image.ImageObserver) ((Object) this.canvas));
          param0.setClip(var9);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "hq.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void persistRandomDat(byte param0) {
        try {
          Exception var1 = null;
          Throwable decompiledCaughtException = null;
          if (SetCountermeasureLauncherAimarc.field_r != null) {
            try {
              SetCountermeasureLauncherAimarc.field_r.seek(0, 0L);
              SetCountermeasureLauncherAimarc.field_r.write(24, AccountNameAvailabilityReplies.field_b.position, (byte) -88, AccountNameAvailabilityReplies.field_b.payload);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (param0 < 53) {
            return;
          }
          AccountNameAvailabilityReplies.field_b.position = AccountNameAvailabilityReplies.field_b.position + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == this.consumer;
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
          this.consumer = param0;
          param0.setDimensions(this.width, this.height);
          param0.setProperties((Hashtable) null);
          param0.setColorModel(this.colorModel);
          param0.setHints(14);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "hq.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    final void initialize(int param0, int param1, int param2, java.awt.Canvas param3) {
        this.canvas = param3;
        this.width = param1;
        this.height = param2;
        this.pixels = new int[this.height * this.width];
        this.colorModel = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
        this.image = this.canvas.createImage((java.awt.image.ImageProducer) (this));
        this.publishPixels((byte) 105);
        this.canvas.prepareImage(this.image, (java.awt.image.ImageObserver) ((Object) this.canvas));
        if (param0 != 4904) {
          return;
        }
        try {
          this.publishPixels((byte) 105);
          this.canvas.prepareImage(this.image, (java.awt.image.ImageObserver) ((Object) this.canvas));
          this.publishPixels((byte) 105);
          this.canvas.prepareImage(this.image, (java.awt.image.ImageObserver) ((Object) this.canvas));
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "hq.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearSharedReferences(byte param0) {
        int var1 = -59 / ((param0 + 84) / 41);
        field_i = null;
    }

    private final synchronized void publishRegion(int param0, int param1, byte param2, int param3, int param4) {
        if (this.consumer != null) {
          this.consumer.setPixels(param1, param0, param3, param4, this.colorModel, this.pixels, this.width * param0 + param1, this.width);
          this.consumer.imageComplete(2);
          if (param2 != 31) {
            java.awt.Canvas var7 = (java.awt.Canvas) null;
            this.initialize(39, -33, -57, (java.awt.Canvas) null);
          }
          return;
        }
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        try {
          if (param0 == this.consumer) {
            this.consumer = null;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "hq.removeConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    ImageProducerRasterBuffer() {
    }

    static {
        field_i = "Spawn enemy ship at mouse";
    }
}
