/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bl extends qd {
    private java.awt.Component field_i;

    final void a(java.awt.Graphics param0, int param1, byte param2, int param3) {
        boolean discarded$9 = param0.drawImage(this.field_b, param1, param3, (java.awt.image.ImageObserver) ((Object) this.field_i));
        if (param2 >= -56) {
            java.awt.Graphics var6 = (java.awt.Graphics) null;
            this.a((java.awt.Graphics) null, -17, (byte) -63, -24);
        }
    }

    final void a(int param0, java.awt.Component param1, byte param2, int param3) {
        java.awt.image.DataBufferInt var5 = null;
        java.awt.image.DirectColorModel var6 = null;
        java.awt.image.WritableRaster var7 = null;
        java.awt.Component var8 = null;
        this.field_g = param3;
        if (param2 >= -91) {
          var8 = (java.awt.Component) null;
          this.a(-82, (java.awt.Component) null, (byte) -8, -67);
          this.field_c = new int[param3 * param0 + 1];
          this.field_d = param0;
          var5 = new java.awt.image.DataBufferInt(this.field_c, this.field_c.length);
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6)).createCompatibleSampleModel(this.field_g, this.field_d), (java.awt.image.DataBuffer) ((Object) var5), (java.awt.Point) null);
          this.field_b = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6), var7, false, new Hashtable()));
          this.field_i = param1;
          this.a((byte) 109);
          return;
        } else {
          this.field_c = new int[param3 * param0 + 1];
          this.field_d = param0;
          var5 = new java.awt.image.DataBufferInt(this.field_c, this.field_c.length);
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6)).createCompatibleSampleModel(this.field_g, this.field_d), (java.awt.image.DataBuffer) ((Object) var5), (java.awt.Point) null);
          this.field_b = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6), var7, false, new Hashtable()));
          this.field_i = param1;
          this.a((byte) 109);
          return;
        }
    }

    public bl() {
    }
}
