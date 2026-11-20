/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class BufferedImageRasterBuffer extends RasterBuffer {
    private java.awt.Component field_i;

    final void initialize(int param0, int param1, java.awt.Component param2, int param3) {
        java.awt.image.DataBufferInt var5 = null;
        java.awt.image.DirectColorModel var6 = null;
        java.awt.image.WritableRaster var7 = null;
        java.awt.image.DataBufferInt var5Lifetime1;
        java.awt.image.DirectColorModel var6Lifetime1;
        java.awt.image.WritableRaster var7Lifetime1;
        this.pixels = new int[param0 * param1 + 1];
        this.height = param1;
        this.width = param0;
        if (param3 == 0) {
          var5 = new java.awt.image.DataBufferInt(this.pixels, this.pixels.length);
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6)).createCompatibleSampleModel(this.width, this.height), (java.awt.image.DataBuffer) ((Object) var5), (java.awt.Point) null);
          this.image = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6), var7, false, new Hashtable()));
          this.field_i = param2;
          this.bindRaster(false);
          return;
        }
        this.field_i = (java.awt.Component) null;
        var5Lifetime1 = new java.awt.image.DataBufferInt(this.pixels, this.pixels.length);
        var6Lifetime1 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        var7Lifetime1 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6Lifetime1)).createCompatibleSampleModel(this.width, this.height), (java.awt.image.DataBuffer) ((Object) var5Lifetime1), (java.awt.Point) null);
        this.image = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6Lifetime1), var7Lifetime1, false, new Hashtable()));
        this.field_i = param2;
        this.bindRaster(false);
    }

    public BufferedImageRasterBuffer() {
    }

    final void draw(int param0, int param1, java.awt.Graphics param2, int param3) {
        if (param3 == 34) {
          param2.drawImage(this.image, param1, param0, (java.awt.image.ImageObserver) ((Object) this.field_i));
          return;
        }
        java.awt.Component var6 = (java.awt.Component) null;
        this.initialize(40, 118, (java.awt.Component) null, -42);
        param2.drawImage(this.image, param1, param0, (java.awt.image.ImageObserver) ((Object) this.field_i));
    }
}
