/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rj extends eh {
    private java.awt.Component field_k;

    final void a(int param0, byte param1, int param2, java.awt.Component param3) {
        java.awt.image.DataBufferInt var5 = null;
        java.awt.image.DirectColorModel var6 = null;
        java.awt.image.WritableRaster var7 = null;
        java.awt.Graphics var8 = null;
        if (param1 != 83) {
          var8 = (java.awt.Graphics) null;
          this.a((byte) -42, (java.awt.Graphics) null, -83, -93);
          this.field_g = param0;
          this.field_i = param2;
          this.field_f = new int[param2 * param0 + 1];
          var5 = new java.awt.image.DataBufferInt(this.field_f, this.field_f.length);
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6)).createCompatibleSampleModel(this.field_g, this.field_i), (java.awt.image.DataBuffer) ((Object) var5), (java.awt.Point) null);
          this.field_c = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6), var7, false, new Hashtable()));
          this.field_k = param3;
          this.a((byte) -97);
          return;
        } else {
          this.field_g = param0;
          this.field_i = param2;
          this.field_f = new int[param2 * param0 + 1];
          var5 = new java.awt.image.DataBufferInt(this.field_f, this.field_f.length);
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6)).createCompatibleSampleModel(this.field_g, this.field_i), (java.awt.image.DataBuffer) ((Object) var5), (java.awt.Point) null);
          this.field_c = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6), var7, false, new Hashtable()));
          this.field_k = param3;
          this.a((byte) -97);
          return;
        }
    }

    final void a(byte param0, java.awt.Graphics param1, int param2, int param3) {
        boolean discarded$9 = param1.drawImage(this.field_c, param2, param3, (java.awt.image.ImageObserver) ((Object) this.field_k));
        if (param0 <= 38) {
            java.awt.Graphics var6 = (java.awt.Graphics) null;
            this.a((byte) -30, (java.awt.Graphics) null, -118, 16);
        }
    }

    public rj() {
    }
}
