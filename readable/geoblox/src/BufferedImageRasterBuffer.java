/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class BufferedImageRasterBuffer extends AwtRasterBuffer {
    private java.awt.Component imageObserverComponent;

    final void initialize(int height, java.awt.Component component, int width, byte methodGuard) {
        java.awt.image.DataBufferInt pixelDataBuffer = null;
        java.awt.image.DirectColorModel rgbColorModel = null;
        java.awt.image.WritableRaster imageRaster = null;
        java.awt.image.DataBufferInt fallbackPixelDataBuffer;
        java.awt.image.DirectColorModel fallbackRgbColorModel;
        java.awt.image.WritableRaster fallbackImageRaster;
        this.width = width;
        if (methodGuard > 116) {
            this.height = height;
            this.pixels = new int[1 + width * height];
            pixelDataBuffer = new java.awt.image.DataBufferInt(this.pixels, this.pixels.length);
            rgbColorModel = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
            imageRaster = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) rgbColorModel)).createCompatibleSampleModel(this.width, this.height), (java.awt.image.DataBuffer) ((Object) pixelDataBuffer), (java.awt.Point) null);
            this.image = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) rgbColorModel), imageRaster, false, new Hashtable()));
            this.imageObserverComponent = component;
            this.setAsRasterTarget(255);
            return;
        }
        this.imageObserverComponent = (java.awt.Component) null;
        this.height = height;
        this.pixels = new int[1 + width * height];
        fallbackPixelDataBuffer = new java.awt.image.DataBufferInt(this.pixels, this.pixels.length);
        fallbackRgbColorModel = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        fallbackImageRaster = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) fallbackRgbColorModel)).createCompatibleSampleModel(this.width, this.height), (java.awt.image.DataBuffer) ((Object) fallbackPixelDataBuffer), (java.awt.Point) null);
        this.image = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) fallbackRgbColorModel), fallbackImageRaster, false, new Hashtable()));
        this.imageObserverComponent = component;
        this.setAsRasterTarget(255);
    }

    final void drawImage(int drawY, java.awt.Graphics graphics, int drawX, int methodGuard) {
        if (methodGuard == 0) {
            graphics.drawImage(this.image, drawX, drawY, (java.awt.image.ImageObserver) ((Object) this.imageObserverComponent));
            return;
        }
        this.imageObserverComponent = (java.awt.Component) null;
        graphics.drawImage(this.image, drawX, drawY, (java.awt.image.ImageObserver) ((Object) this.imageObserverComponent));
    }

    public BufferedImageRasterBuffer() {
    }
}
