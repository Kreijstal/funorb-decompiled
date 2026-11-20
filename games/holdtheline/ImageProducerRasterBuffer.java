/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ImageProducerRasterBuffer extends RasterBuffer implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    static String field_o;
    static String field_j;
    static String field_k;
    static int field_m;
    static NameRequestState field_n;
    private java.awt.image.ImageConsumer consumer;
    private java.awt.image.ColorModel colorModel;

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return this.consumer == param0;
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
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
          stackIn_4_0 = var7;
          stackIn_4_1 = new StringBuilder().append("sf.imageUpdate(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final synchronized void publishPixels(int param0) {
        if (this.consumer == null) {
          return;
        }
        this.consumer.setPixels(param0, 0, this.width, this.height, this.colorModel, this.pixels, 0, this.width);
        this.consumer.imageComplete(2);
    }

    final static Sprite[] createSolidBeveledPanel(int param0, int param1, int param2, int param3) {
        if (param3 != 14) {
          return (Sprite[]) null;
        }
        return PasswordValidator.createSolidBeveledPanel(1, 1, param1, param2, param0);
    }

    final static long millisSinceServerActivity(int param0) {
        if (param0 <= 67) {
          return 77L;
        }
        return -MenuHitTesting.field_b + BoundaryLoopTracer.monotonicTimeMillis(-1);
    }

    final void draw(int param0, int param1, java.awt.Graphics param2, int param3) {
        try {
          this.publishPixels(0);
          param2.drawImage(this.image, param1, param0, (java.awt.image.ImageObserver) (this));
          if (param3 != 34) {
            field_o = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "sf.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
          this.consumer = param0;
          param0.setDimensions(this.width, this.height);
          param0.setProperties((Hashtable) null);
          param0.setColorModel(this.colorModel);
          param0.setHints(14);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "sf.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearSharedReferences(int param0) {
        field_j = null;
        if (param0 != -1) {
          ImageProducerRasterBuffer.clearSharedReferences(-126);
        }
        field_o = null;
        field_k = null;
        field_n = null;
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        try {
          if (this.consumer == param0) {
            this.consumer = null;
          }
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "sf.removeConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static Sprite createRadialLightSprite(int param0, byte param1, int param2) {
        int var7 = 0;
        int var8 = 0;
        int var3;
        int var4;
        int var5;
        Sprite var6;
        int var9;
        int var11;
        float var10;
        var11 = HoldTheLine.field_D;
        var3 = 1 + param0 * 2;
        var4 = param0 * 2 + 1;
        var5 = 29 % ((-27 - param1) / 49);
        var6 = new Sprite(var3, var4);
        for (var7 = -param0; var7 <= param0; var7++) {
          for (var8 = -param0; var8 <= param0; var8++) {
            var9 = param0 * param0 - (var7 * var7 + var8 * var8);
            if (var9 > 0) {
              var10 = (float)Math.sqrt((double)var9) / (float)param0;
              var6.pixels[var3 * (var8 + param0) + (param0 + var7)] = IterableSecondaryNodeDeque.scaleRgb(var10, -1, param2);
            }
          }
        }
        return var6;
    }

    final void initialize(int param0, int param1, java.awt.Component param2, int param3) {
        try {
          this.height = param1;
          this.width = param0;
          this.pixels = new int[1 + param0 * param1];
          this.colorModel = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
          this.image = param2.createImage((java.awt.image.ImageProducer) (this));
          this.publishPixels(0);
          param2.prepareImage(this.image, (java.awt.image.ImageObserver) (this));
          this.publishPixels(0);
          param2.prepareImage(this.image, (java.awt.image.ImageObserver) (this));
          this.publishPixels(param3);
          param2.prepareImage(this.image, (java.awt.image.ImageObserver) (this));
          this.bindRaster(false);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "sf.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
          this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "sf.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void serviceAudio(int param0) {
        SoundPlayback var1 = null;
        int var2 = HoldTheLine.field_D;
        SoundPlayback var1Lifetime1;
        try {
          LoginChoicePanel.field_G.service();
          if (param0 != -1379) {
            ImageProducerRasterBuffer.clearSharedReferences(-82);
          }
          DraggableWidget.field_G.service();
          ValidationIndicator.field_G = ValidationIndicator.field_G - 1;
          if (0 == ValidationIndicator.field_G) {
            ValidationIndicator.field_G = 200;
            var1 = (SoundPlayback) (SecondaryNodeDeque.field_b.first((byte) 118));
            while (var1 != null) {
              if (!var1.field_k.isLinked(116)) {
                var1.unlink(0);
              }
              var1 = (SoundPlayback) (SecondaryNodeDeque.field_b.next((byte) 93));
            }
            if (null != TimedValidator.field_b) {
              var1Lifetime1 = (SoundPlayback) (TimedValidator.field_b.first((byte) 120));
              while (var1Lifetime1 != null) {
                if (!var1Lifetime1.field_k.isLinked(88)) {
                  var1Lifetime1.unlink(0);
                }
                var1Lifetime1 = (SoundPlayback) (TimedValidator.field_b.next((byte) -51));
              }
            }
          }
          if (ShadedNineSlicePanel.field_m != null &&
            ShadedNineSlicePanel.field_m.isReady((byte) 85)) {
          }
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "sf.J(" + param0 + ')');
        }
    }

    final static int divideWithNegativeBias(int param0, int param1, byte param2) {
        int var4 = 106 / ((12 - param2) / 42);
        int var3 = param0 >>> 31;
        return -var3 + (var3 + param0) / param1;
    }

    ImageProducerRasterBuffer() {
    }

    static {
        field_j = "Continue";
        field_o = "Age:";
        field_k = "Your vehicle can only hold <col=1>three</col> powerups at any one time. Collecting a fourth will replace the <col=1>oldest</col> powerup. Power-ups can also be lost in collisions or by being hit by weapons.<br><br>Each colour of powerup has a different effect, and the strength of the effect depends on how many powerups of that colour you currently have.";
        field_n = new NameRequestState();
    }
}
