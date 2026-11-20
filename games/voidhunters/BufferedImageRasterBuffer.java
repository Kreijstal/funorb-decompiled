/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class BufferedImageRasterBuffer extends RasterBuffer {
    private java.awt.Canvas canvas;
    private java.awt.Shape previousClip;
    private java.awt.Rectangle clipRectangle;
    private java.awt.Image image;

    final void drawRegion(java.awt.Graphics param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.previousClip = param0.getClip();
        this.clipRectangle.x = param6;
        this.clipRectangle.width = param1;
        this.clipRectangle.height = param7;
        this.clipRectangle.y = param5;
        param0.setClip((java.awt.Shape) ((Object) this.clipRectangle));
        param0.drawImage(this.image, param6 - param4, -param2 + param5, (java.awt.image.ImageObserver) ((Object) this.canvas));
        if (param3 == 32255) {
          param0.setClip(this.previousClip);
          return;
        }
        java.awt.Graphics var10 = (java.awt.Graphics) null;
        this.drawRegion((java.awt.Graphics) null, -3, 82, 99, 101, 54, -103, -62);
        param0.setClip(this.previousClip);
    }

    final void initialize(int param0, int param1, int param2, java.awt.Canvas param3) {
        java.awt.image.DataBufferInt var5 = null;
        java.awt.image.DirectColorModel var6 = null;
        java.awt.image.WritableRaster var7 = null;
        this.canvas = param3;
        this.clipRectangle = new java.awt.Rectangle();
        this.height = param2;
        this.width = param1;
        this.pixels = new int[this.height * this.width];
        if (param0 == 4904) {
          var5 = new java.awt.image.DataBufferInt(this.pixels, this.pixels.length);
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6)).createCompatibleSampleModel(this.width, this.height), (java.awt.image.DataBuffer) ((Object) var5), (java.awt.Point) null);
          this.image = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6), var7, false, new Hashtable()));
          return;
        }
    }

    private BufferedImageRasterBuffer() throws Throwable {
        throw new Error();
    }
}
