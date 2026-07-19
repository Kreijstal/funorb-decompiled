/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class kn extends he {
    private java.awt.Component field_l;

    final void a(byte param0, java.awt.Graphics param1, int param2, int param3) {
        if (param0 != -51) {
            return;
        }
        boolean discarded$0 = param1.drawImage(this.field_b, param2, param3, (java.awt.image.ImageObserver) ((Object) this.field_l));
    }

    final void a(int param0, byte param1, java.awt.Component param2, int param3) {
        java.awt.image.DataBufferInt var5 = null;
        java.awt.image.DirectColorModel var6 = null;
        java.awt.image.WritableRaster var7 = null;
        java.awt.Component var8 = null;
        this.field_i = param3;
        this.field_a = new int[param0 * param3 - -1];
        this.field_c = param0;
        var5 = new java.awt.image.DataBufferInt(this.field_a, this.field_a.length);
        if (param1 >= -55) {
          var8 = (java.awt.Component) null;
          this.a(105, (byte) 99, (java.awt.Component) null, -82);
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6)).createCompatibleSampleModel(this.field_c, this.field_i), (java.awt.image.DataBuffer) ((Object) var5), (java.awt.Point) null);
          this.field_b = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6), var7, false, new Hashtable()));
          this.field_l = param2;
          this.b((byte) 125);
          return;
        } else {
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6)).createCompatibleSampleModel(this.field_c, this.field_i), (java.awt.image.DataBuffer) ((Object) var5), (java.awt.Point) null);
          this.field_b = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6), var7, false, new Hashtable()));
          this.field_l = param2;
          this.b((byte) 125);
          return;
        }
    }

    public kn() {
    }
}
