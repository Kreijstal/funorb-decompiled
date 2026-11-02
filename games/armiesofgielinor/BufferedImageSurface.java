/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class BufferedImageSurface extends RasterImageSurface {
    private java.awt.Component observerComponent;

    final void paint(int obfuscationGuard, java.awt.Graphics graphics, int y, int x) {
        if (obfuscationGuard != 255) {
          return;
        }
        graphics.drawImage(this.image, x, y, (java.awt.image.ImageObserver) ((Object) this.observerComponent));
    }

    public BufferedImageSurface() {
    }

    final void allocate(int width, int obfuscationGuard, java.awt.Component component, int height) {
        java.awt.image.DataBufferInt var5 = null;
        java.awt.image.DirectColorModel var6 = null;
        java.awt.image.WritableRaster var7 = null;
        java.awt.image.DataBufferInt var5Lifetime1;
        java.awt.image.DirectColorModel var6Lifetime1;
        java.awt.image.WritableRaster var7Lifetime1;
        this.height = height;
        this.pixels = new int[width * height + 1];
        this.width = width;
        if (obfuscationGuard == -46) {
          var5 = new java.awt.image.DataBufferInt(this.pixels, this.pixels.length);
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6)).createCompatibleSampleModel(this.width, this.height), (java.awt.image.DataBuffer) ((Object) var5), (java.awt.Point) null);
          this.image = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6), var7, false, new Hashtable()));
          this.observerComponent = component;
          this.bindRasterTarget(5605);
          return;
        }
        java.awt.Component var8 = (java.awt.Component) null;
        this.allocate(-98, -77, (java.awt.Component) null, -93);
        var5Lifetime1 = new java.awt.image.DataBufferInt(this.pixels, this.pixels.length);
        var6Lifetime1 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        var7Lifetime1 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6Lifetime1)).createCompatibleSampleModel(this.width, this.height), (java.awt.image.DataBuffer) ((Object) var5Lifetime1), (java.awt.Point) null);
        this.image = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6Lifetime1), var7Lifetime1, false, new Hashtable()));
        this.observerComponent = component;
        this.bindRasterTarget(5605);
    }
}
