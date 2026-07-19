/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qb extends rc {
    private java.awt.Component field_e;

    final void a(int param0, java.awt.Graphics param1, int param2, int param3) {
        boolean discarded$10 = param1.drawImage(this.field_d, param2, param3, (java.awt.image.ImageObserver) ((Object) this.field_e));
        if (param0 != -11) {
            this.field_e = (java.awt.Component) null;
        }
    }

    final void a(int param0, int param1, java.awt.Component param2, int param3) {
        java.awt.image.DataBufferInt var5 = null;
        java.awt.image.DirectColorModel var6 = null;
        java.awt.image.WritableRaster var7 = null;
        if (param1 > -37) {
          this.field_e = (java.awt.Component) null;
          this.field_b = new int[param0 * param3 - -1];
          this.field_a = param3;
          this.field_c = param0;
          var5 = new java.awt.image.DataBufferInt(this.field_b, this.field_b.length);
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6)).createCompatibleSampleModel(this.field_c, this.field_a), (java.awt.image.DataBuffer) ((Object) var5), (java.awt.Point) null);
          this.field_d = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6), var7, false, new Hashtable()));
          this.field_e = param2;
          this.a(-91);
          return;
        } else {
          this.field_b = new int[param0 * param3 - -1];
          this.field_a = param3;
          this.field_c = param0;
          var5 = new java.awt.image.DataBufferInt(this.field_b, this.field_b.length);
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6)).createCompatibleSampleModel(this.field_c, this.field_a), (java.awt.image.DataBuffer) ((Object) var5), (java.awt.Point) null);
          this.field_d = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6), var7, false, new Hashtable()));
          this.field_e = param2;
          this.a(-91);
          return;
        }
    }

    public qb() {
    }
}
