/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class BufferedImageRasterBuffer extends RasterBuffer {
    private java.awt.Component component;

    final void initialize(int guard, int width, java.awt.Component component, int height) {
        this.height = height;
        this.width = width;
        this.pixels = new int[height * width + 1];
        java.awt.image.DataBufferInt var5 = new java.awt.image.DataBufferInt(this.pixels, this.pixels.length);
        java.awt.image.DirectColorModel var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        java.awt.image.WritableRaster var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6)).createCompatibleSampleModel(this.width, this.height), (java.awt.image.DataBuffer) ((Object) var5), (java.awt.Point) null);
        this.image = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6), var7, false, new Hashtable()));
        this.component = component;
        if (guard == 1018) {
          this.bindRaster(108);
          return;
        }
    }

    public BufferedImageRasterBuffer() {
    }

    final void drawImage(int x, int guard, int y, java.awt.Graphics graphics) {
        graphics.drawImage(this.image, x, y, (java.awt.image.ImageObserver) ((Object) this.component));
        if (guard != 0) {
          this.component = (java.awt.Component) null;
        }
    }
}
