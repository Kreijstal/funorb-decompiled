/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class BufferedImageAppletRasterBuffer extends AppletRasterBuffer {
    private java.awt.Component component;

    final void draw(java.awt.Graphics param0, int param1, byte param2, int param3) {
        int var5 = -11 / ((param2 + 6) / 41);
        param0.drawImage(this.image, param1, param3, (java.awt.image.ImageObserver) ((Object) this.component));
    }

    final void initialize(int param0, int param1, java.awt.Component param2, byte param3) {
        this.pixels = new int[param1 * param0 + 1];
        this.width = param0;
        this.height = param1;
        java.awt.image.DataBufferInt var5 = new java.awt.image.DataBufferInt(this.pixels, this.pixels.length);
        int var8 = 8 % ((12 - param3) / 45);
        java.awt.image.DirectColorModel var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        java.awt.image.WritableRaster var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6)).createCompatibleSampleModel(this.width, this.height), (java.awt.image.DataBuffer) ((Object) var5), (java.awt.Point) null);
        this.image = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6), var7, false, new Hashtable()));
        this.component = param2;
        this.bind((byte) -108);
    }

    public BufferedImageAppletRasterBuffer() {
    }
}
