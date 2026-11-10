/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class BufferedImageCanvasImageBuffer extends CanvasImageBuffer {
    private java.awt.Image field_k;
    private java.awt.Shape field_j;
    private java.awt.Rectangle field_l;
    private java.awt.Canvas canvas;

    final void initialize(java.awt.Canvas param0, int param1, int param2, int param3) {
        java.awt.image.DirectColorModel var6 = null;
        java.awt.image.WritableRaster var7 = null;
        this.canvas = param0;
        this.field_l = new java.awt.Rectangle();
        this.width = param1;
        this.height = param3;
        this.pixels = new int[this.width * this.height];
        java.awt.image.DataBufferInt var5 = new java.awt.image.DataBufferInt(this.pixels, this.pixels.length);
        if (param2 == 11329) {
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6)).createCompatibleSampleModel(this.width, this.height), (java.awt.image.DataBuffer) ((Object) var5), (java.awt.Point) null);
          this.field_k = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6), var7, false, new Hashtable()));
          return;
        }
    }

    final void drawRegion(int param0, int param1, int param2, int param3, int param4, int param5, java.awt.Graphics param6, int param7) {
        this.field_j = param6.getClip();
        this.field_l.y = param1;
        this.field_l.width = param7;
        this.field_l.x = param5;
        this.field_l.height = param0;
        if (param3 >= 61) {
          param6.setClip((java.awt.Shape) ((Object) this.field_l));
          param6.drawImage(this.field_k, -param2 + param5, -param4 + param1, (java.awt.image.ImageObserver) ((Object) this.canvas));
          param6.setClip(this.field_j);
          return;
        }
        this.field_k = (java.awt.Image) null;
        param6.setClip((java.awt.Shape) ((Object) this.field_l));
        param6.drawImage(this.field_k, -param2 + param5, -param4 + param1, (java.awt.image.ImageObserver) ((Object) this.canvas));
        param6.setClip(this.field_j);
    }

    private BufferedImageCanvasImageBuffer() throws Throwable {
        throw new Error();
    }
}
