/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vo extends iq {
    private java.awt.Component field_m;

    final void a(java.awt.Graphics param0, int param1, int param2, int param3) {
        boolean discarded$10 = param0.drawImage(this.field_c, param1, param2, (java.awt.image.ImageObserver) ((Object) this.field_m));
        if (param3 != -23820) {
            java.awt.Graphics var6 = (java.awt.Graphics) null;
            this.a((java.awt.Graphics) null, 50, 82, 44);
        }
    }

    public vo() {
    }

    final void a(int param0, int param1, int param2, java.awt.Component param3) {
        java.awt.image.DataBufferInt var5 = null;
        java.awt.image.DirectColorModel var6 = null;
        java.awt.image.WritableRaster var7 = null;
        java.awt.Component var8 = null;
        if (param2 != -6980) {
          var8 = (java.awt.Component) null;
          this.a(16, 8, -58, (java.awt.Component) null);
          this.field_h = new int[param1 * param0 + 1];
          this.field_k = param0;
          this.field_e = param1;
          var5 = new java.awt.image.DataBufferInt(this.field_h, this.field_h.length);
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6)).createCompatibleSampleModel(this.field_e, this.field_k), (java.awt.image.DataBuffer) ((Object) var5), (java.awt.Point) null);
          this.field_c = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6), var7, false, new Hashtable()));
          this.field_m = param3;
          this.b(15100);
          return;
        } else {
          this.field_h = new int[param1 * param0 + 1];
          this.field_k = param0;
          this.field_e = param1;
          var5 = new java.awt.image.DataBufferInt(this.field_h, this.field_h.length);
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6)).createCompatibleSampleModel(this.field_e, this.field_k), (java.awt.image.DataBuffer) ((Object) var5), (java.awt.Point) null);
          this.field_c = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6), var7, false, new Hashtable()));
          this.field_m = param3;
          this.b(15100);
          return;
        }
    }
}
