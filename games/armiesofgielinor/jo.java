/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jo extends bi {
    private java.awt.Component field_i;

    final void a(int param0, java.awt.Graphics param1, int param2, int param3) {
        if (param0 != 255) {
            return;
        }
        boolean discarded$0 = param1.drawImage(this.field_h, param3, param2, (java.awt.image.ImageObserver) ((Object) this.field_i));
    }

    public jo() {
    }

    final void a(int param0, int param1, java.awt.Component param2, int param3) {
        java.awt.image.DataBufferInt var5 = null;
        java.awt.image.DirectColorModel var6 = null;
        java.awt.image.WritableRaster var7 = null;
        java.awt.Component var8 = null;
        this.field_g = param3;
        this.field_b = new int[param0 * param3 + 1];
        this.field_a = param0;
        if (param1 != -46) {
          var8 = (java.awt.Component) null;
          this.a(-98, -77, (java.awt.Component) null, -93);
          var5 = new java.awt.image.DataBufferInt(this.field_b, this.field_b.length);
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6)).createCompatibleSampleModel(this.field_a, this.field_g), (java.awt.image.DataBuffer) ((Object) var5), (java.awt.Point) null);
          this.field_h = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6), var7, false, new Hashtable()));
          this.field_i = param2;
          this.a(5605);
          return;
        } else {
          var5 = new java.awt.image.DataBufferInt(this.field_b, this.field_b.length);
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6)).createCompatibleSampleModel(this.field_a, this.field_g), (java.awt.image.DataBuffer) ((Object) var5), (java.awt.Point) null);
          this.field_h = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6), var7, false, new Hashtable()));
          this.field_i = param2;
          this.a(5605);
          return;
        }
    }
}
