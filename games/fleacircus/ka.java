/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ka extends uc {
    private java.awt.Component field_i;

    final void a(java.awt.Component param0, int param1, int param2, int param3) {
        java.awt.image.DataBufferInt var5 = null;
        java.awt.image.DirectColorModel var6 = null;
        java.awt.image.WritableRaster var7 = null;
        java.awt.image.DataBufferInt var5Lifetime1;
        java.awt.image.DirectColorModel var6Lifetime1;
        java.awt.image.WritableRaster var7Lifetime1;
        if (param3 <= -72) {
          this.field_h = param1;
          this.field_f = param2;
          this.field_g = new int[1 + param2 * param1];
          var5 = new java.awt.image.DataBufferInt(this.field_g, this.field_g.length);
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6)).createCompatibleSampleModel(this.field_h, this.field_f), (java.awt.image.DataBuffer) ((Object) var5), (java.awt.Point) null);
          this.field_b = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6), var7, false, new Hashtable()));
          this.field_i = param0;
          this.a((byte) 115);
          return;
        }
        this.field_i = (java.awt.Component) null;
        this.field_h = param1;
        this.field_f = param2;
        this.field_g = new int[1 + param2 * param1];
        var5Lifetime1 = new java.awt.image.DataBufferInt(this.field_g, this.field_g.length);
        var6Lifetime1 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        var7Lifetime1 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6Lifetime1)).createCompatibleSampleModel(this.field_h, this.field_f), (java.awt.image.DataBuffer) ((Object) var5Lifetime1), (java.awt.Point) null);
        this.field_b = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6Lifetime1), var7Lifetime1, false, new Hashtable()));
        this.field_i = param0;
        this.a((byte) 115);
    }

    public ka() {
    }

    final void a(java.awt.Graphics param0, int param1, int param2, byte param3) {
        if (param3 >= 19) {
          param0.drawImage(this.field_b, param2, param1, (java.awt.image.ImageObserver) ((Object) this.field_i));
          return;
        }
        this.field_i = (java.awt.Component) null;
        param0.drawImage(this.field_b, param2, param1, (java.awt.image.ImageObserver) ((Object) this.field_i));
    }
}
