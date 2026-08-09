/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ff extends sm {
    private java.awt.Component field_j;

    final void a(int param0, byte param1, int param2, java.awt.Graphics param3) {
        param3.drawImage(this.field_c, param0, param2, (java.awt.image.ImageObserver) ((Object) this.field_j));
        if (param1 >= -124) {
            java.awt.Component var6 = (java.awt.Component) null;
            this.a(28, (java.awt.Component) null, -28, -127);
        }
    }

    final void a(int param0, java.awt.Component param1, int param2, int param3) {
        java.awt.image.DataBufferInt var5;
        java.awt.image.DirectColorModel var6;
        java.awt.image.WritableRaster var7;
        this.field_e = param0;
        if (param2 != 9484) {
          this.field_j = (java.awt.Component) null;
          this.field_b = param3;
          this.field_f = new int[1 + param3 * param0];
          var5 = new java.awt.image.DataBufferInt(this.field_f, this.field_f.length);
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6)).createCompatibleSampleModel(this.field_b, this.field_e), (java.awt.image.DataBuffer) ((Object) var5), (java.awt.Point) null);
          this.field_c = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6), var7, false, new Hashtable()));
          this.field_j = param1;
          this.b((byte) 116);
          return;
        } else {
          this.field_b = param3;
          this.field_f = new int[1 + param3 * param0];
          var5 = new java.awt.image.DataBufferInt(this.field_f, this.field_f.length);
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6)).createCompatibleSampleModel(this.field_b, this.field_e), (java.awt.image.DataBuffer) ((Object) var5), (java.awt.Point) null);
          this.field_c = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6), var7, false, new Hashtable()));
          this.field_j = param1;
          this.b((byte) 116);
          return;
        }
    }

    public ff() {
    }
}
