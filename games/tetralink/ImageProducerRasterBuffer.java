/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ImageProducerRasterBuffer extends RasterBuffer implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    static java.awt.Image field_p;
    private java.awt.image.ColorModel field_o;
    static int field_l;
    static String[] field_n;
    private java.awt.image.ImageConsumer field_m;

    final static boolean hasStatButtonCookie(int param0) {
        if (param0 == 2) {
          return DebouncedValidator.hasTuhstatbutCookie(-17840, ProgressMessageDialog.getHostApplet(param0 + 11));
        }
        field_p = (java.awt.Image) null;
        return DebouncedValidator.hasTuhstatbutCookie(-17840, ProgressMessageDialog.getHostApplet(param0 + 11));
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return this.field_m == param0;
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
          stackIn_4_1 = new StringBuilder().append("wm.imageUpdate(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void initialize(java.awt.Component param0, int param1, int param2, int param3) {
        this.field_j = param3;
        this.field_h = param2;
        this.field_g = new int[1 + param3 * param2];
        this.field_o = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
        this.field_c = param0.createImage((java.awt.image.ImageProducer) (this));
        this.pushPixels(param1 - 103);
        param0.prepareImage(this.field_c, (java.awt.image.ImageObserver) (this));
        this.pushPixels(-72);
        param0.prepareImage(this.field_c, (java.awt.image.ImageObserver) (this));
        if (param1 != 42) {
          return;
        }
        try {
          this.pushPixels(-115);
          param0.prepareImage(this.field_c, (java.awt.image.ImageObserver) (this));
          this.makeRasterTarget(63);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "wm.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void drawImage(int param0, int param1, int param2, java.awt.Graphics param3) {
        try {
          this.pushPixels(-109);
          param3.drawImage(this.field_c, param2, param1, (java.awt.image.ImageObserver) (this));
          if (param0 != 10) {
            java.awt.image.ImageConsumer var6 = (java.awt.image.ImageConsumer) null;
            this.startProduction((java.awt.image.ImageConsumer) null);
          }
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "wm.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    final static Sprite[] createSolidFrameSprites(byte param0, int param1, int param2) {
        if (param0 == 28) {
          return MidiPcmStream.createSolidFrameSprites(param2, param1, 1, (byte) 64);
        }
        ImageProducerRasterBuffer.createFrameSprites(false, -66, 87, -112);
        return MidiPcmStream.createSolidFrameSprites(param2, param1, 1, (byte) 64);
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
          this.field_m = param0;
          param0.setDimensions(this.field_h, this.field_j);
          param0.setProperties((Hashtable) null);
          param0.setColorModel(this.field_o);
          param0.setHints(14);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "wm.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_m != param0) {
            return;
          }
          this.field_m = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("wm.removeConsumer(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void releaseStatics(boolean param0) {
        if (!param0) {
          ImageProducerRasterBuffer.isAwaitingLoginResponse(52);
          field_p = null;
          field_n = null;
          return;
        }
        field_p = null;
        field_n = null;
    }

    private final synchronized void pushPixels(int param0) {
        if (this.field_m == null) {
          return;
        }
        if (param0 < -52) {
          this.field_m.setPixels(0, 0, this.field_h, this.field_j, this.field_o, this.field_g, 0, this.field_h);
          this.field_m.imageComplete(2);
          return;
        }
        ImageProducerRasterBuffer.alwaysTrue(64);
        this.field_m.setPixels(0, 0, this.field_h, this.field_j, this.field_o, this.field_g, 0, this.field_h);
        this.field_m.imageComplete(2);
    }

    ImageProducerRasterBuffer() {
    }

    final static Sprite[] createFrameSprites(boolean param0, int param1, int param2, int param3) {
        if (param0) {
          return (Sprite[]) null;
        }
        return RasterTargetHelpers.createSolidBorderFrame(param1, 1, param2, param3, (byte) 126);
    }

    final static boolean alwaysTrue(int param0) {
        if (param0 != 0) {
          return false;
        }
        return true;
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
          this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "wm.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean isAwaitingLoginResponse(int param0) {
        if (param0 != -14688) {
          field_n = (String[]) null;
          if (null == TriangleSpanHelpers.field_e) {
            return false;
          }
          if (SparkParticle.field_p.isPostRequestStage((byte) 108)) {
            return true;
          }
          return false;
        }
        if (null == TriangleSpanHelpers.field_e) {
          return false;
        }
        if (SparkParticle.field_p.isPostRequestStage((byte) 108)) {
          return true;
        }
        return false;
    }

    static {
        field_n = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
    }
}
