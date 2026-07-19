/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class me extends ha {
    private java.awt.Component field_l;

    final void a(int param0, java.awt.Component param1, int param2, byte param3) {
        java.awt.image.DataBufferInt var5 = null;
        java.awt.image.DirectColorModel var6 = null;
        java.awt.image.WritableRaster var7 = null;
        java.awt.Component var8 = null;
        this.field_e = new int[param0 * param2 - -1];
        this.field_i = param2;
        if (param3 > -51) {
          var8 = (java.awt.Component) null;
          this.a(78, (java.awt.Component) null, 73, (byte) 87);
          this.field_a = param0;
          var5 = new java.awt.image.DataBufferInt(this.field_e, this.field_e.length);
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6)).createCompatibleSampleModel(this.field_a, this.field_i), (java.awt.image.DataBuffer) ((Object) var5), (java.awt.Point) null);
          this.field_d = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6), var7, false, new Hashtable()));
          this.field_l = param1;
          this.a(19692);
          return;
        } else {
          this.field_a = param0;
          var5 = new java.awt.image.DataBufferInt(this.field_e, this.field_e.length);
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6)).createCompatibleSampleModel(this.field_a, this.field_i), (java.awt.image.DataBuffer) ((Object) var5), (java.awt.Point) null);
          this.field_d = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6), var7, false, new Hashtable()));
          this.field_l = param1;
          this.a(19692);
          return;
        }
    }

    public me() {
    }

    final void a(java.awt.Graphics param0, boolean param1, int param2, int param3) {
        boolean discarded$10 = param0.drawImage(this.field_d, param3, param2, (java.awt.image.ImageObserver) ((Object) this.field_l));
        if (param1) {
            this.field_l = (java.awt.Component) null;
        }
    }
}
