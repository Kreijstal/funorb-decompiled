/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ToolkitImageProducerBuffer extends ToolkitRasterBuffer implements java.awt.image.ImageProducer {
    static Sprite[] field_v;
    static int field_r;
    private java.awt.image.ColorModel colorModel;
    static int field_u;
    private java.awt.Image image;
    private java.awt.image.ImageConsumer consumer;
    static String loadingText;
    private java.awt.Canvas canvas;

    final static Boolean c(int param0) {
        Boolean var1 = HardwareGraphicsToolkit.field_j;
        HardwareGraphicsToolkit.field_j = null;
        int var2 = -13 % ((8 - param0) / 32);
        return var1;
    }

    private final synchronized void a(int param0, int param1, int param2, boolean param3, int param4) {
        if (null == this.consumer) {
          return;
        }
        this.consumer.setPixels(param1, param0, param2, param4, this.colorModel, this.pixels, this.width * param0 + param1, this.width);
        if (param3) {
          this.consumer.imageComplete(2);
          return;
        }
        field_v = (Sprite[]) null;
        this.consumer.imageComplete(2);
    }

    private final synchronized void c(boolean param0) {
        if (this.consumer == null) {
          return;
        }
        if (param0) {
          this.consumer.setPixels(0, 0, this.width, this.height, this.colorModel, this.pixels, 0, this.width);
          this.consumer.imageComplete(2);
          return;
        }
        field_v = (Sprite[]) null;
        this.consumer.setPixels(0, 0, this.width, this.height, this.colorModel, this.pixels, 0, this.width);
        this.consumer.imageComplete(2);
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        try {
          if (this.consumer == param0) {
            this.consumer = null;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "li.removeConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public static void releaseStatics(int param0) {
        if (param0 < 118) {
          return;
        }
        field_v = null;
        loadingText = null;
    }

    final void initialize(java.awt.Canvas canvas, int height, int width, int guard) {
        try {
          this.height = height;
          this.width = width;
          this.canvas = canvas;
          this.pixels = new int[this.width * this.height];
          this.colorModel = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
          this.image = this.canvas.createImage((java.awt.image.ImageProducer) (this));
          this.c(true);
          this.canvas.prepareImage(this.image, (java.awt.image.ImageObserver) ((Object) this.canvas));
          int var5_int = 85 / ((-34 - guard) / 39);
          this.c(true);
          this.canvas.prepareImage(this.image, (java.awt.image.ImageObserver) ((Object) this.canvas));
          this.c(true);
          this.canvas.prepareImage(this.image, (java.awt.image.ImageObserver) ((Object) this.canvas));
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "li.A(" + (canvas != null ? "{...}" : "null") + ',' + height + ',' + width + ',' + guard + ')');
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == this.consumer;
    }

    ToolkitImageProducerBuffer() {
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
          this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "li.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void drawRegion(java.awt.Graphics graphics, int destinationY, int sourceY, int width, int sourceX, int height, int destinationX, byte guard) {
        java.awt.Shape var9 = null;
        try {
          this.a(sourceY, sourceX, width, true, height);
          if (guard >= -47) {
            java.awt.Canvas var10 = (java.awt.Canvas) null;
            this.initialize((java.awt.Canvas) null, -85, -107, 85);
          }
          var9 = graphics.getClip();
          graphics.clipRect(destinationX, destinationY, width, height);
          graphics.drawImage(this.image, -sourceX + destinationX, -sourceY + destinationY, (java.awt.image.ImageObserver) ((Object) this.canvas));
          graphics.setClip(var9);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "li.B(" + (graphics != null ? "{...}" : "null") + ',' + destinationY + ',' + sourceY + ',' + width + ',' + sourceX + ',' + height + ',' + destinationX + ',' + guard + ')');
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
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "li.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_r = -1;
        loadingText = "Loading...";
    }
}
