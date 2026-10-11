/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qn extends l {
    private java.awt.Component field_i;

    public qn() {
    }

    final void a(int param0, java.awt.Graphics param1, int param2, int param3) {
        if (param2 == 2) {
          param1.drawImage(this.field_g, param3, param0, (java.awt.image.ImageObserver) ((Object) this.field_i));
          return;
        }
        java.awt.Component var6 = (java.awt.Component) null;
        this.a(87, (java.awt.Component) null, -87, -91);
        param1.drawImage(this.field_g, param3, param0, (java.awt.image.ImageObserver) ((Object) this.field_i));
    }

    final void a(int param0, java.awt.Component param1, int param2, int param3) {
        java.awt.image.DataBufferInt var5 = null;
        java.awt.image.DirectColorModel var6 = null;
        java.awt.image.WritableRaster var7 = null;
        java.awt.image.DataBufferInt var5Lifetime1;
        java.awt.image.DirectColorModel var6Lifetime1;
        java.awt.image.WritableRaster var7Lifetime1;
        this.field_f = param2;
        if (param0 == -6) {
          this.field_b = new int[param2 * param3 + 1];
          this.field_h = param3;
          var5 = new java.awt.image.DataBufferInt(this.field_b, this.field_b.length);
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6)).createCompatibleSampleModel(this.field_h, this.field_f), (java.awt.image.DataBuffer) ((Object) var5), (java.awt.Point) null);
          this.field_g = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6), var7, false, new Hashtable()));
          this.field_i = param1;
          this.b((byte) 112);
          return;
        }
        this.field_i = (java.awt.Component) null;
        this.field_b = new int[param2 * param3 + 1];
        this.field_h = param3;
        var5Lifetime1 = new java.awt.image.DataBufferInt(this.field_b, this.field_b.length);
        var6Lifetime1 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        var7Lifetime1 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6Lifetime1)).createCompatibleSampleModel(this.field_h, this.field_f), (java.awt.image.DataBuffer) ((Object) var5Lifetime1), (java.awt.Point) null);
        this.field_g = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6Lifetime1), var7Lifetime1, false, new Hashtable()));
        this.field_i = param1;
        this.b((byte) 112);
    }
}
