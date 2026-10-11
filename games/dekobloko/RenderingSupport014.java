/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class RenderingSupport014 extends Framebuffer {
    private java.awt.Component componentState0003;

    final void performAction0467(int integerArgument1, byte byteArgument2, int integerArgument3, java.awt.Component componentArgument4) {
        java.awt.image.DataBufferInt dataBufferIntLocal1 = null;
        java.awt.image.DirectColorModel directColorModelLocal2 = null;
        java.awt.image.WritableRaster writableRasterLocal3 = null;
        java.awt.image.DataBufferInt dataBufferIntLocal4;
        java.awt.image.DirectColorModel directColorModelLocal5;
        java.awt.image.WritableRaster writableRasterLocal6;
        if (byteArgument2 == 83) {
          this.integerState0190 = integerArgument1;
          this.integerState0191 = integerArgument3;
          this.integerArrayState0040 = new int[integerArgument3 * integerArgument1 + 1];
          dataBufferIntLocal1 = new java.awt.image.DataBufferInt(this.integerArrayState0040, this.integerArrayState0040.length);
          directColorModelLocal2 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          writableRasterLocal3 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) directColorModelLocal2)).createCompatibleSampleModel(this.integerState0190, this.integerState0191), (java.awt.image.DataBuffer) ((Object) dataBufferIntLocal1), (java.awt.Point) null);
          this.imageState0001 = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) directColorModelLocal2), writableRasterLocal3, false, new Hashtable()));
          this.componentState0003 = componentArgument4;
          this.performAction0463((byte) -97);
          return;
        }
        java.awt.Graphics graphicsLocal7 = (java.awt.Graphics) null;
        this.performAction0464((byte) -42, (java.awt.Graphics) null, -83, -93);
        this.integerState0190 = integerArgument1;
        this.integerState0191 = integerArgument3;
        this.integerArrayState0040 = new int[integerArgument3 * integerArgument1 + 1];
        dataBufferIntLocal4 = new java.awt.image.DataBufferInt(this.integerArrayState0040, this.integerArrayState0040.length);
        directColorModelLocal5 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        writableRasterLocal6 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) directColorModelLocal5)).createCompatibleSampleModel(this.integerState0190, this.integerState0191), (java.awt.image.DataBuffer) ((Object) dataBufferIntLocal4), (java.awt.Point) null);
        this.imageState0001 = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) directColorModelLocal5), writableRasterLocal6, false, new Hashtable()));
        this.componentState0003 = componentArgument4;
        this.performAction0463((byte) -97);
    }

    final void performAction0464(byte byteArgument1, java.awt.Graphics graphicsArgument2, int integerArgument3, int integerArgument4) {
        graphicsArgument2.drawImage(this.imageState0001, integerArgument3, integerArgument4, (java.awt.image.ImageObserver) ((Object) this.componentState0003));
        if (byteArgument1 <= 38) {
          java.awt.Graphics graphicsLocal1 = (java.awt.Graphics) null;
          this.performAction0464((byte) -30, (java.awt.Graphics) null, -118, 16);
        }
    }

    public RenderingSupport014() {
    }
}
