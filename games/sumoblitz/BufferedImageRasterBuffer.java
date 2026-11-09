/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class BufferedImageRasterBuffer extends RasterBuffer {
    private java.awt.Component component;

    final void drawImage(int guard, int x, java.awt.Graphics graphics, int y) {
        if (guard >= -47) {
          return;
        }
        graphics.drawImage(this.image, x, y, (java.awt.image.ImageObserver) ((Object) this.component));
    }

    public BufferedImageRasterBuffer() {
    }

    final void initializeRaster(java.awt.Component component, int height, int width, int guard) {
        java.awt.image.DataBufferInt var5 = null;
        java.awt.image.DirectColorModel var6 = null;
        java.awt.image.WritableRaster var7 = null;
        this.pixels = new int[1 + height * width];
        this.height = height;
        this.width = width;
        if (guard < -97) {
          var5 = new java.awt.image.DataBufferInt(this.pixels, this.pixels.length);
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6)).createCompatibleSampleModel(this.width, this.height), (java.awt.image.DataBuffer) ((Object) var5), (java.awt.Point) null);
          this.image = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6), var7, false, new Hashtable()));
          this.component = component;
          this.bindRaster(-1);
          return;
        }
    }
}
