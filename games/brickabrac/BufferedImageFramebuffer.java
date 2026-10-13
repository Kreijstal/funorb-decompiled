/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class BufferedImageFramebuffer extends SoftwareFramebuffer {
    private java.awt.Component component;

    final void draw(int y, int x, int obfuscationGuard, java.awt.Graphics graphics) {
        graphics.drawImage(this.image, x, y, (java.awt.image.ImageObserver) ((Object) this.component));
        if (obfuscationGuard != -17260) {
          java.awt.Graphics var6 = (java.awt.Graphics) null;
          this.draw(84, 3, -39, (java.awt.Graphics) null);
        }
    }

    final void initialize(java.awt.Component component, int height, boolean obfuscationGuard, int width) {
        this.width = width;
        this.height = height;
        this.pixels = new int[1 + width * height];
        java.awt.image.DataBufferInt dataBuffer = new java.awt.image.DataBufferInt(this.pixels, this.pixels.length);
        java.awt.image.DirectColorModel colorModel = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        java.awt.image.WritableRaster raster = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) colorModel)).createCompatibleSampleModel(this.width, this.height), (java.awt.image.DataBuffer) ((Object) dataBuffer), (java.awt.Point) null);
        if (obfuscationGuard) {
          this.image = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) colorModel), raster, false, new Hashtable()));
          this.component = component;
          this.bindRaster((byte) 74);
          return;
        }
        java.awt.Graphics var8 = (java.awt.Graphics) null;
        this.draw(-19, 8, 121, (java.awt.Graphics) null);
        this.image = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) colorModel), raster, false, new Hashtable()));
        this.component = component;
        this.bindRaster((byte) 74);
    }

    public BufferedImageFramebuffer() {
    }
}
