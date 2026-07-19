/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hg extends ba {
    private java.awt.Component field_j;

    final void a(int param0, java.awt.Component param1, int param2, int param3) {
        java.awt.image.DataBufferInt var5 = null;
        java.awt.image.DirectColorModel var6 = null;
        java.awt.image.WritableRaster var7 = null;
        if (param3 >= -10) {
          this.field_j = (java.awt.Component) null;
          this.field_i = param2;
          this.field_g = param0;
          this.field_e = new int[param2 * param0 + 1];
          var5 = new java.awt.image.DataBufferInt(this.field_e, this.field_e.length);
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6)).createCompatibleSampleModel(this.field_g, this.field_i), (java.awt.image.DataBuffer) ((Object) var5), (java.awt.Point) null);
          this.field_b = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6), var7, false, new Hashtable()));
          this.field_j = param1;
          this.a((byte) 126);
          return;
        } else {
          this.field_i = param2;
          this.field_g = param0;
          this.field_e = new int[param2 * param0 + 1];
          var5 = new java.awt.image.DataBufferInt(this.field_e, this.field_e.length);
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6)).createCompatibleSampleModel(this.field_g, this.field_i), (java.awt.image.DataBuffer) ((Object) var5), (java.awt.Point) null);
          this.field_b = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6), var7, false, new Hashtable()));
          this.field_j = param1;
          this.a((byte) 126);
          return;
        }
    }

    final void a(int param0, int param1, java.awt.Graphics param2, int param3) {
        boolean discarded$10 = param2.drawImage(this.field_b, param0, param3, (java.awt.image.ImageObserver) ((Object) this.field_j));
        if (param1 != 7) {
            java.awt.Component var6 = (java.awt.Component) null;
            this.a(-88, (java.awt.Component) null, 65, 59);
        }
    }

    public hg() {
    }
}
