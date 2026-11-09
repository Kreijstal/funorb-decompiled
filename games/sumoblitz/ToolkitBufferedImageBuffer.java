/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ToolkitBufferedImageBuffer extends ToolkitRasterBuffer {
    private java.awt.Image image;
    private java.awt.Shape savedClip;
    private java.awt.Rectangle drawClip;
    private java.awt.Canvas canvas;

    final void initialize(java.awt.Canvas canvas, int height, int width, int guard) {
        this.canvas = canvas;
        this.drawClip = new java.awt.Rectangle();
        this.height = height;
        this.width = width;
        this.pixels = new int[this.width * this.height];
        int var5 = -61 % ((-34 - guard) / 39);
        java.awt.image.DataBufferInt var6 = new java.awt.image.DataBufferInt(this.pixels, this.pixels.length);
        java.awt.image.DirectColorModel var7 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        java.awt.image.WritableRaster var8 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var7)).createCompatibleSampleModel(this.width, this.height), (java.awt.image.DataBuffer) ((Object) var6), (java.awt.Point) null);
        this.image = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var7), var8, false, new Hashtable()));
    }

    private ToolkitBufferedImageBuffer() throws Throwable {
        throw new Error();
    }

    final void drawRegion(java.awt.Graphics graphics, int destinationY, int sourceY, int width, int sourceX, int height, int destinationX, byte guard) {
        this.savedClip = graphics.getClip();
        if (guard <= -47) {
          this.drawClip.y = destinationY;
          this.drawClip.height = height;
          this.drawClip.width = width;
          this.drawClip.x = destinationX;
          graphics.setClip((java.awt.Shape) ((Object) this.drawClip));
          graphics.drawImage(this.image, -sourceX + destinationX, destinationY - sourceY, (java.awt.image.ImageObserver) ((Object) this.canvas));
          graphics.setClip(this.savedClip);
          return;
        }
        java.awt.Graphics var10 = (java.awt.Graphics) null;
        this.drawRegion((java.awt.Graphics) null, 122, -30, 120, -56, -55, 53, (byte) 1);
        this.drawClip.y = destinationY;
        this.drawClip.height = height;
        this.drawClip.width = width;
        this.drawClip.x = destinationX;
        graphics.setClip((java.awt.Shape) ((Object) this.drawClip));
        graphics.drawImage(this.image, -sourceX + destinationX, destinationY - sourceY, (java.awt.image.ImageObserver) ((Object) this.canvas));
        graphics.setClip(this.savedClip);
    }
}
